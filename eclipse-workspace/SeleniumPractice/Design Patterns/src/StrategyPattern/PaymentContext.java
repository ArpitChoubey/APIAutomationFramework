package StrategyPattern;

public class PaymentContext {
	
	private PaymentStrategy paymentstrategy;
	
	
	public PaymentContext(PaymentStrategy paymentstrategy) {
        this.paymentstrategy = paymentstrategy;
    }
	
	public void setPaymentStrategy(PaymentStrategy paymentstrategy) {
	    this.paymentstrategy = paymentstrategy;
	}
         public void pay(double amount) {
        	 paymentstrategy.pay(amount);
         }
}
