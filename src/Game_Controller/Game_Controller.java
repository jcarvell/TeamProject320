package Game_Controller;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Database.DatabaseProvider;
import Database.IDatabase;
import Database_Model.Player;
import Database_functions.InitDatabase;
import Model.gameModel;
import edu.ycp.cs320.TeamProject.*;
import teamproject.cs320.Room;
import teamproject.cs320.User;

public class Game_Controller {
	private gameModel model;
	Scanner in = new Scanner(System.in);

	public void setModel(gameModel model) {
		this.model = model;
	}

	public void startGame() {
		// Set the user stats for a new game.
		userReset();

	}

	public void setUserChoice1(int x) {
		model.setUserChoice1(x);

	}

	public void userReset() {
		model.setUserHealth(100);
		model.setUserPoints(0);
		model.setUserStrength(5);
		model.setUserSpeed(20);
	}

	public void newRooms() {
		String choice1 = model.randomRoom();
		String choice2 = model.randomRoom();
	}

	public void welcome() {
		System.out.println("Welcome to the Baby Zombies Game");
		System.out.println("Would you like to begin the game? ");
	}

	public class Game {
		public void main(String[] args) {
			Random rand = new Random(); // instance of random class
			Room choice1 = new Room();

			userReset();
			boolean running = false;
			// Start of Game

			welcome();
			String input1 = in.nextLine();
			if (input1.toLowerCase().contentEquals("yes")) {
				running = true;
			} else {
				running = false;
				System.out.println("Maybe next time. ");
			}

			GAME: while (running) {

				// All player changes and options other than combat would be in here.
				while (model.getUserHealth() > 0 && choice1.getRoomResources().getEnemy().getHealth() <= 0) {

					// Checks to see if the choices are the same and if they are then populate a new
					// room.

					Room temp = choice1;
					choice1 = new Room();
					Room choice2 = new Room();
					if (temp.getName() == choice1.getName()) {
						choice1 = new Room();
					} else if (temp.getName() == choice2.getName()) {
						choice2 = new Room();
					} else {
						System.out.println("");
					}

					// ask if you want to save game (this can be anywhere/should maybe be at more
					// points)
					System.out.println("Would you like to save game? 1. Yes 2. No");
					int save = in.nextInt();
					if (save == 1) {
						System.out.println("Enter your name: ");
						String playerName = in.nextLine();
						// Create the default IDatabase instance
						InitDatabase.init(in);
						IDatabase db = DatabaseProvider.getInstance();
						// Alina is the one who typed out the following line:
						// db.insertPlayer(playerName, user.getHealth(), user.getSpeed(),
						// user.getStrength(), user.getArmory()[0].getName(),
						// user.getArmory()[0].getStrengthBuff(), user.getStash()[0].getName(),
						// user.getStash()[0].getHealthIncreaseAmount(),
						// user.getStash()[0].getSpeedIncreaseAmount(), temp.getName(),
						// temp.getRoomResources().getEnemy().getName(),
						// temp.getRoomResources().getEnemy().getHealth(),
						// temp.getRoomResources().getEnemy().getSpeed(),
						// temp.getRoomResources().getEnemy().getStrength());
						// db.insertPlayer(name, health, speed, strength, weaponName, weaponStrength,
						// potionName, potionHealth, potionSpeed, currentRoomName, enemyName,
						// enemyHealth, enemySpeed, enemyStrength)
						String i = db.insertPlayer(playerName, model.getUserHealth(), model.getUserSpeed(),
								model.getUserStrength(), model.getcurrentWeaponName(), model.getWeaponStrengthBuff(),
								"health", 10, 10, choice1.getName(), choice1.getRoomResources().getEnemy().getName(),
								choice1.getRoomResources().getEnemy().getHealth(),
								choice1.getRoomResources().getEnemy().getSpeed(),
								choice1.getRoomResources().getEnemy().getStrength());

						List<Player> player1 = db.retrieveGameStateByName(playerName);
						if (player1.isEmpty()) {
							System.out.println("No books found for author <" + playerName + ">");
						} else {
							System.out.println("Your current health is: " + player1.get(player1.size() - 1).getHealth()
									+ " Your current weapon is: " + player1.get(player1.size() - 1).getWeaponName());

						}
					}

					System.out.println("You have two options 1. " + choice1.getName() + " or you can choose 2. "
							+ choice2.getName());
					int choice = in.nextInt();

					if (choice == 1) {
						System.out.println("You have entered " + choice1.getName());
						if (choice1.getRoomResources().getEnemy().getHealth() > 0) {
							System.out.println("You are suddenly face to face with: "
									+ choice1.getRoomResources().getEnemy().getName());
						}

						else {

							choice1.getRoomResources().noEnemyRoom(model.getUser(), choice1);

						}
					} else if (choice == 2) {
						choice1 = choice2;

						System.out.println("You have entered " + choice1.getName());
						if (choice1.getRoomResources().getEnemy().getHealth() > 0) {
							System.out.println("You are suddenly face to face with: "
									+ choice1.getRoomResources().getEnemy().getName());
						} else {
							choice1.getRoomResources().noEnemyRoom(model.getUser(), choice1);
						}
					} else {
						System.out.println("Invalid input ");
					}

				}
				// User still needs to be made, this value should call to user for health int
				while (choice1.getRoomResources().getEnemy().getHealth() > 0) {

					System.out.println("Your Health is: " + model.getUserHealth());
					System.out.println(choice1.getRoomResources().getEnemy().getName() + " their current health is "
							+ choice1.getRoomResources().getEnemy().getHealth());
					System.out.println("What would you like to do?");
					System.out.println("1. Attack ");
					System.out.println("2. Use Potion ");
					System.out.println("3. Run Away ");

					int input = in.nextInt();

					if (input == 1) {
						// Something is wrong here. User can go into the negative health

						int damageDone = rand.nextInt(model.getUserStrength()); // changed maxWeaponDamage[] to
																				// maxWeaponDamage and declared it above
						int damageTaken = rand.nextInt(choice1.getRoomResources().getEnemy().getStrength()); // changed
																												// maxEnemyDamage[]
																												// to
																												// maxEnemyDamage
																												// and
																												// declared
																												// it
																												// above

						choice1.getRoomResources().getEnemy()
								.setHealth(choice1.getRoomResources().getEnemy().getHealth() - damageDone);
						model.setUserHealth(model.getUserHealth() - damageTaken);

						System.out.println("You attack " + choice1.getRoomResources().getEnemy().getName() + " for "
								+ damageDone + " damage.");
						System.out.println("You have taken " + damageTaken + " from the enemy. ");

						if (model.getUserHealth() < 1) {
							System.out.println("You have taken too much damage and you have died. ");
							break;
						}
					} else if (input == 2) {
						if (choice1.getRoomResources().getnumPotions() > 0) {
							model.setUserHealth(model.getUserHealth()
									+ choice1.getRoomResources().getPotion().getHealthIncreaseAmount());
							choice1.getRoomResources().setPotion(choice1.getRoomResources().getnumPotions() - 1);
							System.out.println("Your new Health is " + model.getUserHealth() + " you now have "
									+ choice1.getRoomResources().getnumPotions() + " potions.");

						} else {
							System.out.println("You have no more potions...... RIP HAHAHA.");

						}

					} else if (input == 3) {
						if (model.getUserSpeed() > choice1.getRoomResources().getEnemy().getSpeed()) {
							System.out.println("You run away from the enemy. ");
							choice1.getRoomResources().getEnemy().setHealth(0);
							continue GAME;
						} else {
							System.out.println("The " + choice1.getRoomResources().getEnemy().getName()
									+ " cuts you off. You must fight or DIE.");
						}

					} else {

						System.out.println("Invalid input ");
					}

				}
				System.out.println("You deafeated the enemy!");
				System.out.println("You currently have " + model.getUserHealth() + " health and "
						+ choice1.getRoomResources().getnumPotions() + " potions.");
				choice1.getRoomResources().calculatePoints(model.getUser());
				System.out.println("");
			}
		}
	}

}