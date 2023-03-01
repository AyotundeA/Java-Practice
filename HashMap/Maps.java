import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		
		HashMap<String, Integer> empIds = new HashMap<>();
		empIds.put("Maria", 15345);
		empIds.put("Jake", 12132);
		empIds.put("Jack", 84321);
		
		System.out.println(empIds);
		
		System.out.println(empIds.get("Jake"));
		
		System.out.println(empIds.containsKey("Jonathan"));
		
		System.out.println(empIds.containsValue(3282389));
		
		empIds.put("Maria", 3212);
		System.out.println(empIds);
		
		empIds.replace("Martin", 212);
		System.out.println(empIds);
	}
}
