public class User {
	private int health, strength, speed, armoryLength, stashLength;
	
	private Weapon[] armory;
	private Potion[] stash;
	
	public User(int a,int b,int c) {
		health = a;
		strength = b;
		speed = c;
	}
	
	public void chooseNextRoom() {
		
	}
	
	public void weaponPickup(Weapon grabbedWeapon) {
		armoryLength++;
		armory[armoryLength] = grabbedWeapon;
	}
	public void potionPickup(Potion grabbedPotion) {
		stashLength++;
		stash[stashLength] = grabbedPotion;
	}
	public void fight() {
		
	}
	
	public void flight() {
		
	}
	public Weapon[] getArmory() {
		return armory;
	}
	public Potion[] getStash() {
		return stash;
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
	public int getArmoryLength() {
		return armoryLength;
	}
	public int getStashLength() {
		return stashLength;
	}
	

}
