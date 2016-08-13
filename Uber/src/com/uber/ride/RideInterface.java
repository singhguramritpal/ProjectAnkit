package com.uber.ride;

public interface RideInterface {
	
	public void rideStart();
	public void rideEnd();
	public void rideInProgress();
	
	public RideState getState();
	public void setState(RideState s);

	

}
