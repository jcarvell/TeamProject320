package Database;

import java.util.List;

import Database_Model.Player;

public interface IDatabase {

	// public List<Player> retrieve();
	public String insertPlayer(String name, int health, int speed, int strength, String weaponName, int weaponStrength,
			String potionName, int potionHealth, int potionSpeed, String currentRoomName, String enemyName,
			int enemyHealth, int enemySpeed, int enemyStrength);

	public List<Player> retrieveGameStateByName(String name);

	public List<Player> removePlayer(String name);
}
