import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
		if((n1 != "Knife") && (n1 != "Machette") && (n1 != "Handgun") && (n1 != "Sword")) {
			fail("Weapon name not one of weaponNames (or is 'unarmed')");
		}
	}

	@Test
	void testGetStrengthBuff() {
		fail("Not yet implemented");
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
		if((n4 != "Knife") && (n4 != "Machette") && (n4 != "Handgun") && (n4 != "Sword")) {
			fail("Weapon name not one of weaponNames (or is 'unarmed')");
		}
		
		String name;
		for(int i = 0; i < 20; i++) {
			System.out.print(i);
			weapons[i] = new Weapon();
			System.out.print(i);
			name = weapons[i].getName();
			if((name != "Knife") && (name != "Machette") && (name != "Handgun") && (name != "Sword")) {
				fail("Weapon name not one of weaponNames (or is 'unarmed')");
			}
		}
	}

}
