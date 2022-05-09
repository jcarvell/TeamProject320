import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Weapon;

class WeaponTest {
	Weapon[] weapons;
	
	@Test	
	void testWeaponIntString() {
		Weapon weapon1 = new Weapon(100, "fancy sword");
		assertEquals(weapon1.getName(), "fancy sword");
		assertEquals(weapon1.getStrengthBuff(), 100);
		
		Weapon weapon2 = new Weapon(55, "big axe");
		assertEquals(weapon2.getName(), "big axe");
		assertEquals(weapon2.getStrengthBuff(), 55);
	}

	@Test
	void testWeapon() {
		Weapon w1 = new Weapon();
		
		String n1 = w1.getName();
		if((n1 != "Gloves") && (n1 != "Knife") && (n1 != "Machette") && (n1 != "Handgun") && (n1 != "Sword")) {
			fail("Weapon name not one of weaponNames");
		}
		
		int s1 = w1.getStrengthBuff();
		if((s1 != 10) && (s1!= 20) && (s1 != 50) && (s1 != 500) && (s1 != 200)) {
			fail("Weapon StrengthBuff not one of the maxWeaponDamages");
		}
		
		Weapon w2 = new Weapon();
		
		String n2 = w2.getName();
		if((n2 != "Gloves") && (n2 != "Knife") && (n2 != "Machette") && (n2 != "Handgun") && (n2 != "Sword")) {
			fail("Weapon name not one of weaponNames");
		}
		
		int s2 = w2.getStrengthBuff();
		if((s2 != 10) && (s2 != 20) && (s2 != 50) && (s2 != 500) && (s2 != 200)) {
			fail("Weapon StrengthBuff not one of the maxWeaponDamages");
		}
	}

	@Test
	void testGetStrengthBuff() {
		Weapon weapon1 = new Weapon(100, "fancy sword");
		assertEquals(weapon1.getStrengthBuff(), 100);
		
		Weapon weapon2 = new Weapon(55, "big axe");
		assertEquals(weapon2.getStrengthBuff(), 55);
	}

	@Test
	void testGetName() {
		Weapon weapon1 = new Weapon(100, "fancy sword");
		assertEquals(weapon1.getName(), "fancy sword");
		
		Weapon weapon2 = new Weapon(100, "longsword");
		assertEquals(weapon2.getName(), "longsword");
		
		Weapon weapon3 = new Weapon(100, "stick");
		assertEquals(weapon3.getName(), "stick");
		
		Weapon weapon4 = new Weapon();
		String n4 = weapon4.getName();
		if((n4 != "Gloves") && (n4 != "Knife") && (n4 != "Machette") && (n4 != "Handgun") && (n4 != "Sword")) {
			fail("Weapon name not one of weaponNames");
		}
		
		Weapon weapon5 = new Weapon();
		String n5 = weapon5.getName();
		if((n5 != "Gloves") && (n5 != "Knife") && (n5 != "Machette") && (n5 != "Handgun") && (n5 != "Sword")) {
			fail("Weapon name not one of weaponNames");
		}
		
		Weapon weapon6 = new Weapon();
		String n6 = weapon6.getName();
		if((n6 != "Gloves") && (n6 != "Knife") && (n6 != "Machette") && (n6 != "Handgun") && (n6 != "Sword")) {
			fail("Weapon name not one of weaponNames");
		}
		
		Weapon weapon7 = new Weapon();
		String n7 = weapon7.getName();
		if((n7 != "Gloves") && (n7 != "Knife") && (n7 != "Machette") && (n7 != "Handgun") && (n7 != "Sword")) {
			fail("Weapon name not one of weaponNames");
		}
	}

}
