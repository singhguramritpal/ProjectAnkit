package uber.request;

public class StartRide implements RideState{
	
	Ride ride;

	public StartRide(Ride ride){
		this.ride = ride;
	}
	
	@Override
	public void startRide() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("Ride Started");
		ride.setState(new ModifyRide(ride));
	}

	@Override
	public String modifyRide(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delayRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endRide() {
		// TODO Auto-generated method stub
		
	}
	
	

}
