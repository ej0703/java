package ex;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//주요 변수 선언
		int n1, n2, result1=0;
		double result2 = 0;
		char op; //연산자
		
		System.out.printf("첫번째 정수 입력 : ");
		n1 = scan.nextInt();
		System.out.printf("두번째 정수 입력 : ");
		n2 = scan.nextInt();
		System.out.printf("연산자 입력[+,-,/,*,%] : ");
		op = scan.next().charAt(0);
		//op = (char)System.in.read();
		
		/*
		 * if(op='+') {
		 *  result1 = n1 + n2; 
		 * } else if(op='-') {
		 * 	result1 = n1 - n2; 
		 * } else if(op='/') {
		 *  result2 = (double)n1 / n2; 
		 * } else if(op='*') {
		 *  result1 = n1 * n2; 
		 * } else if(op='%') {
		 *  result1 = n1 % n2; 
		 * }
		 */
		
		switch(op) {
		case '+' :
			result1 = n1 + n2;
			break;
		case '-' :
			result1 = n1 - n2;
			break;
		case '/' :
			result2 = (double)n1 / n2;
			break;
		case '*' :
			result1 = n1 * n2;
			break;
		case '%' :
			result1 = n1 % n2;
			break;
		}
		
		if(op=='/') {
			System.out.printf("%d %c %d = %.2f", n1, op, n2, result2);
		} else {
			System.out.printf("%d %c %d = %d", n1, op, n2, result1);
		}
		scan.close();
	}

}
