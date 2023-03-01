import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetandHashSet {
	public static void main(String[] args) {
		
		// The HashSet implements the Set interface.
		Set<String> names = new HashSet<>();
		
		// Adding the string to the HashSet.
		names.add("John");
		names.add("Jess");
		names.add("Mitch");
		names.add("Mike");
		names.add("Norman");
	
		//Iterator is an object that can be used to loop through collections.
		Iterator<String> namesIterator = names.iterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
		
		// Created an ArrayList
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(2);
		numberList.add(1);
		System.out.println(numberList);
		
		// The Set has the same numbers but no duplicates.
		Set<Integer> numberSet = new HashSet<>();
		numberSet.addAll(numberList);
		System.out.println(numberSet);
	}
}
