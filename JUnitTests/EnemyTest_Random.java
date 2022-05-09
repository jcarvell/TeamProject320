import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Enemy;

class EnemyTest_Random {

	@Test
	void testAllNamesApproved() {
		// Declare variables
		int numTests = 200;
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}
		
		// Check that all names are one of the RandomEnemy names
		for(int i = 0; i < numTests; i++) {
			if((enemy[i].getName() != "No Enemy") && (enemy[i].getName() != "Zombie") && (enemy[i].getName() != "Alligator") && (enemy[i].getName() != "Baby") && (enemy[i].getName() != "King Zombie")) {
				fail("The enemy has an unapproved name: " + enemy[i].getName());
			}
		}
	}
	
	@Test
	void testNoEnemy() {
		// Declare variables
		int numTests = 200;
		int count = 0;
		String nameUnderTest = "No Enemy";
		int healthUnderTest = 0;
		int strengthUnderTest = 0;
		int speedUnderTest = 0;
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}
		
		// Check how many Enemies are named "No Enemy"
		for(int i = 0; i < numTests; i++) {
			if(enemy[i].getName() == nameUnderTest) {
				count++;
				// Check that the health matches the enemy type
				if(enemy[i].getHealth() != healthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding health");
				}
				// Check that the strength matches the enemy type
				if(enemy[i].getStrength() != strengthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding strength");
				}
				// Check that the speed matches the enemy type
				if(enemy[i].getSpeed() != speedUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding speed");
				}
			}
		}
		
		// Name should be used at least once, but not always
		if(count == 0) {
			fail("The name " + nameUnderTest + " is never used");
		} else if(count == numTests) {
			fail("The name " + nameUnderTest + " is always used");
		}
	}

	@Test
	void testZombie() {
		// Declare variables
		int numTests = 200;
		int count = 0;
		String nameUnderTest = "Zombie";
		int healthUnderTest = 50;
		int strengthUnderTest = 10;
		int speedUnderTest = 5;
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}
		
		// Check how many Enemies are named "Zombie"
		for(int i = 0; i < numTests; i++) {
			if(enemy[i].getName() == nameUnderTest) {
				count++;
				// Check that the health matches the enemy type
				if(enemy[i].getHealth() != healthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding health");
				}
				// Check that the strength matches the enemy type
				if(enemy[i].getStrength() != strengthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding strength");
				}
				// Check that the speed matches the enemy type
				if(enemy[i].getSpeed() != speedUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding speed");
				}
			}
		}
		
		// Name should be used at least once, but not always
		if(count == 0) {
			fail("The name " + nameUnderTest + " is never used");
		} else if(count == numTests) {
			fail("The name " + nameUnderTest + " is always used");
		}
	}

	@Test
	void testAlligator() {
		// Declare variables
		int numTests = 200;
		int count = 0;
		String nameUnderTest = "Alligator";
		int healthUnderTest = 50;
		int strengthUnderTest = 50;
		int speedUnderTest = 1;
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}
		
		// Check how many Enemies are named "Alligator"
		for(int i = 0; i < numTests; i++) {
			if(enemy[i].getName() == nameUnderTest) {
				count++;
				// Check that the health matches the enemy type
				if(enemy[i].getHealth() != healthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding health");
				}
				// Check that the strength matches the enemy type
				if(enemy[i].getStrength() != strengthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding strength");
				}
				// Check that the speed matches the enemy type
				if(enemy[i].getSpeed() != speedUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding speed");
				}
			}
		}
		
		// Name should be used at least once, but not always
		if(count == 0) {
			fail("The name " + nameUnderTest + " is never used");
		} else if(count == numTests) {
			fail("The name " + nameUnderTest + " is always used");
		}
	}

	@Test
	void testBaby() {
		// Declare variables
		int numTests = 200;
		int count = 0;
		String nameUnderTest = "Baby";
		int healthUnderTest = 5;
		int strengthUnderTest = 1;
		int speedUnderTest = 1;
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}
		
		// Check how many Enemies are named "Baby"
		for(int i = 0; i < numTests; i++) {
			if(enemy[i].getName() == nameUnderTest) {
				count++;
				// Check that the health matches the enemy type
				if(enemy[i].getHealth() != healthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding health");
				}
				// Check that the strength matches the enemy type
				if(enemy[i].getStrength() != strengthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding strength");
				}
				// Check that the speed matches the enemy type
				if(enemy[i].getSpeed() != speedUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding speed");
				}
			}
		}
		
		// Name should be used at least once, but not always
		if(count == 0) {
			fail("The name " + nameUnderTest + " is never used");
		} else if(count == numTests) {
			fail("The name " + nameUnderTest + " is always used");
		}
	}

	@Test
	void testKingZombie() {
		// Declare variables
		int numTests = 200;
		int count = 0;
		String nameUnderTest = "King Zombie";
		int healthUnderTest = 100;
		int strengthUnderTest = 100;
		int speedUnderTest = 100;
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}
		
		// Check how many Enemies are named "King Zombie"
		for(int i = 0; i < numTests; i++) {
			if(enemy[i].getName() == nameUnderTest) {
				count++;
				// Check that the health matches the enemy type
				if(enemy[i].getHealth() != healthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding health");
				}
				// Check that the strength matches the enemy type
				if(enemy[i].getStrength() != strengthUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding strength");
				}
				// Check that the speed matches the enemy type
				if(enemy[i].getSpeed() != speedUnderTest) {
					fail("Enemy " + enemy[i].getName() + " does not have the corresponding speed");
				}
			}
		}
		
		// Name should be used at least once, but not always
		if(count == 0) {
			fail("The name " + nameUnderTest + " is never used");
		} else if(count == numTests) {
			fail("The name " + nameUnderTest + " is always used");
		}
	}
}
