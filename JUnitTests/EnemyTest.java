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
		// Declare enemies
		Enemy monster = new Enemy(5, 7, 9, "Green Monster");
		Enemy Bob = new Enemy(0, 5, 10, "Bob the Bad Guy");
		Enemy dragon = new Enemy(10, 10, 0, "Dragon");
		
		// Check initial health
		assertEquals(monster.getHealth(), 5);
		assertEquals(Bob.getHealth(), 0);
		assertEquals(dragon.getHealth(), 10);
		
		// Use setHealth()
		monster.setHealth(10);
		Bob.setHealth(1);
		dragon.setHealth(5);
		
		// Check setHealth() worked
		assertEquals(monster.getHealth(), 10);
		assertEquals(Bob.getHealth(), 1);
		assertEquals(dragon.getHealth(), 5);

		// Use setHealth() for a second time
		monster.setHealth(0);
		Bob.setHealth(2);
		dragon.setHealth(5);
		
		// Check setHealth() worked
		assertEquals(monster.getHealth(), 0);
		assertEquals(Bob.getHealth(), 2);
		assertEquals(dragon.getHealth(), 5);

		// Use setHealth() for a third time
		monster.setHealth(27);
		Bob.setHealth(42);
		dragon.setHealth(55);
		
		// Check setHealth() worked
		assertEquals(monster.getHealth(), 27);
		assertEquals(Bob.getHealth(), 42);
		assertEquals(dragon.getHealth(), 55);
		
		
		// Declare enemies using Enemy()
		Enemy snake = new Enemy();
		Enemy lizard = new Enemy();
		Enemy newt = new Enemy();
		
		// Use setHealth()
		snake.setHealth(5);
		lizard.setHealth(33);
		newt.setHealth(97);
		
		// Check setHealth() worked
		assertEquals(snake.getHealth(), 5);
		assertEquals(lizard.getHealth(), 33);
		assertEquals(newt.getHealth(), 97);
		
		// Use setHealth() for a second time
		snake.setHealth(0);
		lizard.setHealth(30);
		newt.setHealth(76);
		
		// Check setHealth() worked
		assertEquals(snake.getHealth(), 0);
		assertEquals(lizard.getHealth(), 30);
		assertEquals(newt.getHealth(), 76);
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
