package StrategyPattern;

public class PaymentTest {

	public static void main(String[] args) {
		
		PaymentContext context = new PaymentContext(new CreditCardPayment());
		context.pay(120.34);
		
		context.setPaymentStrategy(new PayPalPayment());
		context.pay(180.45);
		
		context.setPaymentStrategy(new BankTransferPayment());
		context.pay(190.45);
	}

}
