package NewFeatures;

public class TryCatchFeature {

	public static void main(String[] args) {
		
		
		
		try {
			double d = 100/0;
			System.out.println(d);
		} catch (Exception _) {   // (Exception e) e is replaced by Underscore _  
			System.out.println("Error");
		}
	}

}
