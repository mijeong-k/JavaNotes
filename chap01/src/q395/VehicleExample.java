package q395;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// The method checkFare() is undefined for the type Vehicle
//		vehicle.checkFare();
		
		Bus bus1 = (Bus) vehicle;
		Bus bus2 = new Bus();
		bus2.run();
		bus2.checkFare();
		System.out.println(bus1);
		System.out.println(bus2);

	}

}
