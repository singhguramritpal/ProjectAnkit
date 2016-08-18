package com.uber.payment;

public class CreditCardPaymentStrategy implements PaymentStrategy {
	 public void pay( String amount )
	  {
	    System.out.println("Customer will pay " + amount + "dollars with Credit Card");
	  }
}
