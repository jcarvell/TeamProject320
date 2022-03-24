import java.util.Random;

public class Weapon {
	
	private int strengthBuff;
	private String name;
	
	String[] weaponNames = { "unarmed" , "Knife", "Machette" , "Handgun" , "Sword" };
	int [] maxWeaponDamage = { 10, 20 , 50 , 500 , 200};
	
	public Weapon(int x, String y) {
		strengthBuff=x;
		name=y;
	}
	public Weapon() {
		
		Random rand = new Random(); //instance of random class
		
	    int upperbound = 4;
	        //generate random values from 0-5
	    int random1 = rand.nextInt(upperbound - 1) + 1; 
	    int random2 = rand.nextInt(upperbound);
	    
	    name=weaponNames[random1];
	    strengthBuff=maxWeaponDamage[random2];	    
	}
	
	public int getStrengthBuff() {
		return strengthBuff;
	}
	public String getName() {
		return name;
	}
	
}
