package ex;

import java.util.Scanner;

public class ex5_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("1~4 �߿� �����ϼ��� : ");
		a= s.nextInt(); //long�� ����X, �Ǽ� X, boolean X
		
		switch(a) {
		case 1 :
			System.out.println("1�� �����ߴ�.");
			break;
		case 2 :
			System.out.println("2�� �����ߴ�.");
			break;
		case 3 :
			System.out.println("3�� �����ߴ�.");
			break;
		case 4 :
			System.out.println("4�� �����ߴ�.");
			break;
		default :
			System.out.println("�̻��Ѱ� �����ߴ�.");
			break;
		}
		s.close();
	}

}