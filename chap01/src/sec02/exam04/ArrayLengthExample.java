package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);

		
		String[] str = new String[3];
		str[0] = null;
//		str[1] = "B";
		str[2] = null;

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
	}

}
