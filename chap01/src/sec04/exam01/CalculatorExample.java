package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : "+result1);		
//		System.out.println("result : "+myCalc.plus(5, 6));
		
		byte x=10;
		byte y=4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		
		myCalc.powerOff();

	}

}
