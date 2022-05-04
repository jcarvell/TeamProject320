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
import teamproject.cs320.Room;
import teamproject.cs320.User;

public class Game_Controller{
	private gameModel model;
	Scanner in = new Scanner (System.in);
	Random rand = new Random();
	private String response = null;
	
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
	}
	public String printNPCinteraction(String roomName) {
		String diaolog = null;
		if(roomName == "Meadow"){
			model.getNPCs().setNPC("Sheep Hearder");
			String diaolg = "There is a tree in the middle of the meadow with a man standing at the base of the tree." + model.getNPCs().getNPC() + " heals you and wishes you luck. Your health is now 100.";
			model.getUser().setHealth(100);
				
		}
		else if(roomName == "Haunted Forest"){
				diaolog = "There is an erie looking figure. " + model.getNPCs().getNPC() + " attacks you sucks out your blood which drains your health.";
				model.getNPCs().setNPC("Vampire");
				model.getUser().setHealth(model.getUser().getHealth() - 10 );
					return diaolog; 
				}

		else if(roomName == "Slithering Stream"){
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
	
	public void welcome() {
		String intro = "Welcome to the Baby Zombies Game Would you like to begin the game? ";
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
	return response;
	}
	
	public String pickupWeapon() {
		if(model.getRoom().getRoomResources().getWeapon().getName() != "No Weapon") {
			int tempStrength = model.getUser().getStrength();
			
			String roomWeapon = model.getRoom().getRoomResources().getWeapon().getName();
			model.getUser().setStrength(model.getRoom().getRoomResources().getWeapon().getStrengthBuff());
			response = "Your strength was: " + tempStrength + " now your new strength is: " + model.getUser().getStrength() + " your weapon was " + model.getUser().currentWeaponName() + " your new weapon is now " + roomWeapon;
			model.getUser().setCurrentWeapon(roomWeapon);
		}
		else {
				response = "No weapon to pickup. ";
			}
			return response;
	}
		
	public String pickupPotion() {
		if(model.getRoom().getRoomResources().getPotion().getName() != "No Potion") {
			int tempPotions = model.getPotion().getNumPotions();
			model.getPotion().setNumPotions(model.getPotion().getNumPotions() +1);
			response = "You had " + tempPotions + " and you now have " + model.getPotion().getNumPotions();
		}
		else {
			response = "No Potions to pickup. ";
		}
		return response; 
	}
	
	public String enemyDefeated() {
	int x = model.getEnemy().getHealth();
	int y = model.getUser().getUserPoints();
	model.getUser().setPoints(x + y);
	response = "You deafeated the enemy. You currently have" + model.getUser().getHealth() + " health and " + model.getPotion().getNumPotions() + " potions. Your points before the battle where: " + y +
			" the enemy awarded you" + x + " points your new total is: " + model.getUser().getUserPoints();
	return response; 
	}

	public String webActions(String input) {

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
		else {
			response = "Invalid input";
		}
		return response;
	}
	
	}
