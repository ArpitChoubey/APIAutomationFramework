package SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Examples {

	public static void main(String[] args) throws Exception {
		
		
		Samosa samosa1 = Samosa.getSamosa();
		
		System.out.println(samosa1.hashCode());
		
		Samosa samosa2 = Samosa.getSamosa();
		
		System.out.println(samosa2.hashCode());
		
		System.out.println(Jalebi.getjalebi().hashCode());
		
		
           
		Samosa samosa3 = Samosa.getSamosa();
        System.out.println("samosa1: " + samosa3.hashCode());

        Samosa samosa4 = Samosa.getSamosa();
        System.out.println("samosa2: " + samosa4.hashCode());

        // Create a new instance using reflection (breaks singleton)
        Constructor<Samosa> ctor = Samosa.class.getDeclaredConstructor(); // singular
        ctor.setAccessible(true);
        Samosa samosa5 = ctor.newInstance();
        System.out.println("samosa3 (reflection): " + samosa5.hashCode());
        
        
        
    }
		
		
		
		
		
		
		

	

}

