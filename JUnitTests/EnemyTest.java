import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Enemy;

class EnemyTest {

	@Test
	void testEnemyIntIntIntString() {
		// public Enemy(int health, int strength, int speed, String name)
		Enemy monster = new Enemy(5, 7, 9, "Green Monster");
		Enemy Bob = new Enemy(0, 5, 10, "Bob the Bad Guy");
		Enemy dragon = new Enemy(10, 10, 0, "Dragon");
	}

	@Test
	void testEnemy() {
		Enemy snake = new Enemy();
		Enemy lizard = new Enemy();
		Enemy newt = new Enemy();
	}

	@Test
	void testDealDamage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		// Declare enemies
		Enemy monster = new Enemy(5, 7, 9, "Green Monster");
		Enemy Bob = new Enemy(0, 5, 10, "Bob the Bad Guy");
		Enemy dragon = new Enemy(10, 10, 0, "Dragon");
		
		// Test getName()
		assertEquals(monster.getName(), "Green Monster");
		assertEquals(Bob.getName(), "Bob the Bad Guy");
		assertEquals(dragon.getName(), "Dragon");
	}

	@Test
	void testGetHealth() {
		// Declare enemies
		Enemy monster = new Enemy(5, 7, 9, "Green Monster");
		Enemy Bob = new Enemy(0, 5, 10, "Bob the Bad Guy");
		Enemy dragon = new Enemy(10, 10, 0, "Dragon");
		
		// Test getHealth()
		assertEquals(monster.getHealth(), 5);
		assertEquals(Bob.getHealth(), 0);
		assertEquals(dragon.getHealth(), 10);
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
	void testGetPoints() {
		fail("Not yet implemented");
	}

}
