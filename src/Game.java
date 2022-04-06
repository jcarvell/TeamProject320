 
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
		
		int maxWeaponDamage = 50; 	// arbitrarily chosen


		User user=new User(100,30,10);
		
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
				while (user.health() > 0 && choice1.getRoomResources().getEnemy().gethealth() <= 0 ){

					Room temp = choice1;
					choice1 = new Room();
					Room choice2 = new Room();
					if(temp.getName() == choice1.getName() ) {
						choice1 = new Room();
					}else if (temp.getName() == choice2.getName()) {
						choice2 = new Room();
					}else {
						System.out.println("You can choose between these options. ");
			
					}
					

					System.out.println("You have two options 1. " + choice1.getName() + " or you can choose 2. " + choice2.getName() );
					int choice = in.nextInt();
					
					if( choice == 1) {
						System.out.println("You have entered " + choice1.getName());
						
						if(choice1.getRoomResources().getEnemy().gethealth() > 0) {
							System.out.println("You are suddenly face to face with: " + choice1.getRoomResources().getEnemy().name());

						}
						else {
							// we can add randomness to getting materials or weapons here 
							
						}
					}
					else if (choice == 2){
						choice1 = choice2;
						System.out.println("You have entered " + choice1.getName());
						
						if(choice1.getRoomResources().getEnemy().gethealth() > 0) {
							System.out.println("You are suddenly face to face with: " + choice1.getRoomResources().getEnemy().name());
							
					}
						else {
							// we can add randomness here to have things happen that are not part of combat ie. NPS, items found, ect.
						}
				}	else {
					System.out.println("Invalid input ");
				}
				
				}
			//User still needs to be made, this value should call to user for health int
				while(choice1.getRoomResources().getEnemy().gethealth() > 0) {
	
					System.out.println("Your Health is: " + user.health());
					System.out.println(choice1.getRoomResources().getEnemy().name() + " their current health is " + choice1.getRoomResources().getEnemy().gethealth() );
					System.out.println("What would you like to do?");
					System.out.println("1. Attack ");
					System.out.println("2. Use Potion ");
					System.out.println("3. Run Away ");
					
					int input = in.nextInt();
					
					if(input == 1) {
						int damageDone = rand.nextInt(maxWeaponDamage);				// changed maxWeaponDamage[] to maxWeaponDamage and declared it above
						int damageTaken = rand.nextInt(choice1.getRoomResources().getEnemy().strength());				// changed maxEnemyDamage[] to maxEnemyDamage and declared it above
						
						choice1.getRoomResources().getEnemy().setHealth(choice1.getRoomResources().getEnemy().gethealth()-damageDone);
						user.setHealth(user.health()-damageTaken);
						
						System.out.println("You attack " + choice1.getRoomResources().getEnemy().name() + " for " + damageDone + " damage.");
						System.out.println("You have taken " + damageTaken + " from the enemy. ");
						
						if(user.health() < 1) {
							System.out.println("You have taken too much damage and you have died. ");
							break; 
						}
					}
					else if(input == 2) {
						if(choice1.getRoomResources().getnumPotions() > 0) {
							user.setHealth(user.health()+choice1.getRoomResources().getPotion().getHealthIncreaseAmount());			// potionHealAmount was never declared so I declared it in 
							
							choice1.getRoomResources().setPotion(choice1.getRoomResources().getnumPotions()-1);
							System.out.println("Your new Health is " + user.health() + " you now have " + choice1.getRoomResources().getnumPotions() + " potions.");
							
						}
						else {
							System.out.println("You have no more potions...... RIP HAHAHA.");
							
						}
						
					}
					else if(input == 3) {
						if(user.speed() > choice1.getRoomResources().getEnemy().speed()){
							System.out.println("You run away from the enemy. ");
							choice1.getRoomResources().getEnemy().setHealth(0);
							continue GAME;
						}
						else {
							System.out.println("The " + choice1.getRoomResources().getEnemy().name() + " cuts you off. You must fight or DIE.");
						}
						
					}
					else {
					
						System.out.println("Invalid input ");
					}
					
				}
			System.out.println("You deafeated the enemy!");
			System.out.println("You currently have " + user.health() + " health and " + choice1.getRoomResources().getnumPotions() + " potions.");
			System.out.println("");
		}
	}
	}


	
	
			
	


