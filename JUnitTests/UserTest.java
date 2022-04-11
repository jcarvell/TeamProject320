import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
		fail("Not yet implemented");
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
