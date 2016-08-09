package uber.request;

public class ModifyRide implements RideState{

	Ride ride;
	public ModifyRide(Ride ride){
		this.ride = ride;
	}
	
	@Override
	public void startRide() {
		
		
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
