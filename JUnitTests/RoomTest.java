import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Room;
import teamproject.cs320.RoomResources;

class RoomTest {

	@Test
	void testRoomString() {
		String name1 = "Place";
		Room room1 = new Room(name1);
		
		String name2 = "Pizza Store";
		Room room2 = new Room(name2);
	}

	@Test
	void testRoom() {
		Room room1 = new Room();
		
		Room room2 = new Room();
	}

	@Test
	void testRoomStringRoomResources() {
		String name1 = "Place";
		RoomResources resources1 = new RoomResources();
		Room room1 = new Room(name1, resources1);
		
		String name2 = "Pizza Store";
		RoomResources resources2 = new RoomResources();
		Room room2 = new Room(name2, resources2);
	}

	@Test
	void testGetName() {
		String name1 = "Place";
		Room room1 = new Room(name1);
		assertEquals(room1.getName(), name1);
		
		String name2 = "Pizza Store";
		Room room2 = new Room(name2);
		assertEquals(room2.getName(), name2);
		
		String name3 = "Airport";
		RoomResources resources3 = new RoomResources();
		Room room3 = new Room(name3, resources3);
		assertEquals(room3.getName(), name3);
		
		String name4 = "A Very Busy Airport";
		RoomResources resources4 = new RoomResources();
		Room room4 = new Room(name4, resources4);
		assertEquals(room4.getName(), name4);
	}

	@Test
	void testGetRoomResources() {
		String name1 = "Place";
		RoomResources resources1 = new RoomResources();
		Room room1 = new Room(name1, resources1);
		assertEquals(room1.getRoomResources(), resources1);
		
		String name2 = "Pizza Store";
		RoomResources resources2 = new RoomResources();
		Room room2 = new Room(name2, resources2);
		assertEquals(room2.getRoomResources(), resources2);
	}

}
