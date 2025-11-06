package StrategyPattern;

public class PayPalPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Making the Pay " +amount+ "Using PayPal Payment");	
	}

}
