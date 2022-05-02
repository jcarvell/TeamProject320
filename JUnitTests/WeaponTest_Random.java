import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Weapon;

class WeaponTest_Random {

	@Test
	void testAllNamesCorrect() {
		int numTests = 300;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[numTests];
		for(int i = 0; i < numTests; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = weapons[i].getName();
		}
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}	
	}


	@Test
	void testGloves() {
		int numTests = 300;
		int glovesCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[numTests];
		for(int i = 0; i < numTests; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Gloves"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Gloves") {
				glovesCount++;
			}
		}
		
		if(glovesCount==0) {
			fail("Of " + numTests + " Weapons, Gloves is never found");
		} else if(glovesCount == numTests) {
			fail("Only Glove weapons are created");
		}
	}
	
	@Test
	void testKnife() {
		int numTests = 300;
		int knifeCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[numTests];
		for(int i = 0; i < numTests; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		// Check how many times a Weapon is named "Knife"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Knife") {
				knifeCount++;
			}
		}
		
		if(knifeCount==0) {
			fail("Of" + numTests + " Weapons, Knife is never found");
		} else if(knifeCount == numTests) {
			fail("Only knife weapons are created");
		}
		
	}
	
	@Test
	void testMachette() {
		int numTests = 300;
		int machetteCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[numTests];
		for(int i = 0; i < numTests; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
			
		
		// Check how many times a Weapon is named "Machette"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Machette") {
				machetteCount++;
			}
		}
		
		if(machetteCount==0) {
			fail("Of " + numTests + " Weapons, Machette is never found");
		} else if(machetteCount == numTests) {
			fail("Only Machette weapons are created");
		}
	
	}
	
	@Test
	void testHandgun() {
		int numTests = 300;
		int handgunCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[numTests];
		for(int i = 0; i < numTests; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Handgun"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Handgun") {
				handgunCount++;
			}
		}
		
		if(handgunCount==0) {
			fail("Of \" + numTests + \" Weapons, Handgun is never found");
		} else if(handgunCount == numTests) {
			fail("Only Handgun weapons are created");
		}
	}
	
	@Test
	void testSword() {
		int numTests = 300;
		int swordCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[numTests];
		for(int i = 0; i < numTests; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}		
		
		// Check how many times a Weapon is named "Sword"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Sword") {
				swordCount++;
			}
		}
		
		if(swordCount==0) {
			fail("Of \" + numTests + \" Weapons, Sword is never found");
		} else if(swordCount == numTests) {
			fail("Only Sword weapons are created");
		}
	}
	
	@Test
	void testAllNames() {
		int numTests = 300;
		int glovesCount = 0;
		int knifeCount = 0;
		int machetteCount = 0;
		int handgunCount = 0;
		int swordCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[numTests];
		for(int i = 0; i < numTests; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[numTests];
		for(int i = 0; i < numTests; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < numTests; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				System.out.print(i);;
				System.out.print(names[i]);
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Gloves"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Gloves") {
				glovesCount++;
			}
		}
		
		if(glovesCount==0) {
			fail("Of \" + numTests + \" Weapons, Gloves is never found");
		} else if(glovesCount == 61) {
			fail("Only Glove weapons are created");
		}
		
		// Check how many times a Weapon is named "Knife"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Knife") {
				knifeCount++;
			}
		}
		
		if(knifeCount==0) {
			fail("Of \" + numTests + \" Weapons, Knife is never found");
		} else if(knifeCount == numTests) {
			fail("Only knife weapons are created");
		}
		
		
		// Check how many times a Weapon is named "Machette"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Machette") {
				machetteCount++;
			}
		}
		
		if(machetteCount==0) {
			fail("Of \" + numTests + \" Weapons, Machette is never found");
		} else if(machetteCount == numTests) {
			fail("Only Machette weapons are created");
		}
		
		// Check how many times a Weapon is named "Handgun"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Handgun") {
				handgunCount++;
			}
		}
		
		if(handgunCount==0) {
			fail("Of \" + numTests + \" Weapons, Handgun is never found");
		} else if(handgunCount == numTests) {
			fail("Only Handgun weapons are created");
		}
		
		
		// Check how many times a Weapon is named "Sword"
		for(int i = 0; i < numTests; i++) {
			if(names[i] == "Sword") {
				swordCount++;
			}
		}
		
		if(swordCount==0) {
			fail("Of \" + numTests + \" Weapons, Sword is never found");
		} else if(swordCount == numTests) {
			fail("Only Sword weapons are created");
		}
	}
}
