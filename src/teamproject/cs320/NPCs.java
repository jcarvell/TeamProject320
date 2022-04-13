package teamproject.cs320;

public class NPCs {
	private String dialogue;
	private String roomName;
	
	
	// constructor 
	public NPCs() {
		dialogue = "Hello change";		// placeholder dialogue
		
	}
	
	public NPCs(String roomName) {
		this.roomName = roomName;		// placeholder dialogue
		
	}
	public String getDialogue() {
		return dialogue;
	}
	public void setRoomName(String x) {
		roomName = x;
	}
	
	public String printDialogue() {
		System.out.println("You are in:" + roomName);
		
		if(roomName == "Meadow") {
			dialogue = "There is a tree in the middle of the meadow with a man standing by it.";
		}else {
			dialogue = "This is the new hello dialogue";
			
		}
		return dialogue;
	}
	
	
}
