package Java8Features;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		
		
		  getText(() -> "Java");
	        getText(() -> "Ruby");
	        getText(() -> "Microservice");
	        getText(() -> "Python");

	}
	
	public static void getText(Supplier<String>text) {
		System.out.println(text.get());
	}

}
