package com.uber.request;

public class RequestCancelled implements RequestState {

	RideRequestInterface request;
	public RequestCancelled(RideRequestInterface request){
		this.request=request;
		
	}
	
	@Override
	public String requestInQueue() {
		// TODO Auto-generated method stub
		return "Request was Cancelled!";
	}

	@Override
	public String requestCancelled() {
		// TODO Auto-generated method stub
		return "Request can not be Completed! It got Cancelled!";
		
	}

	@Override
	public String requestAccepted() {
		// TODO Auto-generated method stub
		return "Request was Cancelled!";
		
	}

	@Override
	public String requestCompleted() {
		// TODO Auto-generated method stub
		return "Request was Cancelled!";
		
	}

}
