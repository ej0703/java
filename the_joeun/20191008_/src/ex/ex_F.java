package ex;

import java.util.Scanner;

public class ex_F {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("���� �����ϼ��� : ");
		a= s.nextInt();
		
		switch(a) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("���Դϴ�.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("�����Դϴ�.");
			break;
		case 9 :
		case 10 :		
		case 11 :
			System.out.println("�����Դϴ�.");
			break;
		default :
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
			break;
		}
		s.close();
	}
}