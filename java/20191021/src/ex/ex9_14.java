package ex;

import java.util.Scanner;

public class ex9_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int res;
		int oper, a, b;
		
		System.out.printf("계산 입력 (1:+, 2:-, 3:*, 4:/) : ");
		oper = scan.nextInt();
		System.out.printf("첫번째 숫자를 입력 : ");
		a = scan.nextInt();
		System.out.printf("두번째 숫자를 입력 : ");
		b = scan.nextInt();
		
//		res = calc(a,b,oper);
		calc(a, b, oper);
		
		scan.close();
	}

	private static void calc(int i, int j, int op) {
		int result = 0;
		
		switch(op) {
		case 1:
			result = i+j; break;
		case 2:
			result = i-j; break;
		case 3:
			result = i*j; break;
		case 4:
			result = i/j; break;
		}
		System.out.printf("계산 결과는 : %d\n", result);
		return;
	}

}
