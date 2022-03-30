import java.util.Random;

public class RoomResources {
	private static int maxEnemies = 1, maxNPCs = 5, maxPotions = 1, maxWeapons = 1, maxPotionHealth = 10, maxPotionSpeed = 10;	//feel free to change these values
	
	private int numEnemies, numNPCs, numPotions, numWeapons;
	
	private Potion potion;
	
	private Weapon weapon;
	
	private Enemy enemy;
	
	private NPCs[] NPCArray = new NPCs[20];
	
	public RoomResources() {
		Random rand = new Random(); // instance of random class
		numEnemies = rand.nextInt(maxEnemies+1);		// set the number of enemies to a random number between zero and maxEnemies
		numNPCs = rand.nextInt(maxNPCs+1);				// set the number of NPCs to a random number between zero and maxNPCs
		// this is assuming you can have only one potion and one weapon each in a room
		
		numPotions = rand.nextInt(maxPotions+1);		// set the number of potions to a random number between zero and maxPotions
		numWeapons = rand.nextInt(maxWeapons+1);		// set the number of weapons to a random number between zero and maxWeapons
		
		// create an array of instances of Enemy
		if(numEnemies != 0) {
			enemy = new Enemy();
		} else {
			enemy = new Enemy(0, 0, 0);
		}
		
		// create an array of instances of NPCs
		for(int j = 0; j < numNPCs; j++) {
			NPCArray[j] = new NPCs();
		}
		
		if(numPotions != 0) {
			potion = new Potion();		// create a new potion
		} else {
			potion = new Potion(0,0, "No potion");
		}
		
		if(numWeapons != 0) {
			weapon = new Weapon();		// create a new weapon
		} else {
			weapon = new Weapon(0, "No weapon");
		}
	}
	
	public RoomResources(Potion p, Weapon w, Enemy e, NPCs[] n) {
		potion = p;
		weapon = w;
		enemy = e;
		NPCArray = n;
	}
	
	public Potion getPotion() {
		return potion;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}
	public NPCs[] getNPCArray() {
		return NPCArray;
	}
	public void setPotion(int x) {
		numPotions = x;
	}
	public int getnumPotions() {
		return numPotions;
	}
	
	

}