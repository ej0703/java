package calendar;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		//객체 얻어오기
		//추상클래스이기 때문(객체를 자신이외는 만들 수 없음)
		//상속받은 클래스에서 추상메소드를 재정의 하면 상속받은 클래스에서 객체를 생성할 수 있다.
		//But, Calendar는 이런 방식을 객체를 얻어옴.
		//==>싱글톤 패턴(팩토리 패턴)
		//class abstract Calendar{
		//Calendar cal;
		//static Calendar getInstance() {
		//  if (cal == null) {
		//		cal = new Calendar();
		//	}
		//	return cal;
		//} //메서드
		//} //클래스
		Calendar cal=Calendar.getInstance();
//		System.out.println(cal);
		int week= cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
		case 1:
			today=Week.SUNDAY; break;
		case 2:
			today=Week.MONDAY; break;
		case 3:
			today=Week.TUESDAY; break;
		case 4:
			today=Week.WEDNSDAY; break;
		case 5:
			today=Week.THURSDAY; break;
		case 6:
			today=Week.FRIDAY; break;
		case 7:
			today=Week.SATURDAY; break;
		}

		System.out.println("오늘 요일 : "+today);
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");	
		} else {
			System.out.println("열심히 자바공부를 합니다.");	
		}

	}

}
