package Java25LatestFeatures;

public class InstanceMainMethod {
	
	public static void main(String args []) {
		
		System.out.println("Original Main method ");// Priority to Standard Main: The JVM first looks for a traditional public static void main(String[] args) method, which is the most common entry point.
	}
	
	void main() {
		
		System.out.println("Wow !! Is it Java?");
	}

}
