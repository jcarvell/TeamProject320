package Controller;

import java.util.*;

import teamproject.model.*;

import teamproject.cs320.*;

public class GameController{
	gameModel model = new gameModel();
	Random rand = new Random(); //instance of random class
	Room choice1 = new Room();
	Room choice2 = new Room();
	
	
	public void setModel(gameModel model) {
		this.model = model;
	}
	
	public void startGame() {
		System.out.println("Welcome to the Baby Zombies Game");
		System.out.println("Would you like to begin the game? ");
		
	}
	
	public void choiceOne() {
		System.out.println("You have entered " + choice1.getName());
		if(choice1.getRoomResources().getEnemy().getHealth() > 0) {
			System.out.println("You are suddenly face to face with: " + choice1.getRoomResources().getEnemy().getName());
		}
		
		else {
		
			choice1.getRoomResources().noEnemyRoom(model.getPlayer(), choice1);
	
		}
		
	}
	public void choiceTwo() {
		System.out.println("You have entered " + choice2.getName());
		if(choice2.getRoomResources().getEnemy().getHealth() > 0) {
			System.out.println("You are suddenly face to face with: " + choice2.getRoomResources().getEnemy().getName());	
	}
		else {
			choice2.getRoomResources().noEnemyRoom(model.getPlayer(), choice2);
		}
	
	}
	
	
	
	
	
}

