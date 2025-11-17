package MultiThreads;

public class Consumer extends Thread {
	
	private final Company company;

    public Consumer(Company c) {
        this.company = c;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = company.consumeItem();
                
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted");
            Thread.currentThread().interrupt();
        }
    }
}
