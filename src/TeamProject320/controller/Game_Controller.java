package TeamProject320.controller;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Database.DatabaseProvider;
import Database.IDatabase;
import Database_Model.Player;
import Database_functions.InitDatabase;
import TeamProject320.model.gameModel;
import edu.ycp.cs320.TeamProject.*;
import teamproject.cs320.Enemy;
import teamproject.cs320.Room;
import teamproject.cs320.User;
import Database.DatabaseProvider;
import Database.DerbyDatabase;
import Database.IDatabase;

public class Game_Controller{
	private gameModel model;
	Scanner in = new Scanner (System.in);
	Random rand = new Random();
	private String response = null;
	private IDatabase db = null;
	
	
	public Game_Controller() {
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();
		
	}
	
	public void setModel(gameModel model) {
		this.model = model;
	}
	
	public void startGame() {
		//Set the user stats for a new game. 
		userReset();	
	}
	public void setUserChoice1(int x) {
		model.getUser().setUserChoice1(x);	
	}
	public void userReset() {
		model.getUser().setHealth(100);
		model.getUser().setPoints(0);
		model.getUser().setStrength(5);
		model.getUser().setSpeed(20);
		model.getPotion().setNumPotions(3);
		model.getUser().setCurrentWeapon("No Weapon");
		model.getEnemy().setName("No Enemy");
		model.getEnemy().setHealth(0);
		model.getEnemy().setPoints(0);
		model.getEnemy().setSpeed(0);
		model.getEnemy().setStrength(0);
	}
	public String printNPCinteraction(String roomName) {
		String diaolog = null;
		if(roomName == "Meadow"){
			model.getNPCs().setNPC("Sheep Hearder");
			String diaolg = "There is a tree in the middle of the meadow with a man standing at the base of the tree." + model.getNPCs().getNPC() + " heals you and wishes you luck. Your health is now 100.";
			model.getUser().setHealth(100);
				
		}
		else if(roomName == "Haunted Forest"){
				model.getNPCs().setNPC("Vampire");
				diaolog = "There is an erie looking figure. Its a Vampire and he attacks you sucks out your blood which drains your health.";
				model.getUser().setHealth(model.getUser().getHealth() - 10 );
					return diaolog; 
				}

		else if(roomName == "River"){
			diaolog = "There is an man fishing in the river. Hello how are you today? The fisheran gives you a fish. You are healed for 20 health. ";
			model.getNPCs().setNPC("Fisher");
			model.getUser().setHealth(model.getUser().getHealth() + 20);
			return diaolog;

	}
		if(roomName == "Cave"){
			System.out.println("You look into the Cave and stare into the dark abyss." + model.getNPCs().getNPC() + " come flying out of the cave and scare you. ");
			model.getNPCs().setNPC("Bats");
			return diaolog;

		}
		if(roomName == "Mall"){
			diaolog = "You walk into an abandon mall";
			return diaolog; 

		}
		if(roomName == "Sewers"){
			model.getNPCs().setNPC("Alligator");
			diaolog = "You drop down into the Sewer. You hear a swirlling in the water. You look down and its an Alligator!";
			model.getEnemy().setHealth(50);
			model.getEnemy().setStrength(50);
			model.getEnemy().setSpeed(1);
			model.getEnemy().setName("Alligator");
			model.getEnemy().setPoints(50);
			return diaolog; 
		}
		else {
			
			if(roomName == "Rooftop"){
				diaolog = "You look around and feel a cold breeze. You hear the sound of a helicopter coming towards you. You climb into the helicopter and fly away." ;
				model.getNPCs().setNPC("Heli");
				return diaolog;
			}
		}
		return diaolog;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String welcome() {
		String intro = "Welcome to the Baby Zombies Game Would you like to begin the game? ";
		return intro;
	}
	
	
	public String attack() {
			
			int damageDone = rand.nextInt(model.getUser().getStrength());
			int damageTaken = rand.nextInt(model.getEnemy().getStrength());
			model.getUser().setHealth(model.getUser().getHealth() - damageTaken);
			model.getEnemy().setHealth(model.getEnemy().getHealth() - damageDone);
			response = "You attacked" + model.getEnemy().getName() + " for " + damageDone + " damage. You have taken " + damageTaken + " from enemy. ";
			
			if(model.getUser().getHealth() < 1) {
				response = "You have taken too much damage and you have died. ";
			}
			else if(model.getEnemy().getHealth() <= 0 ) {
				response = enemyDefeated();
			}
			return response;
		}
	
	public String usePotion() {
			if( model.getPotion().getNumPotions() > 0 ) {
				model.getUser().setHealth(model.getUser().getHealth() + model.getPotion().getHealthIncreaseAmount());
				model.getPotion().setNumPotions(model.getPotion().getNumPotions() -1);
				response = "Your new Health is " + model.getUser().getHealth() + " you now have " + model.getPotion().getNumPotions() + " potions. ";
				
			}
			else {
				response = "You have no more potions...... RIP HAHAHA." ;				
			}
			return response; 
	}
	public String runAway() {
			if(model.getUser().getSpeed() > model.getEnemy().getSpeed()) {
				response = "You run away from the enemy";
				//Check this out. Might need to just set enemy health to 0
				model.setEnemy(null);
			}
			else {
				response = "The " + model.getEnemy().getName() + " cuts you off. You must fight or DIE.";
			}
			return response;
	}
	
	public String lookAround() {
	response = "You find some items." +  model.getRoom().getRoomResources().getWeapon().getName() + " and "  + model.getRoom().getRoomResources().getPotion().getName() +" Would you like to take either of the items or would you like to leave?";
	if(!model.getEnemy().getName().contains("No Enemy")) {
		response = response + " there is also an enemy in the room " + model.getEnemy().getName();
	}
	return response;
	
	}
	
	public String pickupWeapon() {
		if(model.getRoom().getRoomResources().getWeapon().getName() != "No Weapon") {
			int tempStrength = model.getUser().getStrength();
			
			String roomWeapon = model.getRoom().getRoomResources().getWeapon().getName();
			model.getUser().setStrength(model.getRoom().getRoomResources().getWeapon().getStrengthBuff());
			response = "Your strength was: " + tempStrength + " now your new strength is: " + model.getUser().getStrength() + " your weapon was " + model.getUser().currentWeaponName() + " your new weapon is now " + roomWeapon;
			model.getRoom().getRoomResources().getWeapon().setName("No Weapon");
			model.getUser().setCurrentWeapon(roomWeapon);
		}
		else {
				response = "No weapon to pickup. ";
			}
			return response;
	}
		
	public String pickupPotion() {
		if(model.getRoom().getRoomResources().getPotion().getNumPotions() != 0) {
			int tempPotions = model.getPotion().getNumPotions();
			model.getPotion().setNumPotions(model.getPotion().getNumPotions() +1);
			response = "You had " + tempPotions + " and you now have " + model.getPotion().getNumPotions();
			model.getRoom().getRoomResources().getPotion().setNumPotions(0);
		}
		else {
			response = "No Potions to pickup. ";
		}
		return response; 
	}
	
	public String enemyDefeated() {
	int x = model.getEnemy().getPoints();
	int y = model.getUser().getUserPoints();
	model.getUser().setPoints(x + y);
	response = "You deafeated the enemy. You currently have " + model.getUser().getHealth() + " health and " + model.getPotion().getNumPotions() + " potions. Your points before the battle were: " + y +
			" the enemy awarded you " + x + " points your new total is: " + model.getUser().getUserPoints();
	model.getEnemy().setName("No Enemy");
	return response; 
	}
	
	

	public String webActions(String input) {
		if(input == null) {
			input = "No input.";
		}
		System.out.println("This is the current input:"+ input);
		System.out.println("This is the current response:"+ response);
		// get min and max from the Posted form data
		// Check attack for damage being so low. 
		if (input.contains("attack") && model.getEnemy().getHealth() > 0) {
			//String response = controller.enemyCombat();
			response = attack();
		}else if (input.contains("attack") && model.getEnemy() == null ){
			response = "There is no enemey to attack. ";
		}
		else if(input.contains("run away") && model.getEnemy().getHealth() > 0) {
			response = runAway();
		}
		else if (input.contains("run away") && model.getEnemy() == null) {
			response = "There is no enemy to run away from. Duh";
		}
		//Check this out because its giving no reponse.
		else if (input.contains("look for npc")) {
			response = printNPCinteraction(model.getRoom().getName());
		}
		else if ( input.contains("look around")) {
			response = lookAround();
		}
		else if(input.contains("pickup weapon")) {
			response = pickupWeapon();
		}
		else if(input.contains("pickup potion")) {
			response = pickupPotion();
		}
		else if(input.contains("use potion")) {
		response = usePotion();
		}
		else if( input.contains("new room")) {
			//Saving room name to check if the new room 
			if(model.getEnemy().getHealth() <= 0) {
				String temp_name = model.getRoom().getName();
				Room new_room = new Room();
				model.setRoom(new_room);
				if(temp_name.contains(model.getRoom().getName())) {
					new_room = new Room();
					model.setRoom(new_room);
				}
				response = "You have entered the new room: " + model.getRoom().getName() + " " + model.getEnemy().getName() + " appeared.";
			}
			else {
				response = "You have an enemy in the room to fight before leaving the room.";
			}	
		}
		else if(input.contains("get stats")) {
			response = "working";
		}
		else if(input.contains("yes")) {
			response = "working";
		}
		else {
			response = "Invalid input";
		}
		return response;
	}
	
	public String savePlayer(String user) {
		db.insertPlayer(user , model.getUser().getHealth(), model.getUser().getStrength(),
				model.getUser().getStrength(), model.getUser().currentWeaponName(), model.getUser().getStrength(), "health" , 10, 10,
				model.getRoom().getName(), model.getEnemy().getName(), model.getEnemy().getHealth(), model.getEnemy().getSpeed(), model.getEnemy().getStrength());
		
		response = "Game has been saved.";
		return response;
	}
	
	public String loadPlayer(String user) {
		
		List<Player> player1 = db.retrieveGameStateByName(user);
		if (player1.isEmpty()) {
			response = "No name found for player <" + user + ">";
			System.out.println(response);
		}
		else {
			
			//need to add player points
			model.getUser().setHealth(player1.get(player1.size()-1).getHealth());
			model.getUser().setStrength(player1.get(player1.size()-1).getStrength());
			model.getUser().setSpeed(player1.get(player1.size()-1).getSpeed());
			model.getUser().setCurrentWeapon(player1.get(player1.size()-1).getWeaponName());
			
			// model.getUser().getStrength()
			// "health"
			//  10, 
			//  10,
			model.getRoom().setRoomName(player1.get(player1.size()-1).getCurrentRoomName());
			model.getEnemy().setName(player1.get(player1.size()-1).getEnemyName());
			model.getEnemy().setHealth(player1.get(player1.size()-1).getEnemyHealth());
			model.getEnemy().setStrength(player1.get(player1.size()-1).getEnemyStrength());
			model.getEnemy().setSpeed(player1.get(player1.size()-1).getEnemySpeed());
			
			
			response = "The game has been loaded.";
		}
		
		return response;
	}
	public String resetPlayer(String user) {
		List<Player> player1 = db.removePlayer(user);
		response = "Deleted player. ";
		
		return response;
	}
	
	
	}