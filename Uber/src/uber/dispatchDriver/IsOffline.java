package uber.dispatchDriver;

import com.uber.members.Driver;

public class IsOffline implements DriverState{
	
	Driver driver;
	
	public IsOffline(Driver driver){
		this.driver = driver;
	}

	public void isOffline() {
		
		if(driver.getOnline()){
			System.out.println("Driver is online");
			driver.setDriverState(driver.getIsOnline());
		}
		else{
			System.out.println("Driver is Offline");
			driver.setDriverState(driver.getIsOffline());
		}
	}

	public void isOnline() {
		System.out.println("Driver is Offline");
	}
	
	public void getsRequest() {
		System.out.println("Driver is Offline");
	}
	
	public void waitingForRider() {
		System.out.println("Driver is offline");
	}

	public void hasRider() {
		System.out.println("Driver is offline");
	}

}
