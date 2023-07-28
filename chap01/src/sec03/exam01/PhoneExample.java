package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
		//Cannot instantiate(인스턴스화) the type Phone
//		Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
