package uber.request;

import java.util.Date;

public class Request {
	
	private int requestId;
	
	private String pickupLoc;
	private String destination;
	
	private Date pickupDate;
	private String vehicleType;
	private double fareEstimation;
	
	
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
	

}
