import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Enemy;
import teamproject.cs320.NPCs;
import teamproject.cs320.Potion;
import teamproject.cs320.RoomResources;
import teamproject.cs320.Weapon;

class RoomResources_Random {

	@Test
	void testEnemies() {
		int numTests = 100;
		RoomResources r[] = new RoomResources[numTests];
		Enemy enemy[] = new Enemy[numTests];
		String nameUnderTest[] = {"No Enemy","Zombie" , "Alligator" , "Baby" , "King Zombie"};
		int healthUnderTest[] = { 0, 50 , 50, 5, 100 };
		int strengthUnderTest[] = { 0, 10 , 50 , 1, 100 };
		int speedUnderTest[] = { 0, 5 , 1 , 1, 100 };
		int count = 0;
		
		for(int i = 0; i < numTests; i++) {
			r[i] = new RoomResources();
		}
		
		for(int i = 0; i < numTests; i++) {
			enemy[i] = r[i].getEnemy();
		}

		// Check that all names are one of the RandomEnemy names
		for(int i = 0; i < numTests; i++) {
			if((enemy[i].getName() != "No Enemy") && (enemy[i].getName() != "Zombie") && (enemy[i].getName() != "Alligator") && (enemy[i].getName() != "Baby") && (enemy[i].getName() != "King Zombie")) {
				fail("The enemy has an unapproved name: " + enemy[i].getName());
			}
		}
		
		for(int i = 0; i < nameUnderTest.length; i++) {
			count = 0;
			// Check how many Enemies are named the nameUnderTest
			for(int j = 0; j < numTests; j++) {
				if(enemy[j].getName() == nameUnderTest[i]) {
					count++;
					// Check that the health matches the enemy type
					if(enemy[j].getHealth() != healthUnderTest[i]) {
						fail("Enemy " + enemy[j].getName() + " does not have the corresponding health");
					}
					// Check that the strength matches the enemy type
					if(enemy[j].getStrength() != strengthUnderTest[i]) {
						fail("Enemy " + enemy[j].getName() + " does not have the corresponding strength");
					}
					// Check that the speed matches the enemy type
					if(enemy[j].getSpeed() != speedUnderTest[i]) {
						fail("Enemy " + enemy[j].getName() + " does not have the corresponding speed");
					}
				}
			}
			// Check that the nameUnderTest is used at least once, but not always
			if(count == 0) {
				fail("The name " + nameUnderTest + " is never used");
			} else if(count == numTests) {
				fail("The name " + nameUnderTest + " is always used");
			}
		}
	}
	
	@Test
	void testPotions() {
		int numTests = 200;
		int count = 0;
		boolean nameNotOnList = true;
		// Note: "No potion" only occurs when RoomResources randomly decides there are no potions in the room
		String nameUnderTest[] = {"No potion", "Witch's Brew", "Slug Trouble", "Spooky Scary Potion", "Green Vial", "Blue Vial", "Red potion", "Orange Juice"};
		
		// Initialize array of RoomResources
		RoomResources r[] = new RoomResources[numTests];
		for(int i = 0; i < numTests; i++) {
			r[i] = new RoomResources();
		}
		
		// Initialize array of Potions
		Potion potions[] = new Potion[numTests];
		for(int i = 0; i < numTests; i++) {
			potions[i] = r[i].getPotion();
		}
		
		// Check that all Potion names are one of the potionNames
		for(int i = 0; i < numTests; i++) {
			nameNotOnList = true;
			for(int j = 0; j < nameUnderTest.length; j++) {
				count++;
				if(potions[i].getName() == nameUnderTest[j]) {
					nameNotOnList = false;
				}
			}
			if(nameNotOnList) {
				fail(potions[i].getName() + " is not an approved name");
			}
		}

		for(int i = 0; i < nameUnderTest.length; i++) {
			count = 0;
			// Check how many Potions are named the nameUnderTest
			for(int j = 0; j < numTests; j++) {
				if(potions[j].getName() == nameUnderTest[i]) {
					count++;
				}
			}
			// The name under test should be used at least once, but not always
			if(count == 0) {
				fail("The name " + nameUnderTest + " is never used");
			} else if(count == numTests) {
				fail("All potions are named " + nameUnderTest);
			}
			
		}
	}

}
