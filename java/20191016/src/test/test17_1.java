package test;

import java.util.Scanner;

public class test17_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int max=0, min=0;
		int count=0;

		while(true) {
			System.out.print("정수 값을 입력하세요(0입력시 종료) : ");
			num = scan.nextInt();
			if(count==0) {
				max = num;
				min = num;
			} else {
				if(num==0) {
					break;
				} else if(num>max) {
					max = num;
				} else if(num<min) {
					min = num;
				}
			}
			count++;
		}

		System.out.println("최대값은 "+ max +"이다.");
		System.out.println("최소값은 "+ min +"이다.");
		scan.close();
	}

}
