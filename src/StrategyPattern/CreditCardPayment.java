package StrategyPattern;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Making the payment "+ amount +" using credit card");
	}

}
