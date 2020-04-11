package ex;

import java.util.Scanner;

public class ex7_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade;
		int sum=0;	
		
		System.out.printf("값을 입력하세요. (종료 ctrl + z) ");
		
		while(scan.hasNext()) {
			grade = scan.nextInt();
			sum +=grade;
			System.out.printf("값을 입력하세요. (종료 ctrl + z) ");
		}
		System.out.printf("\n지금까지 입력한 점수의 합 : %d", sum);
		scan.close();
	}
}
