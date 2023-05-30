package p389;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.setFrontLeftTire(new KumhoTire());
		myCar.setFrontrightTire(new KumhoTire());
		System.out.println("---------------------");
		myCar.run();
	}

}
