package Java8Features;

public class Threaddemo {

	public static void main(String[] args) {
	
		
		Runnable thread1 = ()-> {
			
			for(int i = 1; i <= 10; i++) {
				System.out.println(" Value of i is "+i);
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(thread1);
		
		  t.setName("JOHN");
		  
		  t.start();
		

	}

}
