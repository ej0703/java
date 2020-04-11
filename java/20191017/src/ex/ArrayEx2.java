package ex;

public class ArrayEx2 {
	enum Week {월,화,수,목,금,토,일}; //열거형 상수들 : class 내에서 공유
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		//String 배열 생성
		String name[] = {"사과","포도","체리","바나나","딸기"};
		int sum=0;
		
		//num의 합을 출력하시오(향상된 for문 이용해서)
		for(int i : num) {
			sum += i;
			System.out.print(i+" ");
		}
		System.out.println("합 = "+sum);
		
		//name을 한칸씩 띄어서 출력하시오(향상된 for문 이용해서)
		for(String s : name) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//enumeration(enum) 여러개의 상수가 필요할 때 사용
		//Week에 자료를 출력하기
		for(Week w : Week.values()) { 
			//자바컴파일러는 자동으로 모든 enum을 위한 static values()메서드를 제공한다. (JVM이 자동으로 몰아줌)
			System.out.print(w+"요일 ");
		}
		
		Week w = Week.화;
		System.out.println(w.name());
		System.out.println(w.ordinal());
		
		// enum 객체 생성
		Week day1 = Week.월;
		Week day2 = Week.수;
		System.out.println("1->2 = "+day1.compareTo(day2));
		System.out.println("2->1 = "+day2.compareTo(day1));
		Week weekDay = Week.valueOf("목");
		System.out.println("weekday = "+weekDay);
		
		Week[] wd = Week.values();
		for(int i=0;i<wd.length;i++) {
			System.out.print(wd[i]+"요일 ");
		}
		System.out.println();
		for(Week wk : wd) {
			System.out.print(wk+"요일 ");
		}
	}

}
