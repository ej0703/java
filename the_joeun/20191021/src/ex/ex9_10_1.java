package ex;

import java.util.Scanner;

public class ex9_10_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffee;
		char customer='A';
		String ret;

		for(int i=0;i<3;i++) {
			System.out.printf("%c��, � Ŀ�Ǹ� �帱���? (1:����, 2:����, 3:��) ", customer);
			coffee = scan.nextInt();

			ex9_10_1 ex = new ex9_10_1(); // �޼���� static�� ���� ���
			ret = ex.coffee_machine(coffee);

			System.out.printf("%c��~ Ŀ�� ���� �ֽ��ϴ�. %s\n", customer++, ret);
			System.out.println("-----------------------------------------------");
		}
		scan.close();
	}

	private String coffee_machine(int coffee) { //�������� �͵��� static �� �ϴ°� �� ����
		System.out.printf("\n# 1. (�ڵ�����)�߰ſ� ���� �غ��Ѵ�.\n");
		System.out.printf("# 2. (�ڵ�����)�������� �غ��Ѵ�.\n");
		
		String str = "";

		switch(coffee) {
		case 1:str="����Ŀ�� ����!!";
			System.out.printf("# 3. (�ڵ�����)����Ŀ�Ǹ� ź��.\n"); break;
		case 2:str="����Ŀ�� ����!!";
			System.out.printf("# 3. (�ڵ�����)����Ŀ�Ǹ� ź��.\n"); break;
		case 3:str="��Ŀ�� ����!!";
			System.out.printf("# 3. (�ڵ�����)��Ŀ�Ǹ� ź��.\n"); break;
		default :str="�ڵ�Ŀ�� ����!!";
			System.out.printf("# 3. (�ڵ�����)�ƹ� Ŀ�ǳ� ź��.\n"); 	break;
		}		
		System.out.printf("# 4. (�ڵ�����)���� �״´�.\n");
		System.out.printf("# 5. (�ڵ�����)��Ǭ���� ��� ���δ�.\n\n");

		return str;
	}

}
