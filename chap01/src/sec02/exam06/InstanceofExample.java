package sec02.exam06;

public class InstanceofExample {

		public static void method1(Parent parent) {
			if(parent instanceof Child) {
				Child child = (Child) parent;
				System.out.println("method1 - Child로 변환 성공");
			}else {
				System.out.println("method1 - Child로 변환되지 않음");
			}
		}
		
		public static void method2(Parent parent) {
			Child child = (Child) parent;
			System.out.println("method2 - Child로 변환 성공");
		}
		
		public static void main(String[] args) {
			
			//case 1
//			Child child = new Child();
//			Parent parentA = child;	
			
			//case 2
			Parent parentA = new Child();
			
			
//			Child child = (Child) parentA;
			
			
// case 1 은 Child의 필드와 메소드를 child. 으로 불러낼 수 있음
// case 2 는 Parent의 필드와 메소드만 불러낼 수 있음.
// case 2 에서 Child의 필드와 메소드를 사용하려면 1. 강제 타입변환(29 line) 해주어야 함.
// case 2를 하는 이유는 Parent의 필드와 메소드를 그대로 불러오도록 하는 것. 
// Child에서 Parent의 메서드는 재정의하여 일부만 가져오도록 할 수도 있음.
			
			method1(parentA);
			method2(parentA);

			parentA.method4();

			
			// The method method3() is undefined for the type Parent
//			parentA.method3();
			
			Parent parentB = new Parent();
			method1(parentB);
			
			// Parent cannot be cast to class sec02.exam06.Child
//			method2(parentB);			
		}

	}

