package Database_Model;

import teamproject.cs320.Potion;
import teamproject.cs320.Room;
import teamproject.cs320.Weapon;

public class Player {
	private String playerName;
	private int health;  
	private int speed;
	private int strength;
	private Weapon weapon;
	private Potion[] potion;
	private Room currentRoom;
	
	public Player() {
		
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setPotion(Potion[] potion) {
		this.potion = potion;
	}
	
	public Potion[] getPotion() {
		return potion;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
}
