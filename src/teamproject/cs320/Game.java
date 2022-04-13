package teamproject.cs320;
 
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;

// This is the action of combat in the game. 
// still need to implement a model and controller class to have setters and getters. 

public class Game {
	public static void main(String[] args) {
		Random rand = new Random(); //instance of random class
		Room choice1 = new Room();
		
		
		//Created enemies are stored in this array of enemies(This can be changed later idk)
		//Enemy enemy = new Enemy();
		
	// arbitrarily chosen


		User user=new User(100,5,10);
		
		Scanner in = new Scanner (System.in);
		boolean running = false;
		
		//Start of Game
		
		System.out.println("Welcome to the Baby Zombies Game");
		System.out.println("Would you like to begin the game? ");
		String input1 = in.nextLine();
		if(input1.toLowerCase().contentEquals("yes") ) {
			running = true;
		}else {
			running = false;
			System.out.println("Maybe next time. ");
		}
		
GAME:
		while(running) {
			
			//All player changes and options other than combat would be in here. 
				while (user.getHealth() > 0 && choice1.getRoomResources().getEnemy().getHealth() <= 0 ){
					
					// Checks to see if the choices are the same and if they are then populate a new room. 
					
					Room temp = choice1;
					choice1 = new Room();
					Room choice2 = new Room();
					if(temp.getName() == choice1.getName() ) {
						choice1 = new Room();
					}else if (temp.getName() == choice2.getName()) {
						choice2 = new Room();
					}else {
						System.out.println("");
					}
					

					System.out.println("You have two options 1. " + choice1.getName() + " or you can choose 2. " + choice2.getName() );
					int choice = in.nextInt();
					
					if( choice == 1) {
						System.out.println("You have entered " + choice1.getName());
						if(choice1.getRoomResources().getEnemy().getHealth() > 0) {
							System.out.println("You are suddenly face to face with: " + choice1.getRoomResources().getEnemy().getName());
						}
						
						else {
							choice1.getRoomResources().noEnemyroom(user);
						}
					}
					else if (choice == 2){
						choice1 = choice2;
						
						System.out.println("You have entered " + choice1.getName());
						if(choice1.getRoomResources().getEnemy().getHealth() > 0) {
							System.out.println("You are suddenly face to face with: " + choice1.getRoomResources().getEnemy().getName());	
					}
						else {
							choice1.getRoomResources().noEnemyroom(user);
						}
				}	else {
					System.out.println("Invalid input ");
				}
				
				}
			//User still needs to be made, this value should call to user for health int
				while(choice1.getRoomResources().getEnemy().getHealth() > 0) {
	
					System.out.println("Your Health is: " + user.getHealth());
					System.out.println(choice1.getRoomResources().getEnemy().getName() + " their current health is " + choice1.getRoomResources().getEnemy().getHealth() );
					System.out.println("What would you like to do?");
					System.out.println("1. Attack ");
					System.out.println("2. Use Potion ");
					System.out.println("3. Run Away ");
					
					int input = in.nextInt();
					
					if(input == 1) {
						//Something is wrong here. User can go into the negative health
						
						
						int damageDone = rand.nextInt(user.getStrength());				// changed maxWeaponDamage[] to maxWeaponDamage and declared it above
						int damageTaken = rand.nextInt(choice1.getRoomResources().getEnemy().getStrength());				// changed maxEnemyDamage[] to maxEnemyDamage and declared it above
						
						choice1.getRoomResources().getEnemy().setHealth(choice1.getRoomResources().getEnemy().getHealth()-damageDone);
						user.setHealth(user.getHealth()-damageTaken);
						
						System.out.println("You attack " + choice1.getRoomResources().getEnemy().getName() + " for " + damageDone + " damage.");
						System.out.println("You have taken " + damageTaken + " from the enemy. ");
						
						if(user.getHealth() < 1) {
							System.out.println("You have taken too much damage and you have died. ");
							break; 
						}
					}
					else if(input == 2) {
						if(choice1.getRoomResources().getnumPotions() > 0) {
							user.setHealth(user.getHealth()+choice1.getRoomResources().getPotion().getHealthIncreaseAmount());			// potionHealAmount was never declared so I declared it in 
							
							choice1.getRoomResources().setPotion(choice1.getRoomResources().getnumPotions()-1);
							System.out.println("Your new Health is " + user.getHealth() + " you now have " + choice1.getRoomResources().getnumPotions() + " potions.");
							
						}
						else {
							System.out.println("You have no more potions...... RIP HAHAHA.");
							
						}
						
					}
					else if(input == 3) {
						if(user.getSpeed() > choice1.getRoomResources().getEnemy().getSpeed()){
							System.out.println("You run away from the enemy. ");
							choice1.getRoomResources().getEnemy().setHealth(0);
							continue GAME;
						}
						else {
							System.out.println("The " + choice1.getRoomResources().getEnemy().getName() + " cuts you off. You must fight or DIE.");
						}
						
					}
					else {
					
						System.out.println("Invalid input ");
					}
					
				}
			System.out.println("You deafeated the enemy!");
			System.out.println("You currently have " + user.getHealth() + " health and " + choice1.getRoomResources().getnumPotions() + " potions.");
			System.out.println("");
		}
	}
	}


	
	
			
	


