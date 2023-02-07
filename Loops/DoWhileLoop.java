import java.util.Scanner;

public class DoWhileLoop {
	{
	//Password Example
	String password = "CheeseBurgers";

	Scanner scanner = new Scanner(System.in);
	String guess;
	do {
		System.out.println("Enter the Password: ");
		guess = scanner.nextLine();
	} while(!guess.equals(password));
	
	
	System.out.println("Well done.");
	scanner.close();
	}
}
