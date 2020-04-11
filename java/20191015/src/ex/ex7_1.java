package ex;

import java.util.Scanner;

public class ex7_1 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//주요 변수 선언
		int n1, n2, result1=0;
		double result2 = 0;
		char op1; //연산자
		String op;
		
		System.out.print("첫번째 정수 입력 : ");
		n1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		n2 = scan.nextInt();
		System.out.print("연산자 입력[+,-,/,*,%] : ");
		//char로 연산자 입력 받은 후 String형으로 변경하여 처리
		op1 = scan.next().charAt(0);
		//op = String.valueOf(op1);
		op = Character.toString(op1);	
		
		switch(op) {
		case "+" :
			result1 = n1 + n2;
			break;
		case "-" :
			result1 = n1 - n2;
			break;
		case "/" :
			result2 = (double)n1 / n2;
			break;
		case "*" :
			result1 = n1 * n2;
			break;
		case "%" :
			result1 = n1 % n2;
			break;
		}
		
		if(op.equals("/")) {
			System.out.printf("%d %s %d = %.2f", n1, op, n2, result2);
		} else {
			System.out.printf("%d %s %d = %d", n1, op, n2, result1);
		}
		scan.close();
	}

}
