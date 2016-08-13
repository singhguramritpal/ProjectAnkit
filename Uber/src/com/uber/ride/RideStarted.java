package com.uber.ride;

public class RideStarted implements RideState {

	
	RideInterface ride;
	
	public RideStarted(RideInterface ride){
		this.ride=ride;
		
	}

	@Override
	public String rideStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String rideEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String rideInProgress() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
