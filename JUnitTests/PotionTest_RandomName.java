import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Potion;

class PotionTest_RandomName {

	@Test
	void testCheckNames() {
		int tests = 66;
		
		// Initialize array of Potions
		Potion potions[] = new Potion[tests];
		for(int i = 0; i < tests; i++) {
			potions[i] = new Potion();
		}
		
		// Initialize array of the names of the Potions
		String names[] = new String[tests];
		for(int i = 0; i < 66; i++) {
			names[i] = potions[i].getName();
		}
		
		// Check that all Potion names are one of the potionNames
		for(int i = 0; i < tests; i++) {
			if((names[i] != "Witch's Brew") && (names[i] != "Slug Trouble") && (names[i] != "Spooky Scary Potion") && (names[i] != "Green Vial") && (names[i] != "Blue Vial") && (names[i] != "Red potion") && (names[i] != "Orange Juice")) {
				System.out.print(names[i]);
				fail("The Potion's name is not one of the potionNames");
			}
		}
	}
	
	@Test
	void testWitch() {
		int tests = 66;
		int witchCount = 0;
		
		// Initialize array of Potions
		Potion potions[] = new Potion[tests];
		for(int i = 0; i < tests; i++) {
			potions[i] = new Potion();
		}
		
		// Initialize array of the names of the Potions
		String names[] = new String[tests];
		for(int i = 0; i < tests; i++) {
			names[i] = potions[i].getName();
		}
		
		// Check that all Potion names are one of the potionNames
		for(int i = 0; i < tests; i++) {
			if((names[i] != "Witch's Brew") && (names[i] != "Slug Trouble") && (names[i] != "Spooky Scary Potion") && (names[i] != "Green Vial") && (names[i] != "Blue Vial") && (names[i] != "Red potion") && (names[i] != "Orange Juice")) {
				System.out.print(names[i]);
				fail("The Potion's name is not one of the potionNames");
			}
		}
		
		// Check how many times a potion is named "Witch's Brew"
		for(int i = 0; i < tests; i++) {
			if(names[i] == "Witch's Brew") {
				witchCount++;
			}
		}
		
		// Check that "Witch's Brew" is a name at least once, but not always
		if(witchCount == 0) {
			fail("The name Witch's Brew is never used");
		} else if(witchCount == tests) {
			fail("All potions are named Witch's Brew");
		}
	}

}
