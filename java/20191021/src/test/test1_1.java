package test;

import java.util.Scanner;

public class test1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] month = {2,5,5,1,3,6,1,4,0,2,5,0}; //달력 시작 날짜 위한 공백
		int[] end = {31,28,31,30,31,30,31,31,30,31,30,31}; //날짜수
		int num;

		while(true) {
			System.out.print("몇 월? >> ");
			num = scan.nextInt();
			if(num==0) break;

			System.out.printf(" <    2019년 %2d월     >\n",num);
			System.out.println(" 일  월  화  수  목  금  토");

			for(int k=0;k<month[num-1];k++) { //공백 출력
				System.out.printf("   ");
			}
			for(int j=1;j<=end[num-1];j++) { //날짜 출력
				System.out.printf("%3d",j);

				if((month[num-1]+j)%7==0) {
					System.out.println();
				}
			}
			System.out.println("\n======================");
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}