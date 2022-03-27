import java.util.Random;

public class Room {

	private String name;
	private String[] nameArray = {"Haunted Forest", "Meadow", "Slithering Stream", "Cave", "Mall", "Sewers", "Rooftop"};
	private Location location;
	private RoomResources resources=new RoomResources();
	
	
	public Room(String n,Location loc) {
		name=n;
		location=loc;
	}
	
	// Added this constructor so that the Room() constructor in Game wouldn't have an error
	public Room() {
		Random rand = new Random(); //instance of random class
		name = nameArray[rand.nextInt(8)];		// chose one of the names in the nameArray
		location = new Location();
	}
	
	public String getName() {
		return name;
	}
	public Location getLocation() {
		return location;
	}
	public RoomResources getRoomResources() {
		return resources;
	}
}
