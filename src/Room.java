
public class Room {

	private String name;
	private Location location;
	private RoomResources resources=new RoomResources();
	
	public Room(String n,Location loc) {
		name=n;
		location=loc;
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
