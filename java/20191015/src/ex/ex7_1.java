package ex;

import java.util.Scanner;

public class ex7_1 {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		
		//�ֿ� ���� ����
		int n1, n2, result1=0;
		double result2 = 0;
		char op1; //������
		String op;
		
		System.out.print("ù��° ���� �Է� : ");
		n1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		n2 = scan.nextInt();
		System.out.print("������ �Է�[+,-,/,*,%] : ");
		//char�� ������ �Է� ���� �� String������ �����Ͽ� ó��
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
