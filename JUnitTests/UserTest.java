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
	void testChooseNextRoom() {
		fail("Not yet implemented");
	}

	@Test
	void testWeaponPickup() {
		fail("Not yet implemented");
	}

	@Test
	void testPotionPickup() {
		fail("Not yet implemented");
	}

	@Test
	void testGetArmory() {
		fail("Not yet implemented");
	}

	@Test
	void testGetStash() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	void testGetSpeed() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}
	
	@Test
	void testSetSpeed() {
		fail("Not yet implemented");
	}



}
