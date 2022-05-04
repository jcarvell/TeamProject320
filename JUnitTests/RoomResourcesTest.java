import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Enemy;
import teamproject.cs320.NPCs;
import teamproject.cs320.Potion;
import teamproject.cs320.RoomResources;
import teamproject.cs320.User;
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
		Potion p1 = new Potion(5, 10, "Soup");
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy();
		NPCs n1 = new NPCs();
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		assertEquals(r1.getnumPotions(), 0);
		r1.setPotion(1);
		assertEquals(r1.getnumPotions(), 1);
		r1.setPotion(2);
		assertEquals(r1.getnumPotions(), 2);
		r1.setPotion(2);
		assertEquals(r1.getnumPotions(), 2);
		r1.setPotion(1);
		assertEquals(r1.getnumPotions(), 1);
		
		RoomResources r2 = new RoomResources();
		r2.setPotion(3);
		assertEquals(r2.getnumPotions(), 3);
		r2.setPotion(4);
		assertEquals(r2.getnumPotions(), 4);
	}
	
	@Test
	void testGetNumPotions() {
		Potion p1 = new Potion(5, 10, "Soup");
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy();
		NPCs n1 = new NPCs();
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		assertEquals(r1.getnumPotions(), 0);
		
		
		RoomResources r2 = new RoomResources();
		r2.setPotion(3);
		assertEquals(r2.getnumPotions(), 3);
		r2.setPotion(4);
		assertEquals(r2.getnumPotions(), 4);
	}
	
	@Test
	void testCalculatePoints() {
		// Test CalculatePoints() with RoomResources(Potion, Weapon, Enemy, NPC)
		// Create fake user, and int variable for to store points before calculatePoints()
		User fake = new User();
		int orginalPoints = 0;
		
		// Create the first room
		Potion p1 = new Potion();
		Weapon w1 = new Weapon();
		Enemy e1 = new Enemy();
		NPCs n1 = new NPCs();
		RoomResources r1 = new RoomResources(p1, w1, e1, n1);
		
		// Get points before calculatePoints, calculatePoints(), and compare
		orginalPoints = fake.getUserPoints();
		r1.calculatePoints(fake);
		assertEquals(fake.getUserPoints(), (orginalPoints + e1.getPoints()));
		
		// Create a second room
		Potion p2 = new Potion();
		Weapon w2 = new Weapon();
		Enemy e2 = new Enemy();
		NPCs n2 = new NPCs();
		RoomResources r2 = new RoomResources(p2, w2, e2, n2);
		
		// Get points before calculatePoints, calculatePoints(), and compare
		orginalPoints = fake.getUserPoints();
		r2.calculatePoints(fake);
		assertEquals(fake.getUserPoints(), (orginalPoints + e2.getPoints()));
		
		// Create a third room
		Potion p3 = new Potion();
		Weapon w3 = new Weapon();
		Enemy e3 = new Enemy();
		NPCs n3 = new NPCs();
		RoomResources r3 = new RoomResources(p3, w3, e3, n3);
		
		// Get points before calculatePoints, calculatePoints(), and compare
		orginalPoints = fake.getUserPoints();
		r3.calculatePoints(fake);
		assertEquals(fake.getUserPoints(), (orginalPoints + e3.getPoints()));
		
		
		// Test CalculatePoints() with RoomResources()
		// Create fake user, and int variable for to store points before calculatePoints() 
		User scamArtist = new User();
		int originalScamPoints;
		
		// Create first room
		RoomResources scammerRoom1 = new RoomResources();
		
		// Get points before calculatePoints, calculatePoints(), and compare
		originalScamPoints = scamArtist.getUserPoints();
		scammerRoom1.calculatePoints(scamArtist);
		assertEquals(scamArtist.getUserPoints(), (originalScamPoints + scammerRoom1.getEnemy().getPoints()));

		// Create second room
		RoomResources scammerRoom2 = new RoomResources();
		
		// Get points before calculatePoints, calculatePoints(), and compare
		originalScamPoints = scamArtist.getUserPoints();
		scammerRoom2.calculatePoints(scamArtist);
		assertEquals(scamArtist.getUserPoints(), (originalScamPoints + scammerRoom2.getEnemy().getPoints()));

		// Create third room
		RoomResources scammerRoom3 = new RoomResources();
		
		// Get points before calculatePoints, calculatePoints(), and compare
		originalScamPoints = scamArtist.getUserPoints();
		scammerRoom3.calculatePoints(scamArtist);
		assertEquals(scamArtist.getUserPoints(), (originalScamPoints + scammerRoom3.getEnemy().getPoints()));
	}
	// other methods mainly print things, not sure how to test that
}
