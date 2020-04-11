package ex;

import java.util.Scanner;

public class winLoseGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a, b;

		while(true) {
			System.out.printf("가위, 바위, 보 중에서 하나를 입력하시오.(다른 문자 입력시 종료)\n");
			System.out.printf("A>> ");
			a = scan.nextLine(); //String 입력받기
			System.out.printf("B>> ");
			b = scan.nextLine(); //String 입력받기

			if((a.equals("보") && b.equals("바위")) || (b.equals("보") && a.equals("바위"))) { //보로 이기는 경우
				System.out.printf("보가 이겼습니다.\n\n");
			} else if((a.equals("가위") && b.equals("보")) || (a.equals("보") && b.equals("가위"))){ //가위로 이기는 경우
				System.out.printf("가위가 이겼습니다.\n\n");
			} else if((a.equals("바위") && b.equals("가위")) || (a.equals("가위") && b.equals("바위"))) { //바위로 이기는 경우
				System.out.printf("바위가 이겼습니다.\n\n");
			} else if(a.contentEquals(b)) { //비기는 경우
				if((a.equals("가위")|| a.equals("바위")) || a.equals("보")) {	//관련 없는 문자 a,b 동시에 입력한 경우를 제외하기 위해
				} else break;
				System.out.printf("비겼습니다.\n\n");
			} else break; //관련 없는 문자 입력 한 경우 종료
		}
		System.out.printf("프로그램을 종료합니다.");
		scan.close();
	}

}
