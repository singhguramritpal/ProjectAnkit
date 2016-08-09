package uber.dispatchDriver;

import uber.members.Driver;

public class WaitingForRider implements DriverState {
	
	Driver driver;
	
	public WaitingForRider(Driver driver){
		this.driver = driver;
	}
	
	public void isOffline(){
		System.out.println("Driver is online");
	}
	
	public void isOnline() {
		System.out.println("Driver is Online");
	}
	
	public void waitingForRider() {
		System.out.println("Driver is waiting for the Rider");
		driver.setDriverState(driver.getWaitingForRider());
	}

	public void getsRequest() {
		System.out.println("Driver Doesnot have any Request");
	}
	
	public void hasRider() {
		System.out.println("Driver is waiting for the Rider");
	}

}
