package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울\\\n");
		
		System.out.println("한번\n알아보자");
		System.out.println("두번\r알아보자");
		System.out.println("세번\n\r알아보자");
		System.out.println("네번\r\n알아보자");
		System.out.println("다섯번\n\n알아보자");
		System.out.println("여섯번\r\r알아보자");
	}

}

// 특정환경에서만 \r\n 가능
