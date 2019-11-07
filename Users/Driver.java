package Users;
import Location.*;

public class Driver extends User{
	int rating;
	boolean isOnRide;
	Wallet wallet;
	public DriverLocation driverLocation;
	Cab cab;

	private Driver(String uniqueId, String name, String phoneNumber, String emailId, String password, int x, int y){
		super(uniqueId, name, phoneNumber, emailId, password);
		rating = 0;
		isOnRide = false;
		wallet = new Wallet();
		driverLocation = new DriverLocation(x, y);
		cab = Cab.createCab();
	}
	
	public static Driver createDriver(String uniqueId, String name, String phoneNumber, String emailId, String password, int x, int y){
		return new Driver(uniqueId, name, phoneNumber, emailId, password, x , y);
	}

	public double getCustomerDistance(Customer customer){
		return driverLocation.getDistance(customer);
	}

	public double getDestinationDistance(PlacesLocation placesLocation){
		return driverLocation.getDistance(placesLocation);
	}

	public String toString(){
		return ("Hello, I'm " + this.getUsername() + " and I'm a driver with ID " + this.getUniqueId() + " and Wallet Balance " + wallet.getWalletBalance() + " at Location " + this.driverLocation.getX() + "," +  this.driverLocation.getY() + " in the cab with number " + this.cab.cabNumber + " which is of type " + this.cab.cabType + " at price " + this.cab.cabCharge);
	}
}