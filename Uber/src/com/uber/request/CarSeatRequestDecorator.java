package com.uber.request;

public class CarSeatRequestDecorator extends RequestDecorator{
	public CarSeatRequestDecorator(RideRequestInterface request) {
		super(request);
	}
	
	
	public void addCarSeat(){
		request.setCarSeatFlag(true);
		
	}


	@Override
	public void requestInQueue() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void requestCancelled() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void requestAccepted() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void requestCompleted() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public RequestState getState() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setState(RequestState s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean hasCarSeatFlag() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean setCarSeatFlag(boolean carSeatFlag) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
