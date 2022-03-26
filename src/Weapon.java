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
		
	    int upperbound = 5;			// corresponding to 0-4 (five elements) of weaponNames
	        //generate random values from 0-4
	    //rand.nextInt(n) gets a random number between 0(inclusive) and the number passed in this argument(n), exclusive
	    int random1 = rand.nextInt(upperbound - 1) + 1; 	// random number between 1 and 5, so it excludes "unarmed" as a weapon name
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
