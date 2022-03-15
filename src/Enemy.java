
public class Enemy {
	String name;
	int health;
	int strength;
	int speed;
	Item item=null;
	public Enemy(int hel, int str,int spe,Item i) {
		health=hel;
		strength=str;
		speed=spe;
		item=i;
		
	}
	public int dealDamage(){
		return strength;
	}
}
