package uber.members;

public class Main {
	
	public static void main(String args[]){
		
		Driver driver  = new Driver();
		
		driver.isOffline();
		driver.isOnline();
		driver.waitingForRider();
		driver.getsRequest();
		driver.hasRider();
		
		System.out.println("*****************************\nWhen Driver Comes Online\n*****************************");
		driver.setOnline(true);
		
		driver.isOffline();
		driver.isOnline();
		driver.waitingForRider();
		driver.getsRequest();
		driver.hasRider();
	}

}
