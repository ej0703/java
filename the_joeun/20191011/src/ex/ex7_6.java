package ex;

import java.util.Scanner;

public class ex7_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int order;
		
		do {
			System.out.printf(" 손님 주문하시겠습니까?\n");
			System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 => ");
			order = scan.nextInt();
			switch(order) {
			case 1 : System.out.printf("#카페라떼 주문하셨습니다.\n\n");break;
			case 2 : System.out.printf("#카푸치노 주문하셨습니다.\n\n");break;
			case 3 : System.out.printf("#아메리카노 주문하셨습니다.\n\n");break;
			case 4 : System.out.printf(" 주문하신 커피 준비하겠습니다.\n");break;
			default : System.out.printf(" 잘못 누르셨습니다.\n\n");break;
			}
		} while(order != 4);
		
		System.out.printf(" 감사합니다. 다음에 또 이용해주세요.\n");
		scan.close();
	}

}
