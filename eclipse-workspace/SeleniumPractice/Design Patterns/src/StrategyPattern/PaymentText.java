package StrategyPattern;

public class PaymentText {

	public static void main(String[] args) {
		
		
		PaymentContext context = new PaymentContext(new CreditCardPayment());
		
		context.pay(120.89);
		
		context.setPaymentStrategy(new PayPalPayment());
		
		
		context.pay(520.89);
	}

}
