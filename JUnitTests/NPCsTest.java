import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.NPCs;

class NPCsTest {

	@Test
	void testNPCs() {
		NPCs n = new NPCs();
	}

	@Test
	void testNPCsString() {
		NPCs character = new NPCs("Beware!");
	}

	@Test
	void testGetDialogue() {
		NPCs sallySmith = new NPCs();
		assertEquals(sallySmith.getDialogue(), "Hello");
		
		NPCs janeJones = new NPCs("We need to get out of here! Now!");
		assertEquals(janeJones.getDialogue(), "We need to get out of here! Now!");
	}

}
