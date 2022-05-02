package teamproject.cs320;
import java.util.Random;

public class Potion {
	private static int maxPotionHealth = 10, maxPotionSpeed = 10; 	// I choose these value arbitrarily, feel free to change them
	
	private int healthIncreaseAmount;
	private int speedIncreaseAmount; 
	private String name;
	private int numPotions;
	

	
	String[] potionNames = {"Witch's Brew", "Slug Trouble", "Spooky Scary Potion", "Green Vial", "Blue Vial", "Red potion", "Orange Juice"};
	
	public Potion(int healthIncrease, int speedIncrease, String z) {
		healthIncreaseAmount = healthIncrease;
		speedIncreaseAmount = speedIncrease;
		name=z;
	}
	
	public Potion() {
		Random rand = new Random(); // instance of random class
		healthIncreaseAmount = rand.nextInt(maxPotionHealth)+1;	// set the health increase for the potion to a random number between one and maxPotionHealth
		speedIncreaseAmount = rand.nextInt(maxPotionSpeed)+1;		// set the speed increase for the potion to a random number between one and maxPotionSpeed
		name = potionNames[rand.nextInt(7)];		// set the name of the potion to a name in the potionNames array, randomly choosing index 0 through 7
	}
	
	public int getHealthIncreaseAmount(){
		return healthIncreaseAmount;
		
	}
	public int getSpeedIncreaseAmount(){
		return speedIncreaseAmount;	
	}
	public String getName() {
		return name;
	}
	public int getMaxPotionHealthIncrease() {
		return maxPotionHealth;
	}
	public int getMaxPotionSpeedIncrease() {
		return maxPotionSpeed;
	}
	
	public int getNumPotions() {
		return numPotions; 
	}
	public void setNumPotions(int numPotions) {
		this.numPotions = numPotions;
	}
}
	
	//this is a comment
