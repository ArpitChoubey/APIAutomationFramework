package MultiThreads;

public class Company {
	private int n;
    private boolean available = false;
	
    public synchronized void produceItem(int value) throws InterruptedException {
        while (available) {            
            wait();
        }
        this.n = value;
        available = true;
        System.out.println("Produced: " + this.n);
        notify();                    
    }
    public synchronized int consumeItem() throws InterruptedException {
        while (!available) {           
            wait();
        }
        int val = this.n;
        available = false;
        System.out.println("Consumed: " + val);
        notify();                     
        return val;
    }
}
