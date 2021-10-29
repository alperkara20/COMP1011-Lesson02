
public class Hero implements Action{

	//Properties -----------------------
	protected int strenght;
	protected int speed;
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
		this.name = name;
		generateAbilities();
	}

	//Methods ----------------------------
	void showAbilities() {
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("Strength: " + this.strenght);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("+++++++++++++++++++++++++");
	}
    public void generateAbilities() {
		this.strenght = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
		
	}
	public void fight() {
		System.out.println(this.name + " is fighting");
	}
	
	public void run() {
		System.out.println(this.name + " is running");

	}
	
	public void showName() {
		System.out.println(name);
	}
	
	public void kills() {
		System.out.println(this.name + " killed.");
	}
}
