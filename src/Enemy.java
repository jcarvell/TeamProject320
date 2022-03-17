
public class Enemy {
	private String name;
	private int health;
	private int strength;
	int speed;
	private Item item=null;
	
	public Enemy(int hel, int str,int spe,Item i) {
		health=hel;
		strength=str;
		speed=spe;
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
