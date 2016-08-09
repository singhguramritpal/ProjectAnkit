package uber.members;

import uber.dispatchDriver.DriverState;
import uber.dispatchDriver.GetsRequest;
import uber.dispatchDriver.HasRider;
import uber.dispatchDriver.IsOffline;
import uber.dispatchDriver.IsOnline;
import uber.dispatchDriver.WaitingForRider;

public class Driver {
	
	DriverState isOffline;
	DriverState isOnline;
	DriverState waitingForRider;
	DriverState getsRequest;
	DriverState hasRider;
	
	DriverState driverState;
	
	private boolean online = false;
	
	
	public Driver(){
		isOffline = new IsOffline(this);
		isOnline = new IsOnline(this);
		waitingForRider = new WaitingForRider(this);
		getsRequest = new GetsRequest(this);
		hasRider = new HasRider(this);
		driverState = isOffline;
	}
	
	public void setOnline(boolean online){
		this.online = online;
	}
	public boolean getOnline(){
		return this.online;
	}
	
	public void setDriverState(DriverState newDriverState){
		this.driverState = newDriverState;
	}
	
	public void isOffline(){
		driverState.isOffline();
	}
	public void isOnline(){
		driverState.isOnline();
	}
	public void getsRequest(){
		driverState.getsRequest();
	}
	public void hasRider(){
		driverState.hasRider();
	}
	public void waitingForRider(){
		driverState.waitingForRider();
	}
	
	public DriverState getIsOffline(){
		return isOffline;
	}
	public DriverState getIsOnline(){
		return isOnline;
	}
	public DriverState getWaitingForRider(){
		return waitingForRider;
	}
	public DriverState getsRequestState(){
		return getsRequest;
	}
	public DriverState getHasRider(){
		return hasRider;
	}
	
	
	
}
