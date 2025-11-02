package StrategyPattern;

public class BankTransferPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Making the payment "+ amount +" using bank tranfer");
	}

}
