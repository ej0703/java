

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int divisor=0;
		int dividend=0;
		
		System.out.print("제 수 : ");
		dividend =scan.nextInt();
		System.out.print("피제수 : ");
		divisor =scan.nextInt();
		try { //실행시 에러 검사 : 존재하면 catch로 감, 비존재하면 문장 수행
		System.out.println("dividend를 divisor로 나누면 몫은 "+dividend/divisor+"입니다.");
		}catch (ArithmeticException e) { //에러 검사시 에러 발생하면 여기와서 처리함
			System.out.println(e.getMessage());
			System.out.println("zero로 나눌 수 없어요.");
		} finally { //자원을 반환할때
			System.out.println("에러 유무에 무관하게 여기는 무조건 실행함.");
		}
		scan.close();
	}

}
