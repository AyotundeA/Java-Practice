import java.util.*;
import java.io.*;

public class WordsCounter {

public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(System.in);
    String name;
    int lineCount = 0;
    int wordCount = 0;


    System.out.println("Please type the file you want to read in: ");
    name = scan.nextLine(); // This code allows the user to write their own input.



    // This code allows me to use the Scan function to read the Lines and count the words within the file.
    File input = new File("Enter your file location here." + name + ".txt");
    Scanner in = new Scanner(input);


    while (in.hasNextLine()){ // enter while loop if there is a complete line available

        
        lineCount++;// This increments the line counter variable


        // read in next line using Scanner object, inFile
       String nextline = in.nextLine();

        // create another Scanner object in order to scan the line word by word
        Scanner word = new Scanner(nextline); 


        // use while loop to scan individual words, increase word counter
        while(word.hasNext()){
            wordCount++; // This increments the word counter variable
            
            word.next(); // Scanner move to next word
        }
        word.close();
        // count number of chars including space but not line break by using the length() method of the String class and increment character counter

    }

    in.close();
    System.out.print("Lines " + lineCount + " "+ "Words " +  wordCount);

	}
}
