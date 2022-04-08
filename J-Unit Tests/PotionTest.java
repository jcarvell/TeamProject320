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
		Potion p1 = new Potion();
		Potion p2 = new Potion();
		Potion p3 = new Potion();
	}

	@Test
	void testGetHealthIncreaseAmount() {
		Potion potion1 = new Potion(5, 10, "Red Serum");
		assertEquals(potion1.getHealthIncreaseAmount(), 5);
		
		Potion potion2 = new Potion(13, 2, "Elixir");
		assertEquals(potion2.getHealthIncreaseAmount(), 13);
		
		Potion potion3 = new Potion(20, 0, "Remedy");
		assertEquals(potion3.getHealthIncreaseAmount(), 20);
		
		Potion potion4 = new Potion(0, 3, "Zoom");
		assertEquals(potion4.getHealthIncreaseAmount(), 0);
		
		Potion potion5 = new Potion();
		// this is under the assumption that the potion cannot decrease health
		int h5 = potion5.getHealthIncreaseAmount();
		if((h5 < 0) || (h5 > potion5.getMaxPotionHealthIncrease())) {
			fail("Health increase is out of bounds");
		}
		
		Potion potion6 = new Potion();
		// this is under the assumption that the potion cannot decrease health
		int h6 = potion6.getHealthIncreaseAmount();
		if((h6 < 0) || (h6 > potion6.getMaxPotionHealthIncrease())) {
			fail("Health increase is out of bounds");
		}
	}

	@Test
	void testGetSpeedIncreaseAmount() {
		Potion potion1 = new Potion(5, 10, "Red Serum");
		assertEquals(potion1.getSpeedIncreaseAmount(), 10);
		
		Potion potion2 = new Potion(13, 2, "Elixir");
		assertEquals(potion2.getSpeedIncreaseAmount(), 2);
		
		Potion potion3 = new Potion(20, 0, "Remedy");
		assertEquals(potion3.getSpeedIncreaseAmount(), 0);
		
		Potion potion4 = new Potion(0, 3, "Zoom");
		assertEquals(potion4.getSpeedIncreaseAmount(), 3);
		
		Potion potion5 = new Potion();
		// this is under the assumption that the potion cannot decrease speed
		int s5 = potion5.getSpeedIncreaseAmount();
		if((s5 < 0) || (s5 > potion5.getMaxPotionSpeedIncrease())) {
			fail("Speed increase is out of bounds");
		}
		
		Potion potion6 = new Potion();
		// this is under the assumption that the potion cannot decrease speed
		int s6 = potion6.getSpeedIncreaseAmount();
		if((s6 < 0) || (s6 > potion6.getMaxPotionSpeedIncrease())) {
			fail("Speed increase is out of bounds");
		}
	}

	@Test
	void testGetName() {
		Potion potion1 = new Potion(5, 10, "Red Serum");
		assertEquals(potion1.getName(), "Red Serum");
		
		Potion potion2 = new Potion(13, 2, "Elixir");
		assertEquals(potion2.getName(), "Elixir");
		
		Potion potion3 = new Potion(20, 0, "Remedy");
		assertEquals(potion3.getName(), "Remedy");
		
		Potion potion4 = new Potion(0, 3, "Zoom");
		assertEquals(potion4.getName(), "Zoom");
		
		Potion potion5 = new Potion();
		String n5 = potion5.getName();
		if((n5 != "Witch's Brew") && (n5 != "Slug Trouble") && (n5 != "Spooky Scary Potion") && (n5 != "Green Vial") && (n5 != "Blue Vial") && (n5 != "Red potion") && (n5 != "Orange Juice")) {
			fail("Potion name not one of the potionNames");
		}
	}

}
