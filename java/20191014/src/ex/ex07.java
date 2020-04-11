package ex;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int balence = 0;
		int mid;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔금 | 4.종료");
			System.out.println("-------------------------------");
			System.out.printf("선택>> ");

			switch(scan.nextInt()) {
			case 1 :
				System.out.printf("예금액>> ");
				mid = scan.nextInt();
				System.out.printf("(기존 잔액)%d + (예금액)%d = %d\n", balence, mid, balence+mid);
				balence += mid;
				break;
			case 2 :
				System.out.printf("출금액>> ");
				mid = scan.nextInt();
				System.out.printf("(기존 잔액)%d - (출금액)%d = %d\n", balence, mid, balence-mid);
				balence -= mid;
				break;
			case 3 :
				System.out.printf("잔액>> %d\n", balence);
				break;
			case 4 :
				run = false;
			}
		}
		
		System.out.printf("\n프로그램 종료");
		scan.close();
	}

}
