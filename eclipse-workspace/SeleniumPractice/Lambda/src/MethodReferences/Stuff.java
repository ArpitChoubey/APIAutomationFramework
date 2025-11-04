package MethodReferences;

import java.time.LocalDate;

public class Stuff {
	
	public static void dosuff() {
		System.out.println("I am doing task");
		System.out.println("I am Second task");
		
		LocalDate now = LocalDate.now();
		System.out.println(now.toString());
			
	}
	 
	public static void threadTask()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(i*2);
			try {
				int mills;
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}



    public void printNumber() {
    for (int i = 1; i <= 5; i++) {
        System.out.println(Thread.currentThread().getName() + " prints: " + i);
        try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
}
