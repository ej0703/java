package ex;

import java.util.Scanner;

public class ex6_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, i;
		int sum=0;
		
		System.out.printf("�� �Է� : ");
		num = scan.nextInt();
		
		for(i=1;i<=num;i++) {
			sum +=i;
		}
		System.out.printf(" 1���� %d������ �� : %d", num, sum);
		scan.close();
	}

}
