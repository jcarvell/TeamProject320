 

import java.util.Scanner;
import java.util.Random;

// This is the action of combat in the game. 
// still need to implement a model and controller class to have setters and getters. 

public class Game {
	public static void main(String[] args) {
		//Created enemies are stored in this array of enemies(This can be changed later idk)
		Enemy[] enemies;
		
		
		//EMENY
		
		for(int i=0;i<4;i++) {
			//Creating Item with itemType weapon
			Weapon weaponx=new Weapon();
			
			//Creating enemy-(health,strength,speed,item)
			Enemy x=new Enemy(weaponx);
			enemies[i]=x;
		}
			Random number = new Random();
			number.nextInt(100);
			
		//Weapon information
		
		//Rooms still need to be included
		
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
			
			//All player changes and options other than combat would be in here. 
			while (playerHealth > 0 && enemyHealth[ ] < 0 ){
				
				Room choice1 = new Room();
				Room choice2 = new Room();
				System.out.println("You have two options 1. " + choice1.getName() + "or you can choose 2. " + choice2.getName() );
				int choice = in.nextInt();
				
				

			}
			Combat:
			//User still needs to be made, this value should call to user for health int
			while(enemy_Health [ ] > 0) {
				System.out.println("Your Health is: " + playerHealth);
				System.out.println(enemy[] + "their current health is " + enemy_Health[] );
				System.out.println("What would you like to do?");
				System.out.println("1. Attack ");
				System.out.println("2. Run ");
				System.out.println("3. Use Potion ");
				
				int input = in.nextInt();
				
				if(input = 1) {
					int damageDone = rand.nextInt(maxWeaponDamage[ ] );
					int damageTaken = rand.nextInt(maxEnemyDamage[ ] );
					
					enemy_Health -= damageDone;
					playerHealth -= damageTaken;
					
					System.out.println("You attack " + enemy[] + " for " + damageDone + "damage.");
					System.out.println("You have taken " + damageTaken + " from the enemy. ");
					
					if(playerHealth < 1) {
						System.out.println("You have taken too much damage and you have died. ");
						break; 
					}
				}
				else if(input = 2) {
					if(numHealthPotions > 0) {
						playerHealth += potionHealAmount;
						numHealthPotion -= 1;
						System.out.println("Your new Health is " + playerHealth + "you now have " + numHealthPotion + " potions.");
						
					}
					else {
						System.out.println("You have nomore potions...... RIP HAHAHA.");
						
					}
					
				}
				else if(input = 3) {
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
			System.out.println("You currently have " + playerHealth + "health and " + numHealthPotion + " potions.");
		}
			
		
			
		}
	}
			
	


