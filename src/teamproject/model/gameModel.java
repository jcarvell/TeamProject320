package teamproject.model;

import teamproject.cs320.*;
public class gameModel {

	private User player;
	private Enemy enemy;
	private Weapon weapon;
	private Potion potions;
	
	public gameModel(User player, Enemy enemy, 
			Weapon weapon, Potion potions){
		
		this.enemy = enemy;
		this.player = player;
		this.potions = potions;
		this.weapon = weapon;
		
	}
	
	public gameModel() { //start game setting
		
		player = new User(100,100,50);
		enemy = new Enemy(0,0,0, "none");
		potions = new Potion();
		weapon = new Weapon();
	}
	
	//I'll add the getter and setters later
			
	
	
}
