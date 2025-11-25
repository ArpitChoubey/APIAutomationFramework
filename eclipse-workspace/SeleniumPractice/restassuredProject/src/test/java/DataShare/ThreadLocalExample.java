package DataShare;

public class ThreadLocalExample {

	public static void main(String[] args) {
		
		
		ThreadLocal counter1 = new ThreadLocal();
		
		counter1.set("Arpit");
		
		String name =(String)counter1.get();
		
		System.out.println(name);
		
		counter1.remove();
		
		System.out.println((String)counter1.get());
		
		;
		ThreadLocal counter2 = ThreadLocal.withInitial(()-> "Ram");
		
		System.out.println((String)counter2.get());
		
		ThreadLocal<String> counter3 = new ThreadLocal<String>();
		
		counter3.set("Laxman");
		
		System.out.println(counter3.get());
		

	}

}
