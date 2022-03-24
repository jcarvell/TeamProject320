
public class Potion {

	private int healthIncreaseAmount;
	private int speedIncreaseAmount; 
	private String name;
	
	public Potion(int x, int y, String z) {
		healthIncreaseAmount=x;
		speedIncreaseAmount=y;
		name=z;
	}
	
	public int getHealthIncreaseAmount(){
		return healthIncreaseAmount;
		
	}
	public int getSpeedIncreaseAmount(){
		return speedIncreaseAmount;
		
	}
}
	
	
