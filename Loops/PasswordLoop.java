import java.util.Scanner;

public class PasswordLoop {
	public static void main(String[] args) {
		
		
		//Password Example
		String password = "CheeseBurgers";
		System.out.println("Enter the Password: ");
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		while(!guess.equals(password)) {
			//code
			System.out.println("Wrong try again.");
			guess = scanner.nextLine();
			
		}
		
		System.out.println("Well done.");
		scanner.close();
	}
}
