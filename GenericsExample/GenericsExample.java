import java.util.ArrayList;

public class GenericsExample {
	public static void main(String[] args) {
		
		Printer<Cat> printer = new Printer<>(new Cat());
		printer.print();
		
		Printer<Dog> doublePrinter = new Printer<>(new Dog());
		doublePrinter.print();
		
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat());
		
		Cat myCat = (Cat)cats.get(0);
	}
}
