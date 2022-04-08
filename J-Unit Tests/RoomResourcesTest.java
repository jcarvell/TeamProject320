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
		Potion p1 = new Potion();
		Weapon w1 = new Weapon(10, "Sword of Terror");
		Enemy e1 = new Enemy();
		NPCs n1[] = new NPCs[20];
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		
		Weapon retrievedWeapon = r1.getWeapon();
		assertEquals(retrievedWeapon.getStrengthBuff(), 10);
		assertEquals(retrievedWeapon.getName(), "Sword of Terror");
	}

	@Test
	void testGetEnemies() {
		Potion p1 = new Potion();
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy(3, 6, 9, "Monstrous Lizard");
		NPCs n1[] = new NPCs[20];
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		
		Enemy retrievedEnemy = r1.getEnemy();
		assertEquals(retrievedEnemy.getHealth(), 3);
		assertEquals(retrievedEnemy.getStrength(), 6);
		assertEquals(retrievedEnemy.getSpeed(), 9);
		assertEquals(retrievedEnemy.getName(), "Monstrous Lizard");
	}

	@Test
	void testGetNPCArray() {
		Potion p1 = new Potion();
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy();
		NPCs n1[] = new NPCs[2];
		n1[0] = new NPCs("You will die a horrible death");
		n1[1] = new NPCs("Cookie?");
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		
		NPCs retrievedNPCs[] = r1.getNPCArray();
		assertEquals(retrievedNPCs[0].getDialogue(), "You will die a horrible death");
		assertEquals(retrievedNPCs[1].getDialogue(), "Cookie?");
	}

}
