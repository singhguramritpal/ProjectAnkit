package uber.dispatchDriver;

public interface DriverState {
	
	public void isOffline();
	public void isOnline();
	public void waitingForRider();
	public void getsRequest();
	public void hasRider();

}
