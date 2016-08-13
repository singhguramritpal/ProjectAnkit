package com.uber.ride;

import java.util.Date;

public class Ride implements RideInterface {
	
	private int requestId;
	
	private String pickupLoc;
	private String destination;
	
	private Date pickupDate;
	private String vehicleType;
	private double fareEstimation;
	
	RideState rideState;
	
	public Ride() {
		rideState = new RideStarted(this);
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
	public void rideStart() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rideEnd() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rideInProgress() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public RideState getState() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setState(RideState s) {
		// TODO Auto-generated method stub
		
	}
	

}
