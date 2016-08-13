package com.uber.ride;

public class RideCompleted implements RideState{

	RideInterface request;
	
	public RideCompleted(RideInterface request){
		this.request=request;
		
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
