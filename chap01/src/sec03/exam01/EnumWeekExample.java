package sec03.exam01;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal=Calendar.getInstance();
// .getInstance() 객체를 단 한개 생성할 때 쓰는 것. new 랑은 heap생성은 같으나, 살짝다른것.
		int week = cal.get(Calendar.DAY_OF_WEEK);
// Calendar.DAY_OF_WEEK는 요일을 integer로 정의함. 1=sunday .....
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일: "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 정올을 풉니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.");
		}

	}

}
