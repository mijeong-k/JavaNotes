package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		// 1.향상된 for문
		int sum1 = 0;
		for (int total : scores) {
			sum1 += total;
		}
		System.out.println("점수 총합= " + sum1);

		double avg1 = sum1 / scores.length;
		System.out.println("점수 평균= " + avg1);
		System.out.println("-------------향상된 for문");
		
		
		// 2.일반 for문
		int sum2 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}
		System.out.println("점수 총합= " + sum2);

		double avg2 = sum2 / scores.length;
		System.out.println("점수 평균= " + avg2);
		System.out.println("-------------일반 for문");
		
		
		//3-1.홀수번째 합계
		int sum3 = 0;
		for (int i = 0; i < scores.length; i+=2) {
			sum3 += scores[i];
		}
		System.out.println("점수 총합= " + sum3);

		double avg3 = sum3 / (scores.length-2);
		System.out.println("점수 평균= " + avg3);
		System.out.println("-------------홀수번째 for문");

		
		
		//4-1.3rd~5th 합계
		int sum4 = 0;
		for (int i = 2; i < scores.length; i++) {
			sum4 += scores[i];
		}
		System.out.println("점수 총합= " + sum4);

		double avg4 = sum4 / (scores.length-2);
		System.out.println("점수 평균= " + avg4);
		System.out.println("-------------3rd~5th 합계_첫번째");
		
		
		//4-2.3rd~5th 합계	
		int[] scores3 = { 84, 93, 87 };
		int sum5=0;
		for (int total : scores3) {
			sum5 += total;
		}
		System.out.println("점수 총합= " + sum5);

		double avg5 = sum5 / scores3.length;
		System.out.println("점수 평균= " + avg5);
		System.out.println("-------------3rd~5th 합계_두번째");
		
	}
	

}
