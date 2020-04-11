package ex;

import java.util.Scanner;

public class ex6_11 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int start, finish, up;
		int i, sum=0;
		
		System.out.printf("시작값 입력 : ");
		start = scan.nextInt();
		System.out.printf("끝  값 입력 : ");
		finish = scan.nextInt();
		System.out.printf("증가값 입력 : ");
		up = scan.nextInt();
		
		for(i=start; i<=finish; i+=up) {
			sum += i;
		}
		System.out.printf(" %d에서 %d까지 %d씩 증가한 값의 합 : %d", start, finish, up, sum);
		scan.close();
	}

}
