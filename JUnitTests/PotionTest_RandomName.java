import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Potion;

class PotionTest_RandomName {

	@Test
	void test() {
		// Initialize array of Potions
		Potion potions[] = new Potion[66];
		for(int i = 0; i < 66; i++) {
			potions[i] = new Potion();
		}
		
		// Initialize array of the names of the Potions
		String names[] = new String[66];
		for(int i = 0; i < 66; i++) {
			names[i] = potions[i].getName();
		}
		
		for(int i = 0; i < 66; i++) {
			if((names[i] != "Witch's Brew") && (names[i] != "Slug Trouble") && (names[i] != "Spooky Scary Potion") && (names[i] != "Green Vial") && (names[i] != "Blue Vial") && (names[i] != "Red potion") && (names[i] != "Orange Juice")) {
				System.out.print(names[i]);
				fail("The Potion's name is not one of the potionNames");
			}
		}
	}

}
