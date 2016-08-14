package com.uber.members;

import java.io.IOException;
import com.uber.request.*;


public class UberStart {

	private Rider rider;
	private Request request;
	
	private Driver driver;
	private RiderSignin riderSignin;

	public UberStart() {
		while (true)
			displayOptions();
	}

	private void displayOptions() {
		System.out.println();
		System.out.println("***************************");
		System.out.println("1. Rider Options");
		System.out.println("2. Driver Options");

		System.out.println("0. Exit");
		System.out.println("Please Enter you Option: ");
		try {
			String read = ShareUber.getReader().readLine();
			if (read.isEmpty() || read.length() >= 2) {
				System.out.println("Please Enter correct Input!");
				displayOptions();
			} else {
				int option = Integer.parseInt(read);
				switch (option) {
				case 0:
					System.out
							.println("You are logging out. Have a nice day!! :)");
					System.exit(0);
					break;
				case 1:
					displayRiderOptions();
					break;
				case 2:
					displayDriverOptions();
					break;
				
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	private void displayDriverOptions() {
		try {
			while (true) {

			
				System.out.println();
				System.out.println("Driver Menu____________________________________");
				System.out.println("1. Registration");
				System.out.println("2. Login");
				System.out.println("0. Go to Main Options");
				System.out.println("Please Enter you Option: ");
				String line = ShareUber.getReader().readLine();
				if (line.isEmpty() || line.length() >= 2) {
					System.out.println("Wrong Input. Please enter again.");
					displayOptions();
				} else {
					int option = Integer.parseInt(line);
					switch (option) {
					case 0:
						break;
					case 1:
						new SignUpDriver();
						break;
					case 2:
						new DriverSignin();
						break;
					
					}
					if (option == 0) {
						break;
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void displayRiderOptions() {

		try {
			while (true) {
				System.out.println();
				System.out.println("Rider Options____________________________________");
				System.out.println("1. Registration");
				System.out.println("2. Login");
				System.out.println("3. Request A Cab");
				
				System.out.println("0. Go to Main Menu");
				System.out.println("Please Enter you Option: ");
				String line = ShareUber.getReader().readLine();
				if (line.isEmpty() || line.length() >= 2) {
					System.out.println("Wrong Input. Please enter again.");
					displayOptions();
				} else {
					
					int option = Integer.parseInt(line);
					switch (option) {
					case 0:
						break;
					case 1:
						new SignUpRider();
						break;
					case 2:
					riderSignin =new RiderSignin();
					rider=riderSignin.signIn();
						break;
					case 3:
						if (RiderSignin.currentRider() != null) {
							request = riderSignin.requestACab();
							
							if (request != null) {
								request.requestInQueue();
								request.requestAccepted();
								request.requestCompleted();

							}
						} else {
							System.out.println("Please login first");

							
						}
						// Dispatcher dispatch = new Dispatcher();
						// dispatch.dispatchRequest(request);

						break;
					}
						if (option == 0) {
							break;
						}
					}

				}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
