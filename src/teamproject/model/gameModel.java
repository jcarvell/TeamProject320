package teamproject.model;

import teamproject.cs320.*;
public class gameModel {

	private User player;
	private Enemy enemy;
	private Weapon weapon;
	private Potion potions;
	private Room room;
	private RoomResources resources;
	
	public gameModel(User player, Enemy enemy, 
			Weapon weapon, Potion potions, RoomResources resources, Room room){
		
		this.enemy = enemy;
		this.player = player;
		this.potions = potions;
		this.weapon = weapon;
		this.resources = resources;
		this.room = room;
		
	}
	
	public gameModel() { //start game setting
		
		player = new User(100,100,50);
		enemy = new Enemy(0,0,0, "none");
		potions = new Potion();
		weapon = new Weapon();
		room = new Room();
		resources = new RoomResources(); 
	}
	
	//I'll add the getter and setters later
	public User getPlayer() {
			return player;
		}
	
	
	
}
