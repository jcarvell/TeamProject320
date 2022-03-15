
public class Room {

	private int roomNumber;
	private String name;
	
	public Room(String n, int r) {
		roomNumber=r;
		name=n;
	}
	public String getName() {
		return name;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
}
