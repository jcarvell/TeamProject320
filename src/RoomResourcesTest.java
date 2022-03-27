import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoomResourcesTest {

	@Test
	void testRoomResources() {
		RoomResources r1 = new RoomResources();
		RoomResources r2 = new RoomResources();
		RoomResources r3 = new RoomResources();
	}

	@Test
	void testRoomResourcesPotionWeaponEnemyArrayNPCsArray() {
		Potion p1 = new Potion();
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy();
		NPCs n1[] = new NPCs[20];
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
	}

	@Test
	void testGetPotion() {
		Potion p1 = new Potion(5, 10, "Soup");
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy();
		NPCs n1[] = new NPCs[20];
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		
		Potion retrievedPotion = r1.getPotion();
		assertEquals(retrievedPotion, p1);
		assertEquals(retrievedPotion.getHealthIncreaseAmount(), 5);
		assertEquals(retrievedPotion.getSpeedIncreaseAmount(), 10);
		assertEquals(retrievedPotion.getName(), "Soup");
	}

	@Test
	void testGetWeapon() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEnemies() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNPCArray() {
		fail("Not yet implemented");
	}

}
