package StrategyPattern;

public class BankTransferPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Making the Pay " +amount+ "Using Bank Transfer Payment");	
	} 

}
