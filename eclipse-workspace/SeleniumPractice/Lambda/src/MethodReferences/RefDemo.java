package MethodReferences;

public class RefDemo {

	public static void main(String[] args) {

           System.out.println("Learning Method References ..");
           
           WorkInter workInter = Stuff::dosuff;
           
           workInter.doTask();
           
           Runnable runnable = Stuff :: threadTask;
           
           Thread d = new Thread(runnable);
           
           d.start();
           
           Stuff ob = new Stuff();
           
           Runnable runnable1 = ob::printNumber;
           
           Thread d1 = new Thread(runnable1);
           
           d1.start();

	}
 
}
