package ex;

import java.util.Scanner;

public class ex9_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int res;
		int oper, a, b;
		
		System.out.printf("��� �Է� (1:+, 2:-, 3:*, 4:/) : ");
		oper = scan.nextInt();
		System.out.printf("ù��° ���ڸ� �Է� : ");
		a = scan.nextInt();
		System.out.printf("�ι�° ���ڸ� �Է� : ");
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
		System.out.printf("��� ����� : %d\n", result);
		return;
	}

}
