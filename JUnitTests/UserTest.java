import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.User;

class UserTest {

	@Test
	void testUserIntIntInt() {
		User Bob = new User(5, 10, 15);
		User Sally = new User(10, 5, 0);
		User Billy = new User(0, 22, 1);
	}

	@Test
	void testGetHealth() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getHealth(), 5);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getHealth(), 10);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getHealth(), 0);
	}

	@Test
	void testSetHealth() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getHealth(), 5);
		Bob.setHealth(11);
		assertEquals(Bob.getHealth(), 11);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getHealth(), 10);
		Sally.setHealth(8);
		assertEquals(Sally.getHealth(), 8);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getHealth(), 0);
		Billy.setHealth(16);
		assertEquals(Billy.getHealth(), 16);
		
		User Jenny = new User(5, 10, 15);
		assertEquals(Jenny.getHealth(), 5);
		Jenny.setHealth(0);
		assertEquals(Jenny.getHealth(), 0);
	}

	@Test
	void testGetStrength() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getStrength(), 10);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getStrength(), 5);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getStrength(), 22);
		
		User Suzy = new User(10, 0, 10);
		assertEquals(Suzy.getStrength(), 0);
	}

	@Test
	void testGetSpeed() {
		// public User(health,strength,speed) h
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getSpeed(), 15);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getSpeed(), 0);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getSpeed(), 1);
		
		User Suzy = new User(10, 0, 10);
		assertEquals(Suzy.getSpeed(), 10);
	}
	
	@Test
	void testSetStrength() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getStrength(), 10);
		Bob.setStrength(3);
		assertEquals(Bob.getStrength(), 3);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getStrength(), 5);
		Sally.setStrength(7);
		assertEquals(Sally.getStrength(), 7);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getStrength(), 22);
		Billy.setStrength(11);
		assertEquals(Billy.getStrength(), 11);
		
		User Suzy = new User(10, 0, 10);
		assertEquals(Suzy.getStrength(), 0);
		Suzy.setStrength(4);
		assertEquals(Suzy.getStrength(), 4);
		
		User June = new User(3, 6 , 9);
		assertEquals(June.getStrength(), 6);
	}
	
	@Test
	void testSetSpeed() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getSpeed(), 15);
		Bob.setSpeed(9);
		assertEquals(Bob.getSpeed(), 9);
		Bob.setSpeed(19);
		assertEquals(Bob.getSpeed(), 19);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getSpeed(), 0);
		Sally.setSpeed(1);
		assertEquals(Sally.getSpeed(), 1);
		Sally.setSpeed(2);
		assertEquals(Sally.getSpeed(), 2);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getSpeed(), 1);
		Billy.setSpeed(10);
		assertEquals(Billy.getSpeed(), 10);
		Billy.setSpeed(5);
		assertEquals(Billy.getSpeed(), 5);
		Billy.setSpeed(15);
		assertEquals(Billy.getSpeed(), 15);
		
		User Suzy = new User(10, 0, 10);
		assertEquals(Suzy.getSpeed(), 10);
		Suzy.setSpeed(0);
		assertEquals(Suzy.getSpeed(), 0);
		Suzy.setSpeed(17);
		assertEquals(Suzy.getSpeed(), 17);
		Suzy.setSpeed(0);
		assertEquals(Suzy.getSpeed(), 0);
	}
	
	@Test
	void testGetUserPoints() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getUserPoints(), 0);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getUserPoints(), 0);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getUserPoints(), 0);
	}
	
	@Test
	void testSetUserPoints() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getUserPoints(), 0);
		Bob.setPoints(2);
		assertEquals(Bob.getUserPoints(), 2);
		Bob.setPoints(4);
		assertEquals(Bob.getUserPoints(), 4);
		Bob.setPoints(10);
		assertEquals(Bob.getUserPoints(), 10);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getUserPoints(), 0);
		Sally.setPoints(5);
		assertEquals(Sally.getUserPoints(), 5);
		Sally.setPoints(5);
		assertEquals(Sally.getUserPoints(), 5);
		Sally.setPoints(15);
		assertEquals(Sally.getUserPoints(), 15);
		Sally.setPoints(29);
		assertEquals(Sally.getUserPoints(), 29);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getUserPoints(), 0);
		Billy.setPoints(11);
		assertEquals(Billy.getUserPoints(), 11);
		Billy.setPoints(7);
		assertEquals(Billy.getUserPoints(), 7);
		Billy.setPoints(0);
		assertEquals(Billy.getUserPoints(), 0);
		Billy.setPoints(11);
		assertEquals(Billy.getUserPoints(), 11);
		Billy.setPoints(21);
		assertEquals(Billy.getUserPoints(), 21);
		Billy.setPoints(100);
		assertEquals(Billy.getUserPoints(), 100);
	}
	
	@Test
	void testCurrentWeaponName() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.currentWeaponName(), null);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.currentWeaponName(), null);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.currentWeaponName(), null);
		
		User Suzy = new User(10, 0, 10);
		assertEquals(Suzy.currentWeaponName(), null);
	}
	
	@Test
	void testSetCurrentWeapon() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.currentWeaponName(), null);
		Bob.setCurrentWeapon("Sword");
		assertEquals(Bob.currentWeaponName(), "Sword");
		Bob.setCurrentWeapon("Sword of Evil");
		assertEquals(Bob.currentWeaponName(), "Sword of Evil");
		Bob.setCurrentWeapon("Knife");
		assertEquals(Bob.currentWeaponName(), "Knife");
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.currentWeaponName(), null);
		Sally.setCurrentWeapon("Large rock");
		assertEquals(Sally.currentWeaponName(), "Large rock");
		Sally.setCurrentWeapon("Sword");
		assertEquals(Sally.currentWeaponName(), "Sword");
		Sally.setCurrentWeapon("Large rock");
		assertEquals(Sally.currentWeaponName(), "Large rock");
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.currentWeaponName(), null);
		Billy.setCurrentWeapon("Rock");
		assertEquals(Billy.currentWeaponName(), "Rock");
		Billy.setCurrentWeapon("Small rock");
		assertEquals(Billy.currentWeaponName(), "Small rock");
		Billy.setCurrentWeapon("Medium rock");
		assertEquals(Billy.currentWeaponName(), "Medium rock");
		
		User Suzy = new User(10, 0, 10);
		assertEquals(Suzy.currentWeaponName(), null);
		Suzy.setCurrentWeapon("Zzz");
		assertEquals(Suzy.currentWeaponName(), "Zzz");
		Suzy.setCurrentWeapon("There are many weapons");
		assertEquals(Suzy.currentWeaponName(), "There are many weapons");
		Suzy.setCurrentWeapon("Alligators");
		assertEquals(Suzy.currentWeaponName(), "Alligators");
	}
	
	@Test
	void testGetUserChoice1() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getUserChoice1(), 0);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getUserChoice1(), 0);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getUserChoice1(), 0);
	}
	
	@Test
	void testSetUserChoice1() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getUserChoice1(), 0);
		Bob.setUserChoice1(2);
		assertEquals(Bob.getUserChoice1(), 2);
		Bob.setUserChoice1(4);
		assertEquals(Bob.getUserChoice1(), 4);
		Bob.setUserChoice1(10);
		assertEquals(Bob.getUserChoice1(), 10);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getUserChoice1(), 0);
		Sally.setUserChoice1(5);
		assertEquals(Sally.getUserChoice1(), 5);
		Sally.setUserChoice1(5);
		assertEquals(Sally.getUserChoice1(), 5);
		Sally.setUserChoice1(15);
		assertEquals(Sally.getUserChoice1(), 15);
		Sally.setUserChoice1(29);
		assertEquals(Sally.getUserChoice1(), 29);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getUserChoice1(), 0);
		Billy.setUserChoice1(11);
		assertEquals(Billy.getUserChoice1(), 11);
		Billy.setUserChoice1(7);
		assertEquals(Billy.getUserChoice1(), 7);
		Billy.setUserChoice1(0);
		assertEquals(Billy.getUserChoice1(), 0);
		Billy.setUserChoice1(11);
		assertEquals(Billy.getUserChoice1(), 11);
		Billy.setUserChoice1(21);
		assertEquals(Billy.getUserChoice1(), 21);
		Billy.setUserChoice1(100);
		assertEquals(Billy.getUserChoice1(), 100);
	}
	
	@Test
	void testGetUserChoice2() {
		User Bob = new User(5, 10, 15);
		assertEquals(Bob.getUserChoice2(), 0);
		
		User Sally = new User(10, 5, 0);
		assertEquals(Sally.getUserChoice2(), 0);
		
		User Billy = new User(0, 22, 1);
		assertEquals(Billy.getUserChoice2(), 0);
	}
}
