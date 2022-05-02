import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Potion;

class PotionTest_RandomName {

	@Test
	void testCheckNames() {
		int numTests = 66;
		
		// Initialize array of Potions
		Potion potions[] = new Potion[numTests];
		for(int i = 0; i < numTests; i++) {
			potions[i] = new Potion();
		}
		
		// Initialize array of the names of the Potions
		String names[] = new String[numTests];
		for(int i = 0; i < 66; i++) {
			names[i] = potions[i].getName();
		}
		
		// Check that all Potion names are one of the potionNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Witch's Brew") && (names[i] != "Slug Trouble") && (names[i] != "Spooky Scary Potion") && (names[i] != "Green Vial") && (names[i] != "Blue Vial") && (names[i] != "Red potion") && (names[i] != "Orange Juice")) {
				System.out.print(names[i]);
				fail("The Potion's name is not one of the potionNames");
			}
		}
	}
	
	@Test
	void testWitch() {
		int numTests = 66;
		int witchCount = 0;
		
		// Initialize array of Potions
		Potion potions[] = new Potion[numTests];
		for(int i = 0; i < numTests; i++) {
			potions[i] = new Potion();
		}
		
		// Initialize array of the names of the Potions
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = potions[i].getName();
		}
		
		// Check that all Potion names are one of the potionNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Witch's Brew") && (names[i] != "Slug Trouble") && (names[i] != "Spooky Scary Potion") && (names[i] != "Green Vial") && (names[i] != "Blue Vial") && (names[i] != "Red potion") && (names[i] != "Orange Juice")) {
				System.out.print(names[i]);
				fail("The Potion's name is not one of the potionNames");
			}
		}
		
		// Check how many times a potion is named "Witch's Brew"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Witch's Brew") {
				witchCount++;
			}
		}
		
		// Check that "Witch's Brew" is a name at least once, but not always
		if(witchCount == 0) {
			fail("The name Witch's Brew is never used");
		} else if(witchCount == numTests) {
			fail("All potions are named Witch's Brew");
		}
	}
	
	@Test
	void testSlug() {
		int numTests = 66;
		int slugCount = 0;
		
		// Initialize array of Potions
		Potion potions[] = new Potion[numTests];
		for(int i = 0; i < numTests; i++) {
			potions[i] = new Potion();
		}
		
		// Initialize array of the names of the Potions
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = potions[i].getName();
		}
		
		// Check that all Potion names are one of the potionNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Witch's Brew") && (names[i] != "Slug Trouble") && (names[i] != "Spooky Scary Potion") && (names[i] != "Green Vial") && (names[i] != "Blue Vial") && (names[i] != "Red potion") && (names[i] != "Orange Juice")) {
				System.out.print(names[i]);
				fail("The Potion's name is not one of the potionNames");
			}
		}
		
		// Check how many times a potion is named "Slug Trouble"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Slug Trouble") {
				slugCount++;
			}
		}
		
		// Check that "Slug Trouble" is a name at least once, but not always
		if(slugCount == 0) {
			fail("The name Slug Trouble is never used");
		} else if(slugCount == numTests) {
			fail("All potions are named Slug Trouble");
		}
	}
}
