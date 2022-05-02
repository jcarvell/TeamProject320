package teamproject.cs320;

public class User {
	private int health, strength, speed, userPoints, userChoice1, userChoice2;
	private String currentWeaponName;

	public User() {

	}

	public User(int a, int b, int c) {
		health = a;
		strength = b;
		speed = c;
	}

	public int getUserChoice1() {
		return userChoice1;
	}

	public void setUserChoice1(int choice1) {
		userChoice1 = choice1;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int x) {
		health = x;
	}

	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setStrength(int x) {
		strength = x;
	}

	public void setSpeed(int x) {
		speed = x;
	}

	public int getUserPoints() {
		return userPoints;
	}

	public void setPoints(int x) {
		userPoints = x;
	}

	public String currentWeaponName() {
		return currentWeaponName;
	}

	public void setCurrentWeapon(String x) {
		currentWeaponName = x;
	}

}
