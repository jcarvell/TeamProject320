import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Enemy;
import teamproject.cs320.NPCs;
import teamproject.cs320.Potion;
import teamproject.cs320.RoomResources;
import teamproject.cs320.Weapon;

class RoomResources_Random {

	@Test
	void test() {
		int numTests = 100;
		RoomResources r[] = new RoomResources[numTests];
		Enemy enemy[] = new Enemy[numTests];
		
		for(int i = 0; i < numTests; i++) {
			r[i] = new RoomResources();
		}
		
		for(int i = 0; i < numTests; i++) {
			enemy[i] = r[i].getEnemy();
		}
		
		fail("Test not implemented yet");
	}

}
