package com.uber.request;

public class RequestInQueue implements RequestState {
	
	RideRequestInterface request;
	
	public RequestInQueue(RideRequestInterface request){
		this.request=request;
		
	}

	@Override
	public String requestInQueue() {
		// TODO Auto-generated method stub
		
		request.setState(new RequestAccepted(request));
		return "Request Is In Queue";
		
	}

	@Override
	public String requestCancelled() {
		// TODO Auto-generated method stub
		return "Need to submit a Request First";
		
	}

	@Override
	public String requestAccepted() {
		// TODO Auto-generated method stub
		return "Need to submit a Request First";
		
	}

	
	@Override
	public String requestCompleted() {
		// TODO Auto-generated method stub
		return "Need to submit a Request First";
		
	}

}
