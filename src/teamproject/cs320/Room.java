package teamproject.cs320;
import java.util.Random;

public class Room {

	private String name;
	private String[] nameArray = {"Haunted Forest", "Meadow", "Slithering", "Cave", "Mall", "Sewers", "Rooftop"};

	private RoomResources resources;
	
	//ADDD STREAM BACK IN
	public Room(String n) {
		name=n;
		resources = new RoomResources();
	}
	
	// Added this constructor so that the Room() constructor in Game wouldn't have an error
	public Room() {
		Random rand = new Random(); //instance of random class
		name = nameArray[rand.nextInt(6)];		// chose one of the names in the nameArray
		resources = new RoomResources();
	}
	
	public Room(String n, RoomResources r) {
		name=n;
		resources = r;
	}
	
	public String getName() {
		return name;
	}
	public RoomResources getRoomResources() {
		return resources;
	}
	
	public void setRoomName(String roomName) {
		name = roomName;
	}
	
}
