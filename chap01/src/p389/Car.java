package p389;

public class Car {
	private Tire frontLeftTire = new HankookTire();
	private Tire frontrightTire = new HankookTire();
	Tire backtLeftTire = new KumhoTire();
	Tire backtrightTire = new KumhoTire();
	
	
	public void setFrontLeftTire(Tire frontLeftTire) {
		this.frontLeftTire = frontLeftTire;
	}


	public void setFrontrightTire(Tire frontrightTire) {
		this.frontrightTire = frontrightTire;
	}


	void run() {
		frontLeftTire.roll();
		frontrightTire.roll();
		backtLeftTire.roll();
		backtrightTire.roll();
	}
}
