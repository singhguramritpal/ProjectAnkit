package com.uber.request;

public class RequestAccepted implements RequestState {

	
	RideRequestInterface request;
	
	public RequestAccepted(RideRequestInterface request){
		this.request=request;
		
	}
	
	@Override
	public String requestInQueue() {
		// TODO Auto-generated method stub
		return "Request is already accepted";
	}

	@Override
	public String requestCancelled() {
		// TODO Auto-generated method stub
		return "Request is already accepted";
	}

	@Override
	public String requestAccepted() {
		
		// TODO Auto-generated method stub
		request.setState(new RequestCompleted(request));
		return "Request Accepted! Welcome To Ride";
		
	}

	@Override
	public String requestCompleted() {
		// TODO Auto-generated method stub
		return "Request is not completed yet!";
	}

	
}
