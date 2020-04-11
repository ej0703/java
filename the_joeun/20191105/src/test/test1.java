package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] month = {"January","February","March","April","May","June","July","August","September","October","Nobember","December"};
		int answer;
		boolean run = true;

		while(run) {
			int num = (int)(Math.random()*12+1);
			System.out.println("<<  문제 "+month[num-1]+"  >>");
			System.out.print("몇 월인가요? [1~12월, 0:종료] : ");
			answer = scan.nextInt();

			if(answer == num)
				System.out.println("정답입니다.\n");
			else if (answer == 0) 
				run = false;
			else {				
				while(answer != num) {
					System.out.println("아닙니다.");
					System.out.print("몇 월인가요? [1~12월, 0:종료] : ");
					answer = scan.nextInt();
				}
				System.out.println("정답입니다.\n");
			}

		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
