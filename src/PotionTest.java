import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PotionTest {

	@Test
	void testPotionIntIntString() {
		Potion potion1 = new Potion(5, 10, "Red Serum");
		assertEquals(potion1.getHealthIncreaseAmount(), 5);
		assertEquals(potion1.getSpeedIncreaseAmount(), 10);
		assertEquals(potion1.getName(), "Red Serum");
		
		Potion potion2 = new Potion(13, 2, "Elixir");
		assertEquals(potion2.getHealthIncreaseAmount(), 13);
		assertEquals(potion2.getSpeedIncreaseAmount(), 2);
		assertEquals(potion2.getName(), "Elixir");
		
		Potion potion3 = new Potion(20, 0, "Remedy");
		assertEquals(potion3.getHealthIncreaseAmount(), 20);
		assertEquals(potion3.getSpeedIncreaseAmount(), 0);
		assertEquals(potion3.getName(), "Remedy");
		
		Potion potion4 = new Potion(0, 3, "Zoom");
		assertEquals(potion4.getHealthIncreaseAmount(), 0);
		assertEquals(potion4.getSpeedIncreaseAmount(), 3);
		assertEquals(potion4.getName(), "Zoom");
	}

	@Test
	void testPotion() {
		fail("Not yet implemented");
	}

	@Test
	void testGetHealthIncreaseAmount() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSpeedIncreaseAmount() {
		fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

}
