package ex;

import java.util.Scanner;

public class ex6_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		for(;;) {
			System.out.printf("더할 첫 번째 수 입력 : ");
			a = scan.nextInt();
			System.out.printf("더할 두 번째 수 입력 : ");
			b = scan.nextInt();
			System.out.printf(" %d + %d = %d\n\n", a, b, a+b);
			scan.close();
		}

	}

}
