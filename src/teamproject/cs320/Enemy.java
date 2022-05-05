package teamproject.cs320;

import java.util.Random;

public class Enemy {
	private String name;
	private int health;
	private int strength;
	private int speed;
	private int randomEnemy;
	private int enemyPoints;
	
	public static final Random RANDOM = new Random();
	public static final String[] names = {"No Enemy","Zombie" , "Alligator" , "Baby" , "King Zombie"};
	public static final int [] enemy_Health = { 0, 50 , 50, 5, 100 };
	public static final  int [] enemy_Strength = { 0, 10 , 50 , 1, 100 };
	public static final int [] enemy_Speed = { 0, 5 , 1 , 1, 100 };
	
	public Enemy(int hel, int str,int spe, String n) {
		health=hel;
		strength=str;
		speed=spe;
		name = n;
		
		enemyPoints = hel;
	}
	
	public Enemy() {
		
		
		int randomEnemy = RANDOM.nextInt(8);
		if(randomEnemy <= 3) {
			randomEnemy = 0;
		}else {
			randomEnemy -= 3;
		}
		
		name = names[randomEnemy];
		health = enemy_Health[randomEnemy];
		strength = enemy_Strength[randomEnemy];
		speed = enemy_Speed[randomEnemy];
		enemyPoints = health;
	}
	
	public int dealDamage(){
		return strength;
	}
	
	public String getName() {
		return name;	
	}
	
	public int getHealth(){
		return health;
	}
	public void setHealth(int x) {
		health=x;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getSpeed(){
		return speed; 
	}
	public int getPoints() {
		return enemyPoints;
	}

	
}
