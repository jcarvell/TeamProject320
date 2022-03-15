
public class Potion {

	private int healthIncreaseAmount;
	private int speedIncreaseAmount; 
	
	public Potion(int x, int y) {
		healthIncreaseAmount=x;
		speedIncreaseAmount=y;
	}
	
	public int getHealthIncreaseAmount(){
		return healthIncreaseAmount;
		
	}
	public int getSpeedIncreaseAmount(){
		return speedIncreaseAmount;
		
	}
}
	
	
