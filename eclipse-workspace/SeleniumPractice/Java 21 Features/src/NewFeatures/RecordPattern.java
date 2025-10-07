package NewFeatures;

public class RecordPattern {
	
	record User (int userid,String name) {
	}
	
	class Test{
		public void testing(Object ob) {
			if(ob instanceof User(int userid,String name)) {
				System.out.println("User id " +userid);
				System.out.println("username " +name);
			}
		}
	}

	public static void main(String[] args) {
	
	    Test t = new Test();
	
	t.testing(new User(1234, "Arpit"));
	
	
		
		
		

	}

}
