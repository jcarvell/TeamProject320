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
	
	public void createTables() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				PreparedStatement stmt1 = null;
				PreparedStatement stmt2 = null;
				PreparedStatement stmt3 = null;				
			
				try {
					stmt1 = conn.prepareStatement(
						"create table authors (" +
						"	author_id integer primary key " +
						"		generated always as identity (start with 1, increment by 1), " +									
						"	lastname varchar(40)," +
						"	firstname varchar(40)" +
						")"
					);	
					stmt1.executeUpdate();
					
					System.out.println("Authors table created");
					
					stmt2 = conn.prepareStatement(
							"create table books (" +
							"	book_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +
//							"	author_id integer constraint author_id references authors, " +  	// this is now in the BookAuthors table
							"	title varchar(70)," +
							"	isbn varchar(15)," +
							"   published integer" +
							")"
					);
					stmt2.executeUpdate();
					
					System.out.println("Books table created");					
					
					stmt3 = conn.prepareStatement(
							"create table bookAuthors (" +
							"	book_id   integer constraint book_id references books, " +
							"	author_id integer constraint author_id references authors " +
							")"
					);
					stmt3.executeUpdate();
					
					System.out.println("BookAuthors table created");					
										
					return true;
				} finally {
					DBUtil.closeQuietly(stmt1);
					DBUtil.closeQuietly(stmt2);
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