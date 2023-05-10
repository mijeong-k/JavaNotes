package sec02.exam02;


public class ArrayCreateByValueListExample2_Method {
	
	public static int multiple(int scores3) {
		int sum = 1;
		for (int i = 0; i < 3; i++) {
			sum = sum*scores3;
		}
		return sum; 
	}
	
	public static int add(int[] scores2) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores2[i];
		}
		return sum; 
	}

	
	public static void print1() {
		System.out.println("출력하라");
		System.out.println(add(new int[] {80,80,80}));
		System.out.println(ArrayCreateByValueListExample2_Method.multiple(10));
	}

	public static void print2() {
		System.out.println("---------------------");
	}
}
//매서드 클래스



//scores2에 값을 14라인에서 넣어준것.
//int[] scores2 = new int[]; 인데, 배열에 값을 넣어준것.
