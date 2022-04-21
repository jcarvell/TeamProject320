package teamproject.cs320;
import java.util.Random;
import java.util.Scanner;

<<<<<<< HEAD:src/ServerGame.java
public class ServerGame {
	
	public ServerGame() {
=======

public class ServerGame {
	public static void main(String[] args) {
>>>>>>> main:src/teamproject/cs320/ServerGame.java
		Random rand = new Random(); //instance of random class
		Room choice1 = new Room();
		
		//Created enemies are stored in this array of enemies(This can be changed later idk)
		//Enemy enemy = new Enemy();
		
		int maxWeaponDamage = 50; 	// arbitrarily chosen


		User user=new User(100,30,10);
		
		Scanner in = new Scanner (System.in);
		boolean startGame = false;
		
		//Start of Game
		
		System.out.println("Welcome to the Baby Zombies Game");
		System.out.println("Would you like to begin the game? ");
		String input1 = in.nextLine();
		if(input1.toLowerCase().contentEquals("yes") ) {
			startGame = true;
		}else {
			startGame = false;
			System.out.println("Maybe next time. ");
		}
		
// GAME:
		while(startGame) {
			
			//All player changes and options other than combat would be in here. 
				while (user.getHealth() > 0 && choice1.getRoomResources().getEnemy().getHealth() <= 0 ){

					
					choice1 = new Room();
					Room choice2 = new Room();

					System.out.println("You have two options 1. " + choice1.getName() + " or you can choose 2. " + choice2.getName() );
					int choice = in.nextInt();
					
					if( choice == 1) {
						System.out.println("You have entered " + choice1.getName());
						
						if(choice1.getRoomResources().getEnemy().getHealth() > 0) {
							System.out.println("You are suddenly face to face with: " + choice1.getRoomResources().getEnemy().getName());

						}
						else {
							// we can add randomness to getting materials or weapons here 
							System.out.println("There is no enemy in this room");

						}
					}
					else if (choice == 2){
						choice1 = choice2;
						System.out.println("You have entered " + choice1.getName());
						
						if(choice1.getRoomResources().getEnemy().getHealth() > 0) {
							System.out.println("You are suddenly face to face with: " + choice1.getRoomResources().getEnemy().getName());
							
					}
						else {
							// we can add randomness here to have things happen that are not part of combat ie. NPS, items found, ect.
							System.out.println("There is no enemy in this room");
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
						int damageDone = rand.nextInt(maxWeaponDamage);				// changed maxWeaponDamage[] to maxWeaponDamage and declared it above
						int damageTaken = rand.nextInt(choice1.getRoomResources().getEnemy().getStrength());				// changed maxEnemyDamage[] to maxEnemyDamage and declared it above
						
						choice1.getRoomResources().getEnemy().setHealth(choice1.getRoomResources().getEnemy().getHealth()-damageDone);
						user.setHealth(user.getHealth()-damageTaken);
						
<<<<<<< HEAD:src/ServerGame.java
						System.out.println("You attack " + choice1.getRoomResources().getEnemy().name() + " for " + damageDone + " damage.");
						System.out.println("You have taken " + damageTaken + " damage from the enemy. ");
=======
						System.out.println("You attack " + choice1.getRoomResources().getEnemy().getName() + " for " + damageDone + " damage.");
						System.out.println("You have taken " + damageTaken + " from the enemy. ");
>>>>>>> main:src/teamproject/cs320/ServerGame.java
						
						if(user.getHealth() < 1) {
							System.out.println("You have taken too much damage and you have died. ");
							break; 
						}
					}
					else if(input == 2) {
						if(choice1.getRoomResources().getnumPotions() > 0) {
							user.setHealth(user.getHealth()+choice1.getRoomResources().getPotion().getHealthIncreaseAmount());			// potionHealAmount was never declared so I declared it in 
							
							choice1.getRoomResources().setPotion(choice1.getRoomResources().getnumPotions()-1);
							System.out.println("Your new Health is " + user.getHealth() + "you now have " + choice1.getRoomResources().getnumPotions() + " potions.");
							
						}
						else {
							System.out.println("You have nomore potions...... RIP HAHAHA.");
							
						}
						
					}
					else if(input == 3) {
						if(user.getSpeed() > choice1.getRoomResources().getEnemy().getSpeed()){
							System.out.println("You run away from the enemy. ");
							continue;
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

			System.out.println("You currently have " + user.getHealth() + " health and " + choice1.getRoomResources().getPotion() + " potions.");
		}
	}
	}
