package com.uber.payment;

public class DebitCardPaymentStrategy implements PaymentStrategy {
	 public void pay(String amount)
	  {
	    System.out.println("Customer will pay " +amount+ "dollars with Debit Card");
	  }
}
