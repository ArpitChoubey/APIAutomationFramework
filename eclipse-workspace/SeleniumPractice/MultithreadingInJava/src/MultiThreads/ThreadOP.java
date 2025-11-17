package MultiThreads;

public class ThreadOP {

	public static void main(String[] args) {
		
		System.out.println("Program Started ...");
		
		int x = 56+34;
		
		System.out.println("Sum of x is "+x);
		
		Thread t = Thread.currentThread();
		
		String tname = t.getName();
		
		System.out.println("Current running thread is "+tname);
		
		t.setName("MyName");
		
		System.out.println(t.getName());
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		
		System.out.println(t.getId());
		
		System.out.println("Program Ended...");

	}

}
