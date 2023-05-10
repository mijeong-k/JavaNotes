package p185;

public class LengthExample {

	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println(arr.length);
//		arr.length = 4;

	}

}

// 라인8에 오류메세지 뜸. The final field array.length cannot be assigned.
// 상수필드. 즉, 상수화(Constant)되어있기때문에 고정. 변화시킬 수 없음.