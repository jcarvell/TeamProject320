
public class User {
	private int health, strength, speed;
	
	private Item[] inventory; 
	
	public User(int a,int b,int c) {
		a=health;
		b=strength;
		c=speed;
	}
	
	public void chooseNextRoom() {
		
		
	}
	
	public void itemPickup() {
		
		
	}
	public void fight() {
		
	}
	
	public void flight() {
		
	}
	public Item[] getInventory() {
		return inventory;
	}
	public int getHealth() {
		return health;
	}
	public int getStrength() {
		return strength;
	}
	public int getSpeed() {
		return speed;
	}
	

}
