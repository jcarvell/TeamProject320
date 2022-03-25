 
import java.util.*;
import java.util.Scanner;
import java.util.Random;

// This is the action of combat in the game. 
// still need to implement a model and controller class to have setters and getters. 

public class Game {
	public static void main(String[] args) {
		//Created enemies are stored in this array of enemies(This can be changed later idk)
		Enemy enemy = new Enemy();
		
		
		//EMENY
		//Weapon information
		for(int i=0;i<4;i++) {
			//Creating Item with itemType weapon
			Weapon weaponx=new Weapon();
			
			//Creating enemy-(health,strength,speed,item)
			Enemy enemy = new Enemy();
		}
			Random number = new Random();
			number.nextInt(100);
		
		
		// Player info User(health,strength, speed)
		
		int numHealthPotions = 3;
		
		User user=new User(100,30,10);
		
		Scanner in = new Scanner (System.in);
		boolean running = true;
		
		//Start of Game
		
		System.out.println("Welcome to the Baby Zombies Game");
		
		GAME:
		while(running) {
			
			while(enemy.health() > 0) {

			//All player changes and options other than combat would be in here. 
				while (user.health() > 0 && enemy.health() > 0 ){
					
					Room choice1 = new Room();
					Room choice2 = new Room();
					System.out.println("You have two options 1. " + choice1.getName() + "or you can choose 2. " + choice2.getName() );
					int choice = in.nextInt();
					
					
	
				}
				Combat:
			//User still needs to be made, this value should call to user for health int
				while(enemy.health() > 0) {
	
					System.out.println("Your Health is: " + user.health());
					System.out.println(enemy.name() + "their current health is " + user.health() );
					System.out.println("What would you like to do?");
					System.out.println("1. Attack ");
					System.out.println("2. Run ");
					System.out.println("3. Use Potion ");
					
					int input = in.nextInt();
					
					if(input == 1) {
						int damageDone = Math.random(nextInt(maxWeaponDamage[] ));
						int damageTaken = Math.random(nextInt(maxEnemyDamage[] ));
						
						enemy.setHealth(enemy.health()-damageDone);
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
							user.setHealth(user.health()+potionHealAmount);
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
							System.out.println("The " + enemy.health() + "cuts you off. You must fight or DIE.");
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
}

	
	
			
	


