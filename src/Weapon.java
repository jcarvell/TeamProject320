import java.util.Random;

public class Weapon {
	
	private int strengthBuff;
	private String name;
	
	String[] weaponNames = { "Gloves" , "Knife", "Machette" , "Handgun" , "Sword" };
	int [] maxWeaponDamage = { 10, 20 , 50 , 500 , 200};
	
	public Weapon(int x, String y) {
		strengthBuff=x;
		name=y;
	}
	public Weapon() {
		
		Random rand = new Random(); //instance of random class
		
	    int upperbound = 4;			// corresponding to 0-4 (five elements) of weaponNames
	        //generate random values from 0-4
	    //rand.nextInt(n) gets a random number between 0(inclusive) and the number passed in this argument(n), exclusive
	    int random1 = rand.nextInt(upperbound); 	// random number between 1 and 5, so it excludes "unarmed" as a weapon name
	    name=weaponNames[random1];
	    strengthBuff = maxWeaponDamage[random1];
	      
	}
	
	public int getStrengthBuff() {
		return strengthBuff;
	}
	public String getName() {
		return name;
	}
	
}
