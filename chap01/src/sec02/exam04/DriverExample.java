package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
//		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle bus = new Bus();
		
		driver.drive(bus);
		// Vehicle vehicle = bus;
		driver.drive(taxi);
		// Vehicle vehicle = taxi;
		
	}

}
