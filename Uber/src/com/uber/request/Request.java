package com.uber.request;

import java.util.Date;

public class Request implements RideRequestInterface {
	
	private int requestId;
	
	private String pickupLoc;
	private String destination;
	
	private Date pickupDate;
	private String vehicleType;
	private double fareEstimation;
	
	RequestState requestState;
	
	public Request() {
		requestState = new RequestInQueue(this);
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getPickupLoc() {
		return pickupLoc;
	}
	public void setPickupLoc(String pickupLoc) {
		this.pickupLoc = pickupLoc;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getFareEstimation() {
		return fareEstimation;
	}
	public void setFareEstimation(double fareEstimation) {
		this.fareEstimation = fareEstimation;
	}
	@Override
	public void requestInQueue() {
		// TODO Auto-generated method stub
		System.out.println(requestState.requestInQueue());
		
	}

	@Override
	public void requestCancelled() {
		// TODO Auto-generated method stub
		System.out.println(requestState.requestCancelled());
		
	}

	@Override
	public void requestAccepted() {
		// TODO Auto-generated method stub
		System.out.println(requestState.requestAccepted());
		
	}

	
	@Override
	public void requestCompleted() {
		// TODO Auto-generated method stub
		System.out.println(requestState.requestCompleted());
		
	}
	@Override
	public RequestState getState() {
		// TODO Auto-generated method stub
		return requestState;
	}
	@Override
	public void setState(RequestState requestState) {
		// TODO Auto-generated method stub
		this.requestState=requestState;
		
	}

}
