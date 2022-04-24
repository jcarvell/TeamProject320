package Database_Model;

public class Player {
	private String playerName;
	private int health;  
	private int speed;
	private int strength;
	private String weaponName;
	private int weaponStrength;
	private String potionName;
	private int numPotions;
	private int potionHealth;
	private int potionSpeed;
	private String enemyName;
	private int enemyStrength;
	private int enemySpeed;
	private int enemyHealth;
	private String currentRoomName;
	
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
	
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	
	public String getWeaponName() {
		return weaponName;
	}
	
	public void setWeaponStrength(int weaponStrength) {
		this.weaponStrength = weaponStrength;
	}
	
	public int getWeaponStrength() {
		return weaponStrength;
	}
	
	public void setPotionName(String potionName) {
		this.potionName = potionName;
	}
	
	public String getPotionName() {
		return potionName;
	}
	
	public void setNumPotions(int numPotions) {
		this.numPotions = numPotions;
	}
	
	public int getNumPotions() {
		return numPotions;
	}
	
	public void setPotionHealth(int potionHealth) {
		this.potionHealth = potionHealth;
	}
	
	public int getPotionHealth() {
		return potionHealth;
	}
	
	public void setPotionSpeed(int potionSpeed) {
		this.potionSpeed = potionSpeed;
	}
	
	public int getPotionSpeed() {
		return potionSpeed;
	}
	
	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}
	
	public String getEnemyName() {
		return enemyName;
	}
	
	public void setEnemyStrength(int enemyStrength) {
		this.enemyStrength = enemyStrength;
	}
	
	public int getEnemyStrength() {
		return enemyStrength;
	}
	
	public void setEnemyHealth(int enemyHealth) {
		this.enemyHealth = enemyHealth;
	}
	
	public int getEnemyHealth() {
		return enemyHealth;
	}
	
	public void setEnemySpeed(int enemySpeed) {
		this.enemySpeed = enemySpeed;
	}
	
	public int getEnemySpeed() {
		return enemySpeed;
	}
	
	public void setCurrentRoomName(String currentRoomName) {
		this.currentRoomName = currentRoomName;
	}
	
	public String getCurrentRoomName() {
		return currentRoomName;
	}
	
}
