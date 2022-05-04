import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Enemy;
import teamproject.cs320.NPCs;
import teamproject.cs320.Potion;
import teamproject.cs320.RoomResources;
import teamproject.cs320.Weapon;

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
		NPCs n1 = new NPCs();
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
	}

	@Test
	void testGetPotion() {
		Potion p1 = new Potion(5, 10, "Soup");
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy();
		NPCs n1 = new NPCs();
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
		NPCs n1 = new NPCs();
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
		NPCs n1 = new NPCs();
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		
		Enemy retrievedEnemy = r1.getEnemy();
		assertEquals(retrievedEnemy.getHealth(), 3);
		assertEquals(retrievedEnemy.getStrength(), 6);
		assertEquals(retrievedEnemy.getSpeed(), 9);
		assertEquals(retrievedEnemy.getName(), "Monstrous Lizard");
	}

	@Test
	void testGetNPCs() {
		Potion p1 = new Potion();
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy();
		NPCs n1 = new NPCs("You will die a horrible death");
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		
		NPCs retrievedNPCs = r1.getNPCs();
		assertEquals(retrievedNPCs.getDialogue(), null);
		// we don't have a getter for the roomname in NPCs
	}
	
	@Test
	void testSetPotion() {
		//setPotion(int) changes the number of potions
		RoomResources r1 = new RoomResources();
		r1.setPotion(3);
		assertEquals(r1.getnumPotions(), 3);
		r1.setPotion(4);
		assertEquals(r1.getnumPotions(), 4);
	}

}
