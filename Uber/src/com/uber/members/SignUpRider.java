package com.uber.members;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

import com.uber.request.Request;

public class SignUpRider {

	Rider rider;
	Scanner sc;
	public SignUpRider(){
		rider = new Rider();
		sc = new Scanner(System.in);
		setName();
		setAddress();
		setPhone();
		setDob();
		setEmail();
		setPassword();
		setCardNumber();
		setExpDate();
		setCvv();
		storeData();
	}

	public void setName(){
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		rider.setName(name);
	}

	public void setAddress(){
		System.out.println("Enter your address: ");
		String address = sc.nextLine();
		rider.setAddress(address);
	}

	public void setPhone(){
		System.out.println("Enter your Phone number: ");
		String phone = sc.nextLine();
		rider.setPhone(phone);
	}

	public void setDob(){
		System.out.println("Enter your DOB (mm/dd/yyyy): ");
		String dob = sc.nextLine();
		rider.setDob(dob);
	}

	public void setEmail(){
		System.out.println("Enter your Email ID: ");
		String email = sc.nextLine();
		rider.setEmail(email);
	}

	public void setPassword(){
		System.out.println("Enter your password: ");
		String pass=sc.nextLine();
		rider.setPass(pass);
	}

	public void setCardNumber(){
		System.out.println("Enter your Credit/Debit Card Number: ");
		String num=sc.nextLine();
		rider.setCardNumber(num);
	}

	public void setCvv(){
		System.out.println("Enetr the CVV of your card (CVV is the 3 digit number written at the back of your card): ");
		int cvv = sc.nextInt();
		rider.setCvv(cvv);
	}

	public void setExpDate(){
		System.out.println("Enter the Expiry date of your card: ");
		String exp = sc.nextLine();
		rider.setExpDate(exp);
	}

	public void storeData(){
		new StoreRiderData(rider);
	}

}

