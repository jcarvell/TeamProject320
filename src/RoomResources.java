import java.util.Random;

public class RoomResources {
	private static int maxEnemies = 5, maxNPCs = 5, maxPotions = 1, maxWeapons = 1;		//feel free to change these values
	
	private int numEnemies, numNPCs;
	
	private Potion potion;
	
	private Weapon weapon;
	
	private Enemy[] enemyArray;
	
	private NPCs[] NPCArray;
	
	
	public RoomResources() {
		
	}
	
	public Potion getPotion() {
		return potion;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	
	public Enemy[] getEnemies() {
		return enemyArray;
	}
	public NPCs[] getNPCArray() {
		return NPCArray;
	}

}