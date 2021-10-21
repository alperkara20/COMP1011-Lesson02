
public class Hero {

	//Properties -----------------------
	private int strenght;
	private int speed;
	private int health;
	String name;
	
	//Getters --------------------------
	public int getStrenght() {
		return strenght;
	}

	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}

	//Constructor ------------------------
	public Hero(String name) {
		this.name=name;
		generateAbilities();
	}

	//Methods ----------------------------
	void showAbilities() {
		System.out.println("Strength: " + this.strenght);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);

	}
    public void generateAbilities() {
		
	}
	public void fight() {
		
	}
	
	public void run() {
		
	}
	
	public void showName() {
		System.out.println(name);
	}
}
