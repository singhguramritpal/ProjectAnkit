package uber.request;

public class Vehicle {
	
	private String type;
	private int noOfSeats;
	private double fare;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(int fare) {
		
		if(getType() == "luxary"){
			Luxury lux = new Luxury();
			this.fare = lux.getFare(fare);
		}
		else if(getType() == "basic"){
			Basic basic = new Basic();
			this.fare = basic.getFare(fare);
		}
	}
	
	

}
