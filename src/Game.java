 

import java.util.Scanner;
import java.util.Random;

// This is the action of combat in the game. 
// still need to implement a model and controller class to have setters and getters. 

public class Game {
	public static void main(String[] args) {
		
		//EMEMY
		String[] enemy = {"No Enemy" ,"Zombie" , "Allegator" , "Baby" , "King Zombie"};
		int [] enemy_Health = { 0, 50 , 300, 5, 100000 };
		int [] maxEnemyDamage = { 0, 10 , 50 , 1, 100 };
		int [] enemy_Speed = { 0, 5 , 10 , 1, 100 };
		
		//Weapon information
		String[] weapons = { "unarmed" , "Knife", "Machette" , "Handgun" , "Sword" };
		int [] maxWeaponDamage = { 10, 20 , 50 , 500 , 200};
		
		// Player info
		int playerHealth = 100;
		int numHealthPotions = 3;
		int playerSpeed = 10;
		int potionHealAmount = 30;
		
		Scanner in = new Scanner (System.in);
		boolean running = true;
		
		//Start of Game
		
		System.out.println("Welcome to the Baby Zombies Game");
		
		GAME:
		while(running) {
			
			while(enemy_Health[] > 0) {
				System.out.println("Your Health is: " + playerHealth);
				System.out.println(enemy[] + "their current health is " + enemy_Health[] );
				System.out.println("What would you like to do?");
				System.out.println("1. Attack ");
				System.out.println("2. Run ");
				System.out.println("3. Use Potion ");
				
				int input = in.nextInt();
				
				if(input == 1) {
					int damageDone = Math.random(nextInt(maxWeaponDamage[] ));
					int damageTaken = Math.random(nextInt(maxEnemyDamage[] ));
					
					enemy_Health -= damageDone;
					playerHealth -= damageTaken;
					
					System.out.println("You attack " + enemy[] + " for " + damageDone + "damage.");
					System.out.println("You have taken " + damageTaken + " from the enemy. ");
					
					if(playerHealth < 1) {
						System.out.println("You have taken too much damage and you have died. ");
						break; 
					}
				}
				else if(input == 2) {
					if(numHealthPotions > 0) {
						playerHealth += potionHealAmount;
						numHealthPotions -= 1;
						System.out.println("Your new Health is " + playerHealth + "you now have " + numHealthPotions + " potions.");
						
					}
					else {
						System.out.println("You have nomore potions...... RIP HAHAHA.");
						
					}
					
				}
				else if(input == 3) {
					if(playerSpeed > enemy_Speed[]) {
						System.out.println("You run away from the enemy. ");
						continue GAME:;
					}
					else {
						System.out.println("The " + enemy[] + "cuts you off. You must fight or DIE.");
					}
					
				}
				else {
				
					System.out.println("Invalid input ");
				}
				
			}
			System.out.println("You deafeated the enemy!");
			System.out.println("You currently have " + playerHealth + "health and " + numHealthPotions + " potions.");

			
		
			
		}
			
	}

}
