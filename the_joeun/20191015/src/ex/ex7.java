package ex;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		
		//�ֿ� ���� ����
		int n1, n2, result1=0;
		double result2 = 0;
		char op; //������
		
		System.out.printf("ù��° ���� �Է� : ");
		n1 = scan.nextInt();
		System.out.printf("�ι�° ���� �Է� : ");
		n2 = scan.nextInt();
		System.out.printf("������ �Է�[+,-,/,*,%] : ");
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
