package uber.dispatchDriver;

import com.uber.members.Driver;

public class GetsRequest implements DriverState{

	Driver driver;
	
	public GetsRequest(Driver driver){
		this.driver=driver;
	}
	
	public void isOffline() {
		System.out.println("Driver is online");
	}
	
	public void isOnline() {
		System.out.println("Driver is Online");
	}

	public void waitingForRider() {
		System.out.println("Driver has Recieved a request for the Ride");
	}

	public void getsRequest() {
		System.out.println("Driver is Processing the Request");
		//driver.setDriverState(driver.getsRequestState());
	}

	public void hasRider() {
		System.out.println("Driver has not yet Accepted the Request for the Ride");
	}

}
