package com.uber.ride;

public class RideInProgress implements RideState {

	RideInterface request;
	public RideInProgress(RideInterface request){
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
