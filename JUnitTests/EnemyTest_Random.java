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
		
		// Create an array of the names of the Enemies
		String name[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			name[i] = enemy[i].getName();
		}
		
		// Check that all names are one of the RandomEnemy names
		for(int i = 0; i < numTests; i++) {
			if((name[i] != "No Enemy") && (name[i] != "Zombie") && (name[i] != "Alligator") && (name[i] != "Baby") && (name[i] != "King Zombie")) {
				fail("The enemy has an unapproved name: " + name[i]);
			}
		}
	}
	
	@Test
	void testNoEnemy() {
		// Declare variables
		int numTests = 200;
		int count = 0;
		String nameUnderTest = "No Enemy";
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}

		// Create an array of the names of the Enemies
		String name[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			name[i] = enemy[i].getName();
		}
		
		// Check how many Enemies are named "No Enemy"
		for(int i = 0; i < numTests; i++) {
			if(name[i] == nameUnderTest) {
				count++;
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
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}

		// Create an array of the names of the Enemies
		String name[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			name[i] = enemy[i].getName();
		}
		
		// Check how many Enemies are named "Zombie"
		for(int i = 0; i < numTests; i++) {
			if(name[i] == nameUnderTest) {
				count++;
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
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}

		// Create an array of the names of the Enemies
		String name[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			name[i] = enemy[i].getName();
		}
		
		// Check how many Enemies are named "Alligator"
		for(int i = 0; i < numTests; i++) {
			if(name[i] == nameUnderTest) {
				count++;
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
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}

		// Create an array of the names of the Enemies
		String name[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			name[i] = enemy[i].getName();
		}
		
		// Check how many Enemies are named "Baby"
		for(int i = 0; i < numTests; i++) {
			if(name[i] == nameUnderTest) {
				count++;
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
		
		// Create an array of Enemies
		Enemy enemy[] = new Enemy[numTests];
		
		// Initialize Enemy array
		for(int i = 0; i < numTests; i++) {
			enemy[i] = new Enemy();
		}

		// Create an array of the names of the Enemies
		String name[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			name[i] = enemy[i].getName();
			System.out.print(name[i]);
		}
		
		// Check how many Enemies are named "King Zombie"
		for(int i = 0; i < numTests; i++) {
			if(name[i] == nameUnderTest) {
				count++;
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
