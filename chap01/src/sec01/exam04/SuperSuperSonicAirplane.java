package sec01.exam04;

public class SuperSuperSonicAirplane extends SuperSonicAirplane {
	public static final int SUPERSUPERSONIC = 3;

	public void fly() {
		if (flyMode == SUPERSUPERSONIC) {
			System.out.println("초초음속비행합니다.");
		} else {
			super.fly();
		}
	}
}