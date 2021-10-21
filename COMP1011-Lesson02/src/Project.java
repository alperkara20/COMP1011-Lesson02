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
		

	}

}
