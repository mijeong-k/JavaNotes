package p170;

public class NullpointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
//		intArray = new int[1];
		intArray[0]=10;
		System.out.println(intArray[0]);
		
		
		String str1 = null;
		str1 = new String("Abc");
		String str2 = "Bcd";
		System.out.println("총 문자수: "+str1.length());
		System.out.println("총 문자수: "+str2.length());
	}

}

//	intArray 가 배열인데 heap에 배열자리도 안만들고 배열[0]을 저장하려고 해서 오류.
//  주석처리된 문장을 추가해주면(=배열 heap 자리생성) 오류나지 않음