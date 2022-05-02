package Database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Database_Model.Player;

public class InitialData {

	// reads initial Author data from CSV file and returns a List of Authors

	// reads initial BookAuthor data from CSV file and returns a List of BookAuthors
	public static List<Player> getPlayer() throws IOException {
		List<Player> playerList = new ArrayList<Player>();
		ReadCSV readPlayers = new ReadCSV("player.csv");
		try {
			// auto-generated primary key for table books
			while (true) {
				List<String> tuple = readPlayers.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Player player = new Player();

				// read book ID from CSV file, but don't use it
				// it's there for reference purposes, just make sure that it is correct
				// when setting up the BookAuthors CSV file

				Integer.parseInt(i.next());
				player.setPlayerName(i.next());
				player.setHealth(Integer.parseInt(i.next()));
				player.setSpeed(Integer.parseInt(i.next()));
				player.setStrength(Integer.parseInt(i.next()));
				player.setWeaponName(i.next());
				player.setWeaponStrength(Integer.parseInt(i.next()));
				player.setPotionName(i.next());
				player.setPotionHealth(Integer.parseInt(i.next()));
				player.setPotionSpeed(Integer.parseInt(i.next()));
				player.setCurrentRoomName(i.next());
				player.setEnemyName(i.next());
				player.setEnemyStrength(Integer.parseInt(i.next()));
				player.setEnemySpeed(Integer.parseInt(i.next()));
				player.setEnemyHealth(Integer.parseInt(i.next()));

				playerList.add(player);
			}
			System.out.println("playerList loaded from CSV file");
			return playerList;
		} finally {
			readPlayers.close();
		}
	}
}