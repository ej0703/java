package ex;

import java.util.Scanner;

public class ex_F {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("월을 선택하세요 : ");
		a= s.nextInt();
		
		switch(a) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울입니다.");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름입니다.");
			break;
		case 9 :
		case 10 :		
		case 11 :
			System.out.println("가을입니다.");
			break;
		default :
			System.out.println("해당하는 계절이 없습니다.");
			break;
		}
		s.close();
	}
}
