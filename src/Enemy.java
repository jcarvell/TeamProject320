
import java.util.Random;

public class Enemy {
	private String name;
	private int health;
	private int strength;
	private int speed;

	public static final Random RANDOM = new Random();
	public static final String[] names = {"No Enemy" ,"Zombie" , "Allegator" , "Baby" , "King Zombie"};
	public static final int [] enemy_Health = { 0, 50 , 300, 5, 100000 };
	public static final  int [] enemy_Strength = { 0, 10 , 50 , 1, 100 };
	public static final int [] enemy_Speed = { 0, 5 , 10 , 1, 100 };
	
	public Enemy(int hel, int str,int spe, String n) {
		health=hel;
		strength=str;
		speed=spe;
		name = n;		
	}
	
	public Enemy() {
		name = names[RANDOM.nextInt(names.length)]; //gets random enemy from array; might have to subtract 1 idk yet
		health = enemy_Health[RANDOM.nextInt(enemy_Health.length)];
		strength = enemy_Strength[RANDOM.nextInt(enemy_Strength.length)];
		speed = enemy_Speed[RANDOM.nextInt(enemy_Speed.length)];
	}
	
	
	/*public Enemy(Weapon i) {
		
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

		
	}*/
	
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
	
	
}
