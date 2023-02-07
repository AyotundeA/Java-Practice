import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
	public static void main(String[] args) {
		
		String[] friendsArray = {"Henry", "Rick", "John", "Luke"};
		
		ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Henry", "Rick", "John", "Luke"));
		
		// Get the element.
		System.out.println(friendsArray[1]);
		System.out.println(friendsArrayList.get(1));
		
		// Set an element.
		System.out.println(friendsArray.length);
		System.out.println(friendsArrayList.size());
		
		// Add an element.
		friendsArrayList.add("Carl");
		System.out.print(friendsArrayList.get(4));
		
		// Set an Element.
		friendsArray[0] = "James";
		System.out.println(friendsArray[0]);
		friendsArrayList.set(0, "James");
		System.out.println(friendsArrayList.get(0));
		
		// Remove an element.
		friendsArrayList.remove("Rick");
		System.out.println(friendsArrayList.get(1));
		
		// Printing the ArrayList.
		System.out.println(friendsArray);
		System.out.println(friendsArrayList);
	}
}
