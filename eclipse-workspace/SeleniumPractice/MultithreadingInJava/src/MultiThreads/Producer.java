package MultiThreads;

public class Producer extends Thread{
	
	private final Company company;

    public Producer(Company c) {
        this.company = c;
    }

    @Override
    public void run() {
        int i = 1;
        try {
            while (true) {
                company.produceItem(i);
                Thread.sleep(1000); 
                i++;
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted");
            Thread.currentThread().interrupt();
        }
    }
}
