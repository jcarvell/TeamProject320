import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.User;

class UserTest {

	@Test
	void testUser() {
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
	void testGetArmoryLength() {
		fail("Not yet implemented");
	}

	@Test
	void testGetStashLength() {
		fail("Not yet implemented");
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

		User June = new User(3, 6, 9);
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



}
