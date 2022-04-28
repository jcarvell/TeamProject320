package Model;

import java.util.Random;
import java.util.Scanner;

import teamproject.cs320.Enemy;
import teamproject.cs320.NPCs;
import teamproject.cs320.Potion;
import teamproject.cs320.Room;
import teamproject.cs320.RoomResources;
import teamproject.cs320.User;
import teamproject.cs320.Weapon;

public class gameModel{
	// Variables From user Class
	//////////////////////////////////////////////////////////////////////////////////////////////////
	private int user_health;
	private int user_strength;
	private int user_speed;
	private int user_Points;
	private String currentWeaponName;
	private int	userChoice1;
	private User user = new User();
	
	// Variables From Enemy Class
	//////////////////////////////////////////////////////////////////////////////////////////////////
	private String enemy_name;
	private int enemy_health;
	private int enemy_strength;
	private int enemy_speed;
	private int randomEnemy;
	private int enemy_Points;
	
	public static final Random RANDOM = new Random();
	public static final String[] names = {"No Enemy","Zombie" , "Alligator" , "Baby" , "King Zombie"};
	public static final int [] enemy_Health = { 0, 50 , 50, 5, 100000 };
	public static final  int [] enemy_Strength = { 0, 10 , 50 , 1, 100 };
	public static final int [] enemy_Speed = { 0, 5 , 1 , 1, 100 };
	private Enemy enemy = new Enemy();
	
	// Variables From the NPC class
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	private String npc; 
	private String dialogue;
	private String roomName;
	Scanner in = new Scanner (System.in);
	private NPCs NPC = new NPCs();
	
	//Variables from Potion Class
	////////////////////////////////////////////////////////////////////////////////////////////////
	private static int maxPotionHealth = 10, maxPotionSpeed = 10; 	// I choose these value arbitrarily, feel free to change them
	
	private int healthIncreaseAmount;
	private int speedIncreaseAmount; 
	private String potion_name;
	private int numofPotions;
	
	String[] potionNames = {"Witch's Brew", "Slug Trouble", "Spooky Scary Potion", "Green Vial", "Blue Vial", "Red potion", "Orange Juice"};
	
	
	
	///////////////////////////////////////////////////////////////////////////////
	//Variables from Room Class
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	private String room_name;
	private String[] room_nameArray = {"Haunted Forest", "Meadow", "Slithering", "Cave", "Mall", "Sewers", "Rooftop"};

	private RoomResources resources;
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int maxEnemies = 1; // Might not be needed
	private static int maxNPCs = 5; //This might not be needed 
	private static int maxPotions = 5;
	private static int maxWeapons = 1;
	// private static int maxPotionHealth = 10;
	// private static int maxPotionSpeed = 10;	//feel free to change these values
	
	private int numEnemies;
	private int numNPCs;
	private int numPotions;
	private int numWeapons;
	
	private Potion potion = new Potion();
	private Weapon weapon = new Weapon();
	private NPCs npcRoom;
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Variables from Weapon Class
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	private int weapon_strengthBuff;
	private String weapon_name;
	String[] weaponNames = { "Gloves" , "Knife", "Machette" , "Handgun" , "Sword" };
	int [] maxWeaponDamage = { 10, 20 , 50 , 500 , 200};
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	public gameModel() {
		
	}
	
	// From User Class
	//////////////////////////////////////////////////////////////////////////////////////
	public User getUser() {
		return user;
	}
	public int getUserHealth(){
		return user_health;
	}
	public void setUserHealth(int x) {
		user_health=x;
	}
	public int getUserStrength() {
		return user_strength;
	}
	public int getUserSpeed() {
		return user_speed;
	}
	public void setUserStrength(int x) {
		user_strength = x;
	}

	public void setUserSpeed(int x) {
		user_speed = x;
	}

	public int getUserPoints() {
		return user_Points;
	}
	public void setUserPoints(int x) {
		user_Points = x;
	}
	public String getcurrentWeaponName() {
		return currentWeaponName;
	}
	public void setCurrentWeaponName(String x) {
		currentWeaponName = x;
	}
	
	public int getUserChoice1() {
		return userChoice1;
	}
	public void setUserChoice1(int choice1) {
		userChoice1 = choice1;
	}
	// From Enemy Class
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Might not need this section
	public void Enemy() {
		
		
		int randomEnemy = RANDOM.nextInt(7);
		if(randomEnemy <= 3) {
			randomEnemy = 0;
		}else {
			randomEnemy -= 3;
		}
		
		enemy_name = names[randomEnemy];
		enemy_health = enemy_Health[randomEnemy];
		enemy_strength = enemy_Strength[randomEnemy];
		enemy_speed = enemy_Speed[randomEnemy];
		enemy_Points = enemy_health;
	}
	//
	
	public int dealDamage(){
		return enemy_strength;
	}
	
	public String get_enemyName() {
		return enemy_name;	
	}
	
	public int get_enemyHealth(){
		return enemy_health;
	}
	public void set_enemyHealth(int x) {
		enemy_health=x;
	}
	
	public int get_enemyStrength(){
		return enemy_strength;
	}
	
	public int get_enemySpeed(){
		return enemy_speed; 
	}
	public int getPoints() {
		return enemy_Points;
	}
	
	//NPC CLASS 
	//////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	public NPCs(String roomName) {
		this.roomName = roomName;
	}
	*/
	
	public void setNPC(String x) {
		npc = x;
	}
	public String getNPC() {
		return npc;
	}
	
	public String getDialogue() {
		return dialogue;
	}
	public void setRoomName(String x) {
		roomName = x;
	}
	
	// Controller function
	public int printNPCinteraction(User user) {
		int R = 0;
		if(roomName == "Meadow"){
			System.out.println("There is a tree in the middle of the meadow with a man standing at the base of the tree.");
			setNPC("Sheep Hearder");
			System.out.println("Would you like to approach the man? ");
			int choice = in.nextInt();
			if(choice == 1) {
				System.out.println(npc + " heals you and wishes you luck. ");
				user.setHealth(100);
				System.out.println("Your health is now 100.");
				R = 1;
			
			}
			else {
				System.out.println();
				R = 0;
			}
		}
		else if(roomName == "Haunted Forest"){
				System.out.println("There is an erie looking figure.");
				setNPC("Vampire");
				System.out.println("Would you like to approach the man? ");
				int choice = in.nextInt();
				if(choice == 1) {
					System.out.println(npc + " attacks you sucks out your blood which drains your health.");
					user.setHealth(user.getHealth() - 10);
					R = 1;
				}
				else {
					System.out.println();
					R = 0;
				}
		}
		else if(roomName == "Slithering Stream"){
			System.out.println("There is an man fishing in the river.");
			setNPC("Fisher");
			System.out.println("Would you like to approach the man? ");
			int choice = in.nextInt();
			if(choice == 1) {
				System.out.println("Hello how are you today?");
				System.out.println("Would you like a fish?");
				int choice2 = in.nextInt();
				if(choice2 == 1 ) {
					System.out.println("You enjoy the wonderful fish. ");
					user.setHealth(user.getHealth() + 20);
					R = 1;
				}
				else {
					System.out.println();
					R = 0;
				}
			}
			else {
				System.out.println();
				R= 0;
			}
	}
		if(roomName == "Cave"){
			System.out.println("You look into the Cave and stare into the dark abyss.");
			setNPC("Bats");
			System.out.println("Would you like to go in the cave? ");
			int choice = in.nextInt();
			if(choice == 1) {
				System.out.println(npc + " come flying out of the cave and scare you. ");
				R = 0;
			}
			else {
				System.out.println();
				R = 0;
			}
		}
		if(roomName == "Mall"){
			System.out.println("You walk into an abandon mall");
			R = 0;

		}
		if(roomName == "Sewers"){
			setNPC("Alligator");
			System.out.println("You drop down into the Sewer");
			System.out.println("You hear a swirlling in the water.");
			System.out.println("You look down and its an Alligator!");
			R = 3;
		}
		else {
			if(roomName == "Rooftop"){
				System.out.println("You look around and feel a cold breeze.");
				setNPC("Heli");
				System.out.println("You hear the sound of a helicopter coming towards you. ");
				System.out.println("Would you like to leave this island and be saved? ");

				int choice = in.nextInt();
				if(choice == 1) {
					System.out.println("You climb into the helicopter and fly away. " );
					R = 4;
				}
				else {
					System.out.println();
					R = 0;
				}
			}
			
		}
		return R;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	// Potion Class
	
	public void Potion(int healthIncrease, int speedIncrease, String z) {
		healthIncreaseAmount = healthIncrease;
		speedIncreaseAmount = speedIncrease;
		potion_name=z;
	}
	
	public void Potion() {
		Random rand = new Random(); // instance of random class
		healthIncreaseAmount = rand.nextInt(maxPotionHealth)+1;	// set the health increase for the potion to a random number between one and maxPotionHealth
		speedIncreaseAmount = rand.nextInt(maxPotionSpeed)+1;		// set the speed increase for the potion to a random number between one and maxPotionSpeed
		potion_name = potionNames[rand.nextInt(7)];		// set the name of the potion to a name in the potionNames array, randomly choosing index 0 through 7
	}
	
	public int getHealthIncreaseAmount(){
		return healthIncreaseAmount;
		
	}
	public int getSpeedIncreaseAmount(){
		return speedIncreaseAmount;	
	}
	public String getPotionName() {
		return potion_name;
	}
	public int getMaxPotionHealthIncrease() {
		return maxPotionHealth;
	}
	public int getMaxPotionSpeedIncrease() {
		return maxPotionSpeed;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	// Room Class
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	public void Room(String n) {
		room_name=n;
		resources = new RoomResources();
	}
	
	// Added this constructor so that the Room() constructor in Game wouldn't have an error
	public void Room() {
		Random rand = new Random(); //instance of random class
		room_name = room_nameArray[rand.nextInt(6)];		// chose one of the names in the nameArray
		resources = new RoomResources();
	}
	
	public void Room(String n, RoomResources r) {
		room_name=n;
		resources = r;
	}
	
	public String randomRoom() {
		Random rand = new Random(); 
		room_name = room_nameArray[rand.nextInt(6)];
		return room_name;
	}
	public String getroom_Name() {
		return room_name;
	}
	public RoomResources getRoomResources() {
		return resources;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Room Resources Class
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void RoomResources() {
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
		

		npcRoom = new NPCs();

		
		
		
		if(numWeapons != 0) {
			weapon = new Weapon();		// create a new weapon
		} else {
			weapon = new Weapon(0, "No weapon");
		}
	}
	
	public void RoomResources(Potion p, Weapon w, Enemy e,NPCs n) {
		potion = p;
		weapon = w;
		enemy = e;
		npcRoom = n;
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
		return npcRoom;
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
		
		npcRoom.setRoomName(choice1.getName());
		npcRoom.printNPCinteraction(user);
		
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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Weapon Classes
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void Weapon(int x, String y) {
		weapon_strengthBuff=x;
		weapon_name=y;
	}
	public void Weapon() {
		
		Random rand = new Random(); //instance of random class
		
	    int upperbound = 4;			// corresponding to 0-4 (five elements) of weaponNames
	        //generate random values from 0-4
	    //rand.nextInt(n) gets a random number between 0(inclusive) and the number passed in this argument(n), exclusive
	    int random1 = rand.nextInt(upperbound); 	// random number between 1 and 5, so it excludes "unarmed" as a weapon name
	    weapon_name=weaponNames[random1];
	    weapon_strengthBuff = maxWeaponDamage[random1];
	      
	}
	
	public int getWeaponStrengthBuff() {
		return weapon_strengthBuff;
	}
	public String getWeaponName() {
		return weapon_name;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
}