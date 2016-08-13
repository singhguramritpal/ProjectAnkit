package uber.dispatchDriver;

import com.uber.members.Driver;

import uber.dispatchDriver.DriverState;

public class HasRider implements DriverState{
	
	Driver driver;
	
	public HasRider(Driver driver){
		this.driver = driver;
	}
	
	public void isOffline(){
		System.out.println("Driver is online");
	}

	public void isOnline() {
		System.out.println("Driver has the Rider and is Ready for the Ride");
	}

	public void waitingForRider() {
		System.out.println("Driver has the Rider and is Ready for the Ride");
	}

	public void getsRequest() {
		System.out.println("Driver has the Rider and is Ready for the Ride");
	}

	public void hasRider() {
		System.out.println("Driver has the Rider and is Ready for the Ride");
		driver.setDriverState(driver.getHasRider());
	}

}
