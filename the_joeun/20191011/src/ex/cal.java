package ex;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int n1, n2;
		char calculator;
		double result=0;
		int count=1;

		while(true) {
			System.out.printf("%d번>\n", count);
			System.out.printf("첫번째 수를 입력하세요 : ");
			n1 = scan.nextInt();
			System.out.printf("계산할 연산자를 입력하세요 : ");
			calculator = scan.next().charAt(0);
			System.out.printf("두번째 수를 입력하세요 : ");
			n2 = scan.nextInt();

			if(calculator == '+') {
				result = n1 + n2;
			} else if(calculator == '-') {
				result = n1 - n2;
			} else if(calculator == '*') {
				result = n1 * n2;
			} else if(calculator == '/') {
				result = n1 / (double)n2;
			}
			
			if(calculator == '/') {
				System.out.printf("%d %c %d = %.2f 입니다.\n\n", n1, calculator, n2, result);
			} else {
				System.out.printf("%d %c %d = %d 입니다.\n\n", n1, calculator, n2, (int)result);
			}

			count++;
			scan.close();
		}

	}

}
