
public class StrongMan extends Hero {

	public StrongMan(String name) {
		super(name);
		this.boostSpeed();
	}
	private void boostSpeed() {
		this.strenght += 50;
		if(this.strenght > 100) {
			this.strenght = 100;
		}
	}
}
