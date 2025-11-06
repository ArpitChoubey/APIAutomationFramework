package SingletonPattern;

public class Samosa {
	
	private static Samosa samosa;
	
	private Samosa() {
		 Object instance;
		if (instance != null) {
	            throw new RuntimeException("Use getSamosa() to create instance");
	        }
		
	}
	
	public static Samosa getSamosa() {
		
		if(samosa ==null) {
			samosa = new Samosa();
		}
		 return samosa;
		
	}

       
       
    }
    

