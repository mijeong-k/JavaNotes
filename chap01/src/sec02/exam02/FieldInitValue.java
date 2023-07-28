package sec02.exam02;

public class FieldInitValue {
	//필드
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;
	String referenceField; 
	
	//매서드 정의부
	public void print() {
		System.out.println("---------------------");
	}
	
	//생성자
	public FieldInitValue() {
		System.out.println("constructor...");
	}
}
