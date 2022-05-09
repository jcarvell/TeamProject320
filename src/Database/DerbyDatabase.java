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
				PreparedStatement stmt1 = null;
				PreparedStatement stmt2 = null;
				PreparedStatement stmt3 = null;

				PreparedStatement deleteSmt = null;
				ResultSet deleteSet = null;
				
				try {
					// delete the player's previous saved game (since it is the same game but without their current progress)
					/*deleteSmt = conn.prepareStatement(
							"delete from players"
							+ "where player.name = ?"
					);
					deleteSmt.setString(1, name);
			
					deleteSet = deleteSmt.executeQuery();
				*/
					
					// check that it delete correctly
					// add later, using Ed's find player function
					
					// insert the player's current game state
					stmt1 = conn.prepareStatement(
							// issue: DerbyDatabase is not initializing the player table (right now called playerList)
							"insert into players (players.name, players.health, players.speed, players.strength)"
							+ "values(?,?,?,?)"
							);
					System.out.println(name + " " + health + " " + speed + " " + strength + "");
					stmt1.setString(1, name);
					stmt1.setInt(2, health);
					stmt1.setInt(3, speed);
					stmt1.setInt(4, strength);
	
					stmt1.executeUpdate();

					stmt2 = conn.prepareStatement(
							 " insert into item( item.weaponName, item.weaponStrength ,item.potionName , item.potionHealth, item.potionSpeed)"
							+ "values(?,?,?,?,?)"
							);
					System.out.println(weaponName + "" + weaponStrength + "" + potionName + "" + potionHealth + ""  + potionSpeed + "");				
					
					
					stmt2.setString(1, weaponName);
					stmt2.setInt(2, weaponStrength);
					stmt2.setString(3, potionName);
					stmt2.setInt(4, potionHealth);
					stmt2.setInt(5, potionSpeed);	
					stmt2.executeUpdate();
				
					stmt3 = conn.prepareStatement(
							"insert into enemy(enemy.roomName, enemy.enemyName, enemy.enemyStrength, enemy.enemySpeed, enemy.enemyHealth) " 
							+"  values(?, ?, ?, ?, ?) " 
					);
					
					stmt3.setString(1, currentRoomName);
					stmt3.setString(2, enemyName);
					stmt3.setInt(3, enemyStrength);
					stmt3.setInt(4, enemySpeed);
					stmt3.setInt(5, enemyHealth);
					stmt3.executeUpdate();


					
					// I don't think it has anything it needs to return but I couldn't figure out how to get the function return type to be void
					return name;
					
				} finally {
					DBUtil.closeQuietly(deleteSet);
					DBUtil.closeQuietly(deleteSmt);
					DBUtil.closeQuietly(stmt1);
					DBUtil.closeQuietly(stmt2);
					DBUtil.closeQuietly(stmt3);
				}
			}
		});
	}
	

	private void loadPlayer(Player player, ResultSet resultSet, int index) throws SQLException {
		System.out.println("Starting printing here: ");


		player.setplayerID(resultSet.getInt(index++));
		player.setPlayerName(resultSet.getString(index++));
		player.setHealth(resultSet.getInt(index++));
		player.setSpeed(resultSet.getInt(index++));
		player.setStrength(resultSet.getInt(index++));
		player.setitemID(resultSet.getInt(index++));
		
		System.out.println(resultSet.getInt(index++));
		
		player.setWeaponName(resultSet.getString(index++));
		player.setWeaponStrength(resultSet.getInt(index++));
		player.setPotionName(resultSet.getString(index++));
		player.setPotionHealth(resultSet.getInt(index++));
		player.setPotionSpeed(resultSet.getInt(index++));
		
		player.setenemyID(resultSet.getInt(index++));
		
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
							"delete players.* , item.*, enemy.*"
							+"  where players.name = ? "
					);
					
					// delete the Book entries from the DB for this title
					stmtDelete.setString(1, name);
					stmtDelete.executeQuery();
					
					System.out.println("Deleted players with name <" + name + "> from DB");									
					
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
						players.add(player);
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


	public List<Player> retrieveGameStateByName(final String name) {
		return executeTransaction(new Transaction<List<Player>>() {
			@Override
			public List<Player> execute(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;
				
				try {
					stmt = conn.prepareStatement(
							/*
							"select player.name, player.health, player.speed, player.strength, player.weoponName, "
							+ "player.weoponStrength,player.potionName, player.potionHealth, player.potionSpeed, player.RoomName,"
							+ "player.enemyName, player.enemyStrength, player.enemySpeed, player.enemyHealth"
							+ "where player.name = ?"
							*/
							
							"select players.*, item.*, enemy.*"
							+ "from players, item, enemy "
							//+ "where players.player_id = item.player_id and item.item_id = enemy.item_id and "
							+ " where players.name = ?"
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
	
	// wrapper SQL transaction function that calls actual transaction function (which has retries)
	public<ResultType> ResultType executeTransaction(Transaction<ResultType> txn) {
		try {
			return doExecuteTransaction(txn);
		} catch (SQLException e) {
			throw new PersistenceException("Transaction failed", e);
		}
	}
	
	// SQL transaction function which retries the transaction MAX_ATTEMPTS times before failing
	public<ResultType> ResultType doExecuteTransaction(Transaction<ResultType> txn) throws SQLException {
		Connection conn = connect();
		
		try {
			int numAttempts = 0;
			boolean success = false;
			ResultType result = null;
			
			while (!success && numAttempts < MAX_ATTEMPTS) {
				try {
					result = txn.execute(conn);
					conn.commit();
					success = true;

				} catch (SQLException e) {
					if (e.getSQLState() != null && e.getSQLState().equals("41000")) {
						// Deadlock: retry (unless max retry count has been reached)
						numAttempts++;
					} else {
						// Some other kind of SQLException
						throw e;
					}
				}
			}
			
			if (!success) {
				throw new SQLException("Transaction failed (too many retries)");
			}
			
			// Success!
			return result;
		} finally {
			DBUtil.closeQuietly(conn);
		}
	}
	
	private Connection connect() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:C:/CS320-2022-LibraryExample-DB/library.db;create=true");		
		
		// Set autocommit() to false to allow the execution of
		// multiple queries/statements as part of the same transaction.
		conn.setAutoCommit(false);
		
		return conn;
	}
	//Maybe use to get rid of the table. 
	public void showTables() {
		executeTransaction(new Transaction<Boolean>() {
			
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				PreparedStatement stmt1 = null;
				try {
					stmt1= conn.prepareStatement(
							"select * from players"
							);
					return true;
				}finally{
					stmt1.executeUpdate();
					
					System.out.println("Players table created");
					DBUtil.closeQuietly(stmt1);
				}
				}
			});}
	
	//This is a function
	public void createTables() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				PreparedStatement stmt1 = null;		
				PreparedStatement stmt2 = null;	
				PreparedStatement stmt3 = null;	
			
				try {
					stmt1 = conn.prepareStatement(
						" create table players(" 	 +
						"	player_id integer primary key " +
						"		generated always as identity (start with 1, increment by 1), " +
						"	name varchar(15), "		 +
						"	health integer," 		 +
						"	speed integer," 		 +
						"	strength integer" 		 +
						")"
					);	
					
					stmt1.executeUpdate();
					
					System.out.println("Players table created");
									
					stmt2 = conn.prepareStatement(
							
							" create table item (" 	 +
							"	item_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +
							"	player_id integer constraint player_id references players, " +
				
							"	weaponName varchar(30)," +
							"	weaponStrength integer," +
							"	potionName varchar(30)," +
							"	potionHealth integer,"   +
							"	potionSpeed integer"    +
							")"
						);	
						
						stmt2.executeUpdate();
						
						System.out.println("Item table created");
						
						stmt3 = conn.prepareStatement(
								
								" create table enemy(" 	 +
								"	enemy_id integer primary key " +
								"		generated always as identity (start with 1, increment by 1), " +
								"	item_id integer constraint item_id references item, " +
								
								"	roomName varchar(30),"   +
								"	enemyName varchar(15),"  +
								"	enemyStrength integer,"  +
								"	enemySpeed integer," 	 +
								"	enemyHealth integer" 	 +	
								")"
							);	


							stmt3.executeUpdate();
							
							System.out.println("Enemy table created");
					return true;
				} finally {
					DBUtil.closeQuietly(stmt1);
					DBUtil.closeQuietly(stmt2);
					DBUtil.closeQuietly(stmt3);

				}
			}
		});
	}
	
	public void loadInitialData() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				List<Player> playerList;
				
				
				try {
					playerList     = InitialData.getPlayer();
									
				} catch (IOException e) {
					throw new SQLException("Couldn't read initial data", e);
				}

				PreparedStatement insertPlayer     = null;
				

				try {
					// Populating players table
					insertPlayer = conn.prepareStatement(
							"insert into player (player.name, player.health, player.speed, player.strength, player.weaponName, "
									+ "player.weaponStrength,player.potionName, player.potionHealth, player.potionSpeed, player.currentRoomName, "
									+ "player.enemyName, player.enemyStrength, player.enemySpeed, player.enemyHealth) " );
					for (Player player : playerList) {
						insertPlayer.setString(1, player.getPlayerName());
						insertPlayer.setInt(2, player.getHealth());
						insertPlayer.setInt(3, player.getSpeed());
						insertPlayer.setInt(4, player.getStrength());
						insertPlayer.setString(5, player.getWeaponName());
						insertPlayer.setInt(6, player.getWeaponStrength());
						insertPlayer.setString(7, player.getPotionName());
						insertPlayer.setInt(8, player.getPotionHealth());
						insertPlayer.setInt(9, player.getPotionSpeed());
						insertPlayer.setString(10, player.getCurrentRoomName());
						insertPlayer.setString(11, player.getEnemyName());
						insertPlayer.setInt(12, player.getEnemyStrength());
						insertPlayer.setInt(13, player.getEnemySpeed());
						insertPlayer.setInt(14, player.getEnemyHealth());
					}
					insertPlayer.executeBatch();
					
					System.out.println("Player table populated");
					
					return true;
				} finally {
					DBUtil.closeQuietly(insertPlayer);			
				}
			}
		});
	}
	
	
	// The main method creates the database tables and loads the initial data.
	public static void main(String[] args) throws IOException {
		System.out.println("Creating tables...");
		DerbyDatabase db = new DerbyDatabase();
		// db.dropTables();
		db.createTables();
		
		System.out.println("Loading initial data...");
		db.loadInitialData();
		
		System.out.println("Library DB successfully initialized!");
	}
}