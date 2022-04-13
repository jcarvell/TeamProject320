package teamproject.cs320;

public class Map {
	
	
	private Room[] roomChoices;
	
	public Map() {
		roomChoices[0]=null;
	} 
	public void addRoom(Room a) {
		
		roomChoices[roomChoices.length]=a;
		
	}
	public Room choiceOne(int roomNumber){
		
		return roomChoices[roomNumber];
	}
	public Room choiceTwo(int roomNumber){
		
		return roomChoices[roomNumber];
	}
}
