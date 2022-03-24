
import java.util.Random;

public class Enemy {
	private String name;
	private int health;
	private int strength;
	int speed;
	private Item item=null;
	
	String[] names = {"No Enemy" ,"Zombie" , "Allegator" , "Baby" , "King Zombie"};
	int [] enemy_Health = { 0, 50 , 300, 5, 100000 };
	int [] enemy_Strength = { 0, 10 , 50 , 1, 100 };
	int [] enemy_Speed = { 0, 5 , 10 , 1, 100 };
	
	public Enemy(int hel, int str,int spe,Item i) {
		health=hel;
		strength=str;
		speed=spe;
		item=i;
		
	}
	
	public Enemy(Weapon i) {
		
		Random rand = new Random(); //instance of random class
	    int upperbound = 4;
	        //generate random values from 0-5
	    int random1 = rand.nextInt(upperbound); 
	    int random2 = rand.nextInt(upperbound); 
	    int random3 = rand.nextInt(upperbound); 
	    int random4 = rand.nextInt(upperbound); 
	    
		health=enemy_Health[random1];
		strength=enemy_Strength[random2];
		speed=enemy_Speed[random3];
		name=names[random4];
		item=i;
		
	}
	public int dealDamage(){
		return strength;
	}
	
	public String getEnemyName() {
		return name;	
	}
	
	public int getEnemyHealth(){
		return health;
	}
	
	public int getEnemyStrength(){
		return strength;
	}
	
	public int getEnemySpeed(){
		return speed; 
	}
	
	
}
