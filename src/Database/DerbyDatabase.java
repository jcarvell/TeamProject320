package Database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Database_Model.Player;
import edu.ycp.cs320.booksdb.model.Author;
import edu.ycp.cs320.booksdb.model.Book;
import edu.ycp.cs320.booksdb.model.Pair;
import edu.ycp.cs320.booksdb.persist.DBUtil;
import edu.ycp.cs320.booksdb.persist.DerbyDatabase;
import edu.ycp.cs320.booksdb.persist.DerbyDatabase.Transaction;
import teamproject.cs320.Potion;
import teamproject.cs320.Room;
import teamproject.cs320.Weapon;


public class DerbyDatabase implements IDatabase {
	static {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (Exception e) {
			throw new IllegalStateException("Could not load Derby driver");
		}
	}
	
	private interface Transaction<ResultType> {
		public ResultType execute(Connection conn) throws SQLException;
	}

	private static final int MAX_ATTEMPTS = 10;

	
	// save a new game state
	public String insertPlayer(String name, int health, int speed, int strength, String weaponName, int weaponStrength, String potionName, int potionHealth, int potionSpeed, String currentRoomName, String enemyName, int enemyHealth, int enemySpeed, int enemyStrength) {
		return executeTransaction(new Transaction<String>() {
			@Override
			public String execute(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				PreparedStatement deleteSmt = null;
				ResultSet deleteSet = null;
				
				try {
					// delete the player's previous saved game (since it is the same game but without their current progress)
					deleteSmt = conn.prepareStatement(
							"delete from player"
							+ "where player.name = ?"
					);
					deleteSmt.setString(1, name);
			
					deleteSet = deleteSmt.executeQuery();
				
					
					// check that it delete correctly
					// add later, using Ed's find player function
					
					// insert the player's current game state
					stmt = conn.prepareStatement(
							"insert into player (player.name, player.health, player.speed, player.strength, player.weaponName, "
							+ "player.weaponStrength,player.potionName, player.potionHealth, player.potionSpeed, player.currentRoomName, "
							+ "player.enemyName, player.enemyStrength, player.enemySpeed, player.enemyHealth) " 
							+"  values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) " 
							
					);
					stmt.setString(1, name);
					stmt.setInt(2, health);
					stmt.setInt(3, speed);
					stmt.setInt(4, strength);
					stmt.setString(5, weaponName);
					stmt.setInt(6, weaponStrength);
					stmt.setString(7, potionName);
					stmt.setInt(8, potionHealth);
					stmt.setInt(9, potionSpeed);
					stmt.setString(10, currentRoomName);
					stmt.setString(11, enemyName);
					stmt.setInt(12, enemyStrength);
					stmt.setInt(13, enemySpeed);
					stmt.setInt(14, enemyHealth);
					
					
					stmt.executeUpdate();
					
					// I don't think it has anything it needs to return but I couldn't figure out how to get the function return type to be void
					return name;
					
				} finally {
					DBUtil.closeQuietly(deleteSet);
					DBUtil.closeQuietly(deleteSmt);
					DBUtil.closeQuietly(stmt);
				}
			}
		});
	}
	

	private void loadPlayer(Player player, ResultSet resultSet, int index) throws SQLException {
		player.setPlayerName(resultSet.getString(index++));
		player.setHealth(resultSet.getInt(index++));
		player.setSpeed(resultSet.getInt(index++));
		player.setStrength(resultSet.getInt(index++));
		player.setWeaponName(resultSet.getString(index++));
		player.setWeaponStrength(resultSet.getInt(index++));
		player.setPotionName(resultSet.getString(index++));
		player.setPotionHealth(resultSet.getInt(index++));
		player.setPotionSpeed(resultSet.getInt(index++));
		player.setCurrentRoomName(resultSet.getString(index++));
		player.setEnemyName(resultSet.getString(index++));
		player.setEnemyStrength(resultSet.getInt(index++));
		player.setEnemySpeed(resultSet.getInt(index++));
		player.setEnemyHealth(resultSet.getInt(index++));
		
		
	}
	


	// transaction that deletes Player from Library
	@Override
	public List<Player> removePlayer(final String name) {
		return executeTransaction(new Transaction<List<Player>>() {
			@Override
			public List<Player> execute(Connection conn) throws SQLException {
				PreparedStatement stmtDelete = null;
				PreparedStatement stmt2 = null;					
						
				ResultSet resultSet2    = null;
				
				try {							
					// delete entries in Player table for this name
					stmtDelete = conn.prepareStatement(
							"delete from players " +
							"  where title = ? "
					);
					
					// delete the Book entries from the DB for this title
					stmtDelete.setString(1, name);
					stmtDelete.executeQuery();
					
					System.out.println("Deleted book(s) with title <" + name + "> from DB");									
					
					// look at remaining players
					stmt2 = conn.prepareStatement(
							"select * from players "
					);
					
					resultSet2 = stmt2.executeQuery();
					
					// assemble list of remaining Players from query
					List<Player> players = new ArrayList<Player>();					
				
					while (resultSet2.next()) {
						Player player = new Player();
						loadPlayer(player, resultSet2, 1);
						player.add(player);
					}
					
					
					return players;
				} finally {
					
					DBUtil.closeQuietly(resultSet2);
					DBUtil.closeQuietly(stmtDelete);
					DBUtil.closeQuietly(stmt2);				
				}
			}
		});
	}

	

	
	private List<Player> executeTransaction(Transaction<List<Player>> transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	private String executeTransaction(Transaction<String> transaction) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Player> retrieveGameStateByName(final String name) {
		return executeTransaction(new Transaction<List<Player>>() {
			@Override
			public List<Player> execute(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;
				
				try {
					stmt = conn.prepareStatement(
							"select * from player "+
							"player.name=?"
					);
					stmt.setString(1, name);
					
					List<Player> result = new ArrayList<Player>();
					
					resultSet = stmt.executeQuery();
					
					// for testing that a result was returned
					Boolean found = false;
					
					while (resultSet.next()) {
						found = true;
						
						Player player = new Player();
						loadPlayer(player, resultSet, 1);
						
						result.add(player);
					}
					
					// check if the title was found
					if (!found) {
						System.out.println("<" + name + "> was not found in the player table");
					}
					
					return result;
				} finally {
					DBUtil.closeQuietly(resultSet);
					DBUtil.closeQuietly(stmt);
				}
			}
		});
	}
	//This is a function
	public void createTables() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				PreparedStatement stmt1 = null;		
			
				try {
					stmt1 = conn.prepareStatement(
						"create table player (" +
						"	name string primary key " +
						//Primary might break since there is no incrementing of id since the key is a string -Ed			
						"	health integer," +
						"	speed integer," +
						"	strength integer," +
						"	weoponName varchar(15)," +
						"	weoponStrength integer," +
						"	potionName varchar(15)," +
						"	potionHealth integer," +
						"	potionSpeed integer," +
						"	roomName varchar(15)," +
						"	enemyName varchar(15)," +
						"	enemyStrength integer," +
						"	enemySpeed integer," +
						"	enemyHealth integer," +
						
						")"
					);	
					
					stmt1.executeUpdate();
					
					System.out.println("Player table created");
									
										
					return true;
				} finally {
					DBUtil.closeQuietly(stmt1);
				}
			}
		});
	}
	

	// The main method creates the database tables and loads the initial data.
	public static void main(String[] args) throws IOException {
		System.out.println("Creating tables...");
		DerbyDatabase db = new DerbyDatabase();
		db.createTables();
		
		System.out.println("Loading initial data...");
		db.loadInitialData();
		
		System.out.println("Library DB successfully initialized!");
	}
}