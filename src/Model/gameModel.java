package Model;

import teamproject.cs320.Enemy;
import teamproject.cs320.NPCs;
import teamproject.cs320.Potion;
import teamproject.cs320.Room;
import teamproject.cs320.User;
import teamproject.cs320.Weapon;

public class gameModel{

	private User user = new User();
	private Enemy enemy = new Enemy();
	private Weapon weapon = new Weapon();
	private NPCs npc = new NPCs();
	private Potion potion = new Potion();
	private Room room = new Room();
	
	
	public gameModel(){
		
	}
	
	public User getUser() {
		return user;
	}
	
	public Room getRoom() {
		return room;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public NPCs getNPCs() {
		return npc;
	}
	
	public Potion getPotion() {
		return potion;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void setNPCs(NPCs npc) {
		this.npc = npc;
	}
	
	public void setPotion(Potion potion) {
		this.potion = potion;
	}
	
	public void setRoom(Room room) {
		this.room = room;
	}
}