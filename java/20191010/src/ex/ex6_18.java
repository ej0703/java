package ex;

import java.util.Scanner;

public class ex6_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		for(;;) {
			System.out.printf("���� ù ��° �� �Է� : ");
			a = scan.nextInt();
			System.out.printf("���� �� ��° �� �Է� : ");
			b = scan.nextInt();
			System.out.printf(" %d + %d = %d\n\n", a, b, a+b);
			scan.close();
		}

	}

}
