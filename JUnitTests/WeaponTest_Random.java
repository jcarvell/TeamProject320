import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Weapon;

class WeaponTest_Random {

	@Test
	void testAllNamesCorrect() {
		// Initialize weapons
		Weapon weapons[] = new Weapon[61];
		for(int i = 0; i < 61; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		for(int i = 0; i < 61; i++) {
			names[i] = weapons[i].getName();
		}
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}	
	}


	@Test
	void testGloves() {
		int glovesCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[61];
		for(int i = 0; i < 61; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		for(int i = 0; i < 61; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Gloves"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Gloves") {
				glovesCount++;
			}
		}
		
		if(glovesCount==0) {
			fail("Of 61 Weapons, Gloves is never found");
		} else if(glovesCount == 61) {
			fail("Only Glove weapons are created");
		}
	}
	
	@Test
	void testKnife() {
		int knifeCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[61];
		for(int i = 0; i < 61; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		for(int i = 0; i < 61; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		// Check how many times a Weapon is named "Knife"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Knife") {
				knifeCount++;
			}
		}
		
		if(knifeCount==0) {
			fail("Of 61 Weapons, Knife is never found");
		} else if(knifeCount == 61) {
			fail("Only knife weapons are created");
		}
		
	}
	
	@Test
	void testMachette() {
		int machetteCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[61];
		for(int i = 0; i < 61; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		for(int i = 0; i < 61; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
			
		
		// Check how many times a Weapon is named "Machette"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Machette") {
				machetteCount++;
			}
		}
		
		if(machetteCount==0) {
			fail("Of 61 Weapons, Machette is never found");
		} else if(machetteCount == 61) {
			fail("Only Machette weapons are created");
		}
	
	}
	
	@Test
	void testHandgun() {
		int handgunCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[61];
		for(int i = 0; i < 61; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		for(int i = 0; i < 61; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Handgun"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Handgun") {
				handgunCount++;
			}
		}
		
		if(handgunCount==0) {
			fail("Of 61 Weapons, Handgun is never found");
		} else if(handgunCount == 61) {
			fail("Only Handgun weapons are created");
		}
	}
	
	@Test
	void testSword() {
		int swordCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[61];
		for(int i = 0; i < 61; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		for(int i = 0; i < 61; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}		
		
		// Check how many times a Weapon is named "Sword"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Sword") {
				swordCount++;
			}
		}
		
		if(swordCount==0) {
			fail("Of 61 Weapons, Sword is never found");
		} else if(swordCount == 61) {
			fail("Only Sword weapons are created");
		}
	}
	
	@Test
	void testAllNames() {
		int glovesCount = 0;
		int knifeCount = 0;
		int machetteCount = 0;
		int handgunCount = 0;
		int swordCount = 0;
		
		// Initialize weapons
		Weapon weapons[] = new Weapon[61];
		for(int i = 0; i < 61; i++) {
			weapons[i] = new Weapon();
		}
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		for(int i = 0; i < 61; i++) {
			names[i] = weapons[i].getName();
		}
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Gloves"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Gloves") {
				glovesCount++;
			}
		}
		
		if(glovesCount==0) {
			fail("Of 61 Weapons, Gloves is never found");
		} else if(glovesCount == 61) {
			fail("Only Glove weapons are created");
		}
		
		// Check how many times a Weapon is named "Knife"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Knife") {
				knifeCount++;
			}
		}
		
		if(knifeCount==0) {
			fail("Of 61 Weapons, Knife is never found");
		} else if(knifeCount == 61) {
			fail("Only knife weapons are created");
		}
		
		
		// Check how many times a Weapon is named "Machette"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Machette") {
				machetteCount++;
			}
		}
		
		if(machetteCount==0) {
			fail("Of 61 Weapons, Machette is never found");
		} else if(machetteCount == 61) {
			fail("Only Machette weapons are created");
		}
		
		// Check how many times a Weapon is named "Handgun"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Handgun") {
				handgunCount++;
			}
		}
		
		if(handgunCount==0) {
			fail("Of 61 Weapons, Handgun is never found");
		} else if(handgunCount == 61) {
			fail("Only Handgun weapons are created");
		}
		
		
		// Check how many times a Weapon is named "Sword"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Sword") {
				swordCount++;
			}
		}
		
		if(swordCount==0) {
			fail("Of 61 Weapons, Sword is never found");
		} else if(swordCount == 61) {
			fail("Only Sword weapons are created");
		}
	}
}
