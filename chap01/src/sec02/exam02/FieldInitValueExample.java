package sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv=new FieldInitValue();
		
		System.out.println("byteField: "+fiv.byteField);
		System.out.println("shortField: "+fiv.shortField);
		System.out.println("intField: "+fiv.intField);
		System.out.println("longField: "+fiv.longField);
		System.out.println("booleanField: "+fiv.booleanField);
		System.out.println("charField: "+fiv.charField);
		System.out.println("floatField: "+fiv.floatField);
		System.out.println("doubleField: "+fiv.doubleField);
		System.out.println("arrField: "+fiv.arrField);
		System.out.println("referenceField: "+fiv.referenceField);
		
//매서드 호출부---매서드는 호출을 해야함. vs생성자(new를 하게되면(==인스턴스를 생성하는순간) 자동으로 호출)
		fiv.print();
	}

}
