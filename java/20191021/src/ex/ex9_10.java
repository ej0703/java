package ex;

import java.util.Scanner;

public class ex9_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffee;

		System.out.printf("� Ŀ�Ǹ� �帱���? (1:����, 2:����, 3:��) ");
		coffee = scan.nextInt();

		ex9_10 ex = new ex9_10(); // �޼���� static�� ���� ���
		ex.coffee_machine(coffee);
		
		System.out.println("�մ�~ Ŀ�� ���� �ֽ��ϴ�.\n");
		scan.close();
	}

	private int coffee_machine(int coffee) { //�������� �͵��� static �� �ϴ°� �� ����
		System.out.printf("\n# 1. (�ڵ�����)�߰ſ� ���� �غ��Ѵ�.\n");
		System.out.printf("# 2. (�ڵ�����)�������� �غ��Ѵ�.\n");

		switch(coffee) {
		case 1:
			System.out.printf("# 3. (�ڵ�����)����Ŀ�Ǹ� ź��.\n"); break;
		case 2:
			System.out.printf("# 3. (�ڵ�����)����Ŀ�Ǹ� ź��.\n"); break;
		case 3:
			System.out.printf("# 3. (�ڵ�����)��Ŀ�Ǹ� ź��.\n"); break;
		default :
			System.out.printf("# 3. (�ڵ�����)�ƹ� Ŀ�ǳ� ź��.\n"); 	break;
		}		
		System.out.printf("# 4. (�ڵ�����)���� �״´�.\n");
		System.out.printf("# 5. (�ڵ�����)��Ǭ���� ��� ���δ�.\n\n");
		
		return 0;
	}
	
}
