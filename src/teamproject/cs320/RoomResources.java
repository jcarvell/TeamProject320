package teamproject.cs320;
import java.util.Random;
import java.util.Scanner;


public class RoomResources {
	private static int maxEnemies = 1, maxNPCs = 5, maxPotions = 5, maxWeapons = 1, maxPotionHealth = 10, maxPotionSpeed = 10;	//feel free to change these values
	
	private int numEnemies, numNPCs, numPotions, numWeapons;
	
	private Potion potion;
	
	private Weapon weapon;
	
	private Enemy enemy;
	
	private NPCs npc;
	
	Scanner in = new Scanner (System.in);
	
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
			enemy = new Enemy(0, 0, 0, "No enemy");
		}
		
		// create an array of instances of NPCs1

		
		if(numPotions != 0) {
			potion = new Potion();		// create a new potion
		} else {
			potion = new Potion(0,0, "No potion");
		}
		

		npc = new NPCs();

		
		
		
		if(numWeapons != 0) {
			weapon = new Weapon();		// create a new weapon
		} else {
			weapon = new Weapon(0, "No weapon");
		}
	}
	
	public RoomResources(Potion p, Weapon w, Enemy e,NPCs n) {
		potion = p;
		weapon = w;
		enemy = e;
		npc = n;
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
	public NPCs getNPCs() {
		return npc;
	}
	public void setPotion(int x) {
		numPotions = x;
	}
	public int getnumPotions() {
		return numPotions;
	}
	
	public void roomPrint() {
		System.out.println(weapon.getName());
		System.out.println(potion.getName());
	}
	
	
	public void noEnemyRoom(User user, Room choice1) {
		System.out.println("There is no enemy in this room");
		// System.out.println("This room is called: " + choice1.getName());
		//need to change dialogue. Pass variable choice. 
		//Why is this printing HELLO!!!!!!!!!!!!!!!!!!!!!
		
		npc.setRoomName(choice1.getName());
		npc.printNPCinteraction(user);
		
		System.out.println("There are some resources in the area would you like to check them out?");
		int npcChoice = in.nextInt();
		if(npcChoice == 1 ) {
			//NO
			roomPrint();
			System.out.println("Would you like to take either of the items or would you like to leave?");
			int resourceChoice = in.nextInt();
			if(resourceChoice == 1 && getWeapon().getName() != "No Weapon") {
				if(getWeapon().getStrengthBuff() < user.getStrength()) {
					System.out.println("Are you sure you would like to pick this up?");
					System.out.println("Your current strength is " + user.getStrength() + " and the " + getWeapon().getName() + "only has " + getWeapon().getStrengthBuff());
					int weaponpickupChoice = in.nextInt();
					if(weaponpickupChoice == 1) {
						resourceChoice = 1;
					}else {
						resourceChoice = 0;
					}
				}
				System.out.println("Your strength was: " + user.getStrength());
				user.setStrength(getWeapon().getStrengthBuff());
				System.out.println("Now your new strength is: " + user.getStrength());
				System.out.println("Your weapon was: " + user.currentWeaponName());
				System.out.println("Your strength was: " + user.getStrength());
				user.setCurrentWeapon(getWeapon().getName());
				user.setStrength(getWeapon().getStrengthBuff());
				System.out.println("Now your new weapon name is: " + user.currentWeaponName());
				System.out.println("Now your new strength is: " + user.getStrength());

			}
			

		}else if(npcChoice == 2 ){
			System.out.println(getWeapon().getName());
		}else {
			System.out.println("");
	}
}
	public void calculatePoints(User user) {
		int x = enemy.getPoints();
		int y = user.getUserPoints();
		user.setPoints(x + y);
		System.out.println("Your points before the battle where: " + y);
		System.out.println("The enemy: " + enemy.getName() + " awarded you " + x + " points.");
		System.out.println("Your new points total is: " + user.getUserPoints());
		
	}
	
}