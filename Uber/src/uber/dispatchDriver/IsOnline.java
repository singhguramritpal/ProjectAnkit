package uber.dispatchDriver;

import com.uber.members.Driver;

public class IsOnline implements DriverState{

	
	Driver driver;
	
	public IsOnline(Driver driver) {
		
		this.driver = driver;
		
	}
	
	public void isOffline() {
		System.out.println("Driver is online");
	}
	
	public void isOnline() {
		if(driver.getOnline()){
			System.out.println("Driver is Online and is Waiting for the Rider");
			driver.setDriverState(driver.getIsOnline());
		}
		else{
			System.out.println("Driver is not online");
		}
	}
	
	public void getsRequest() {
		System.out.println("Driver is Online and have not received the request for the Ride");
	}
	
	public void waitingForRider() {
		System.out.println("Driver is online");
	}

	public void hasRider() {
		System.out.println("Driver doesnot have a Rider");
	}
	
}
