	package com.uber.request;

public interface RideRequestInterface {
	
	public void requestInQueue();
	public void requestCancelled();
	public void requestAccepted();
	public void requestCompleted();
	public RequestState getState();
	public void setState(RequestState s);
	
	//Add car seat addition request
	public boolean hasCarSeatFlag();
	public boolean setCarSeatFlag(boolean carSeatFlag);

}
