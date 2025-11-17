package MultiThreads;

public class MyAnotherThread extends Thread {
	
	@Override
	public void run() {
        for(int i = 10; i >=1; i++) {
            System.out.println("Another Thread = " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // Handle exception
            }
        }
    }

	public static void main(String[] args) {
		
		 MyThread t1 = new MyThread();
         
         Thread thr = new Thread(t1);
         
         thr.start();
         
        MyAnotherThread t2 = new MyAnotherThread();
        
        t2.start();
         
         
         
         
	}

}
