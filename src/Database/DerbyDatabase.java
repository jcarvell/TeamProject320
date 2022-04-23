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

	
	// transaction that retrieves a Book, and its Author by Title
	@Override
	public List<Player> insertPlayer(String name, int health, int speed, int strength, String weaponName, int weaponStrength, String potionName, int potionHealth, int potionSpeed, String currentRoomName) {
		return executeTransaction(new Transaction<List<Player>>() {
			@Override
			public List<Player> execute(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;
				
				try {
					stmt = conn.prepareStatement(
							"insert into player (player.name, player.health, player.speed, player.strength, player.weaponName, player.weaponStrength,"
							+ "player.potionName, player.potionHealth, player.potionSpeed, player.currentRoomName) " 
							+"  values(?, ?, ?, ?, ?, ?, ?) " 
							
					);
					stmt.setString(1, name);
					stmt.setInt(2, health);
					stmt.setInt(3, speed);
					stmt.setInt(4, strength);
					stmt.setString(5, weaponName);
					stmt.setInt(6, weaponStrength);
					stmt.setString(7, potionName);
					stmt.setInt(8, potionHealth);
					
					List<Player> result = new ArrayList<Player>();
					
					resultSet = stmt.executeQuery();
					
					// for testing that a result was returned
					Boolean found = false;
					
					while (resultSet.next()) {
						found = true;
						
						Author author = new Author();
						loadAuthor(author, resultSet, 1);
						Book book = new Book();
						loadBook(book, resultSet, 4);
						
						result.add(new Pair<Author, Book>(author, book));
					}
					
					// check if the title was found
					if (!found) {
						System.out.println("<" + title + "> was not found in the books table");
					}
					
					return result;
				} finally {
					DBUtil.closeQuietly(resultSet);
					DBUtil.closeQuietly(stmt);
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