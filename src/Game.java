 
import java.util.*;
import java.util.Scanner;
import java.util.Random;

// This is the action of combat in the game. 
// still need to implement a model and controller class to have setters and getters. 

public class Game {
	public static void main(String[] args) {
		Random rand = new Random(); //instance of random class
		
		//Created enemies are stored in this array of enemies(This can be changed later idk)
		//Enemy enemy = new Enemy();
		Enemy enemy = null;
		Weapon weapon = null;
		
		int maxWeaponDamage = 50; 	// arbitrarily chosen

		// Player info User(health,strength, speed)
		
		int numHealthPotions = 3;
		int potionHealAmount = 1;  		// placeholder, we need to call the individual potions that the user has in their inventory, but I needed Game not to have errors
		
		User user=new User(100,30,10);
		
		Scanner in = new Scanner (System.in);
		boolean running = true;
		
		//Start of Game
		
		System.out.println("Welcome to the Baby Zombies Game");
		
GAME:
		while(running) {
			
			//All player changes and options other than combat would be in here. 
				while (user.health() > 0 && enemy.gethealth() == 0 ){

					
					Room choice1 = new Room();
					Room choice2 = new Room();
					System.out.println("You have two options 1. " + choice1.getName() + "or you can choose 2. " + choice2.getName() );
					int choice = in.nextInt();
					
					if( choice == 1) {
						System.out.println("You have entered " + choice1.getName());
						enemy = new Enemy();
						if(enemy.gethealth() > 0) {
							System.out.println("You are suddenly face to face with: " + enemy.name());
							continue COMBAT;
						}
						else {
							// we can add randomness to getting materials or weapons here 
							
						}
					}
					else if (choice == 2){
						System.out.println("You have entered " + choice1.getName());
						enemy = new Enemy();
						if(enemy.gethealth() > 0) {
							System.out.println("You are suddenly face to face with: " + enemy.name());
							continue COMBAT;
					}
						else {
							// we can add randomness here to have things happen that are not part of combat ie. NPS, items found, ect.
						}
				}	else {
					System.out.println("Invalid input ");
				}
				
				}
COMBAT:
			//User still needs to be made, this value should call to user for health int
				while(enemy.gethealth() > 0) {
	
					System.out.println("Your Health is: " + user.health());
					System.out.println(enemy.name() + "their current health is " + user.health() );
					System.out.println("What would you like to do?");
					System.out.println("1. Attack ");
					System.out.println("2. Run ");
					System.out.println("3. Use Potion ");
					
					int input = in.nextInt();
					
					if(input == 1) {
						int damageDone = rand.nextInt(maxWeaponDamage);				// changed maxWeaponDamage[] to maxWeaponDamage and declared it above
						int damageTaken = rand.nextInt(enemy.strength());				// changed maxEnemyDamage[] to maxEnemyDamage and declared it above
						
						enemy.setHealth(enemy.gethealth()-damageDone);
						user.setHealth(user.health()-damageTaken);
						
						System.out.println("You attack " + enemy.name() + " for " + damageDone + "damage.");
						System.out.println("You have taken " + damageTaken + " from the enemy. ");
						
						if(user.health() < 1) {
							System.out.println("You have taken too much damage and you have died. ");
							break; 
						}
					}
					else if(input == 2) {
						if(numHealthPotions > 0) {
							user.setHealth(user.health()+potionHealAmount);			// potionHealAmount was never declared so I declared it in 
							numHealthPotions -= 1;
							System.out.println("Your new Health is " + user.health() + "you now have " + numHealthPotions + " potions.");
							
						}
						else {
							System.out.println("You have nomore potions...... RIP HAHAHA.");
							
						}
						
					}
					else if(input == 3) {
						if(user.speed() > enemy.speed()) {
							System.out.println("You run away from the enemy. ");
							continue GAME;
						}
						else {
							System.out.println("The " + enemy.gethealth() + "cuts you off. You must fight or DIE.");
						}
						
					}
					else {
					
						System.out.println("Invalid input ");
					}
					
				}
			System.out.println("You deafeated the enemy!");

			System.out.println("You currently have " + user.health() + "health and " + numHealthPotions + " potions.");
		}
	}
	}


	
	
			
	


