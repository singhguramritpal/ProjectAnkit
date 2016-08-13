package com.uber.request;

public interface RequestState {
	
	public String requestInQueue();
	public String requestCancelled();
	public String requestAccepted();
	public String  requestCompleted();

}
