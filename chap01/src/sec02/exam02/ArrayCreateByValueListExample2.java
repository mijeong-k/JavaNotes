package sec02.exam02;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
//		int[] scores = null;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);

		
		int sum2 = ArrayCreateByValueListExample2_Method.add(new int[] { 90, 90, 90 });
		System.out.println("총합: " + sum2);
		System.out.println();
		

		for (int i = 0; i < 2; i++) {
			ArrayCreateByValueListExample2_Method.print1();
			ArrayCreateByValueListExample2_Method.print2();
		}
	}
}
	
	

