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
		// Declare enemies
		Enemy monster = new Enemy(5, 7, 9, "Green Monster");
		Enemy Bob = new Enemy(0, 5, 10, "Bob the Bad Guy");
		Enemy dragon = new Enemy(10, 10, 0, "Dragon");
		
		// Check that dealDamage returns the enemy's strength
		assertEquals(monster.dealDamage(), monster.getStrength());
		assertEquals(monster.dealDamage(), 7);
		assertEquals(Bob.dealDamage(), Bob.getStrength());
		assertEquals(Bob.dealDamage(), 5);
		assertEquals(dragon.dealDamage(), dragon.getStrength());
		assertEquals(dragon.dealDamage(), 10);

		// Declare enemies using Enemy()
		Enemy snake = new Enemy();
		Enemy lizard = new Enemy();
		Enemy newt = new Enemy();
		
		// Check that dealDamage returns the enemy's strength
		assertEquals(snake.dealDamage(), snake.getStrength());
		assertEquals(lizard.dealDamage(), lizard.getStrength());
		assertEquals(newt.dealDamage(), newt.getStrength());
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
		// Declare enemies
		Enemy monster = new Enemy(5, 7, 9, "Green Monster");
		Enemy Bob = new Enemy(0, 5, 10, "Bob the Bad Guy");
		Enemy dragon = new Enemy(10, 103, 0, "Dragon");
		
		// Test getStrength()
		assertEquals(monster.getStrength(), 7);
		assertEquals(Bob.getStrength(), 5);
		assertEquals(dragon.getStrength(), 103);
	}

	@Test
	void testGetSpeed() {
		// Declare enemies
		Enemy monster = new Enemy(5, 7, 9, "Green Monster");
		Enemy Bob = new Enemy(0, 5, 10, "Bob the Bad Guy");
		Enemy dragon = new Enemy(10, 10, 101, "Dragon");
		
		// Test getSpeed()
		assertEquals(monster.getSpeed(), 9);
		assertEquals(Bob.getSpeed(), 10);
		assertEquals(dragon.getSpeed(), 101);
	}

	@Test
	void testGetPoints() {
		// Declare enemies
		Enemy monster = new Enemy(5, 7, 9, "Green Monster");
		Enemy Bob = new Enemy(111, 5, 10, "Bob the Bad Guy");
		Enemy dragon = new Enemy(10, 10, 0, "Dragon");
		
		// Test getPoints; that the enemy's points is the same as its inital health
		assertEquals(monster.getPoints(), monster.getHealth());
		assertEquals(monster.getPoints(), 5);
		assertEquals(Bob.getPoints(), Bob.getHealth());
		assertEquals(Bob.getPoints(), 111);
		assertEquals(dragon.getPoints(), dragon.getHealth());
		assertEquals(dragon.getPoints(), 10);
		
		// Declare enemies using Enemy()
		Enemy snake = new Enemy();
		Enemy lizard = new Enemy();
		Enemy newt = new Enemy();
		
		// Test getPoints; that the enemy's points is the same as its intial health
		assertEquals(snake.getPoints(), snake.getHealth());
		assertEquals(lizard.getPoints(), lizard.getHealth());
		assertEquals(newt.getPoints(), newt.getHealth());
		
	}

}
