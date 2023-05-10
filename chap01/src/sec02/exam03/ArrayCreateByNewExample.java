package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {		
		
		//1.int문
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}
		System.out.println("-----------------");	
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=10*(i+1);
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}
		System.out.println("=================");
		
		
		//2.double
		double[] arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}
		System.out.println("-----------------");
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=0.1*(i+1);
			System.out.printf("arr2[%d]:%.1f\n", i, arr2[i]);
		}
		System.out.println("=================");
		
		
		//3.string
		String[] arr3 = new String[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}
		System.out.println("-----------------");

		for (int i = 0; i < arr3.length; i++) {
			arr3[i]+=(i+1)+"월";
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}

	}

}
