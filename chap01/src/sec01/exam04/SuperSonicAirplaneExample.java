package sec01.exam04;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		System.out.println();
		
		SuperSuperSonicAirplane sa2 = new SuperSuperSonicAirplane();
		sa2.takeOff();
		sa2.fly();
		sa2.flyMode = SuperSuperSonicAirplane.SUPERSONIC;
		sa2.fly();
		sa2.flyMode = SuperSuperSonicAirplane.NORMAL;
		sa2.fly();
		sa2.flyMode = SuperSuperSonicAirplane.SUPERSUPERSONIC;
		sa2.fly();
		sa2.land();

	}

}
