import java.util.*;

public class StringCounter {
	// A tutorial by Simple Snip Code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			//String Variable
			String str;
			System.out.print("Enter the String : ");
			// Read the input of the next line.
			str = sc.nextLine();
			
			char ch[] = str.toCharArray();
			int letters = 0, spaces = 0, numbers = 0, others = 0;

			for (int i = 0; i < str.length(); i++) {
				if (Character.isLetter(ch[i])) {
					letters++;
				} else if (Character.isSpaceChar(ch[i])) {
					spaces++;
				} else if (Character.isDigit(ch[i])) {
					numbers++;
				} else {
					others++;
				}
			}
			System.out.println("String: " + str);
			System.out.println("Letters Count: " + letters);
			System.out.println("Spaces Count: " + spaces);
			System.out.println("Numbers Count: " + numbers);
			System.out.println("Others Count: " + others);
		}
	}
}
