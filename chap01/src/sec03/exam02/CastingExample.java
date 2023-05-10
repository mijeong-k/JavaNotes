package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 50000000000L;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
//		int num = 65;
//		char cha =(int) num;
//		System.out.println(cha);
		
		char cha2 = 65;
		char cha3 = (int) 65;
		System.out.println(cha2);
		System.out.println(cha3);
		
		byte b = 5;
		int s = -b;
		System.out.println(s);
		
		
	}

}
