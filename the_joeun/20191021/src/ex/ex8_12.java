package ex;

import java.util.Scanner;

public class ex8_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] stack = new char[5];
		int top =0;

		char carName = 'A';
		int select = 9;

		while(select != 3) {
			System.out.print("<1>�ڵ��� �ֱ� <2>�ڵ��� ���� <3>�� : ");
			select = scan.nextInt();

			switch(select) {
			case 1 : 
				if(top<5) {
					stack[top] = carName++;
					System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
					top++;
				} else {
					System.out.println("�ͳ��� �� ���� �ͳο� �� ��.");
				}
				break;
			case 2:
				if(top>0) {
					top--;
					System.out.printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
					stack[top] = ' ';
				} else {
					System.out.println("�������� �ڵ����� ����.");
				}
				break;
			case 3:
				System.out.printf("���� �ͳο� %d�밡 ����\n",top);
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default :
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		scan.close();

	}

}
