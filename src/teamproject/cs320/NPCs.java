package teamproject.cs320;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;


public class NPCs {
	private String npc; 
	private String dialogue;
	private String roomName;
	
	Scanner in = new Scanner (System.in);
	Random rand = new Random(); 
	
	// constructor 
	public NPCs() {
	}
	
	public NPCs(String roomName) {
		this.roomName = roomName;		// placeholder dialogue
	}
	
	public void setNPC(String x) {
		npc = x;
	}
	public String getNPC() {
		return npc;
	}
	
	public String getDialogue() {
		return dialogue;
	}
	public void setRoomName(String x) {
		roomName = x;
	}
	
	public int printNPCinteraction(User user) {
		int R = 0;
		System.out.println("You are in:" + roomName);
		if(roomName == "Meadow"){
			System.out.println("There is a tree in the middle of the meadow with a man standing at the base of the tree.");
			setNPC("Sheep Hearder");
			System.out.println("Would you like to approach the man? ");
			int choice = in.nextInt();
			if(choice == 1) {
				System.out.println(npc + " heals you and wishes you luck. ");
				user.setHealth(100);
				System.out.println("Your health is now 100.");
				R = 1;
			
			}
			else {
				System.out.println();
				R = 0;
			}
		}
		else if(roomName == "Haunted Forest"){
				System.out.println("There is an erie looking figure.");
				setNPC("Vampire");
				System.out.println("Would you like to approach the man? ");
				int choice = in.nextInt();
				if(choice == 1) {
					System.out.println(npc + " attacks you sucks out your blood which drains your health.");
					user.setHealth(user.getHealth() - 10);
					R = 1;
				}
				else {
					System.out.println();
					R = 0;
				}
		}
		else if(roomName == "Slithering Stream"){
			System.out.println("There is an man fishing in the river.");
			setNPC("Fisher");
			System.out.println("Would you like to approach the man? ");
			int choice = in.nextInt();
			if(choice == 1) {
				System.out.println("Hello how are you today?");
				System.out.println("Would you like a fish?");
				int choice2 = in.nextInt();
				if(choice2 == 1 ) {
					System.out.println("You enjoy the wonderful fish. ");
					user.setHealth(user.getHealth() + 20);
					R = 1;
				}
				else {
					System.out.println();
					R = 0;
				}
			}
			else {
				System.out.println();
				R= 0;
			}
	}
		if(roomName == "Cave"){
			System.out.println("You look into the Cave and stare into the dark abyss.");
			setNPC("Bats");
			System.out.println("Would you like to go in the cave? ");
			int choice = in.nextInt();
			if(choice == 1) {
				System.out.println(npc + " come flying out of the cave and scare you. ");
				R = 0;
			}
			else {
				System.out.println();
				R = 0;
			}
		}
		if(roomName == "Mall"){
			System.out.println("You walk into an abandon mall");
			R = 0;

		}
		if(roomName == "Sewers"){
			setNPC("Alligator");
			System.out.println("You drop down into the Sewer");
			System.out.println("You hear a swirlling in the water.");
			System.out.println("You look down and its an Alligator!");
			R = 3;
		}
		else {
			if(roomName == "Rooftop"){
				System.out.println("You look around and feel a cold breeze.");
				setNPC("Heli");
				System.out.println("You hear the sound of a helicopter coming towards you. ");
				System.out.println("Would you like to leave this island and be saved? ");

				int choice = in.nextInt();
				if(choice == 1) {
					System.out.println("You climb into the helicopter and fly away. " );
					R = 4;
				}
				else {
					System.out.println();
					R = 0;
				}
			}
			
		}
		return R;
	}
	
	
	
}
