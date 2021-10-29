import java.util.Scanner;

public class Project {

	public static void main(String[] args) {

		System.out.println("Enter Hero Name: ");
		Scanner scan = new Scanner(System.in);
		String heroName = scan.nextLine();
		
		//Instantiate hero
		Hero myhero = new Hero(heroName);
		myhero.showName();
		myhero.fight();
		myhero.run();
		myhero.showAbilities();
		
		//Instantiate the villain
		Villain myvillain = new Villain("Loki");
		myvillain.run();
		myvillain.steals();
		myvillain.showAbilities();
		
		//Instantiate the vigilante
		Vigilante viggy = new Vigilante("Thor");
		viggy.run();
		viggy.steals();
		viggy.dealsJustice();
		viggy.showAbilities();

	}

}
