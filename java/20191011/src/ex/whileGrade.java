package ex;

import java.util.Scanner;

public class whileGrade {

	public static void main(String[] args) {
		int grade;

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.printf("������ �Է��ϼ���. ");
			grade = scan.nextInt();

			switch(grade/10) {
			case 10:
			case 9:
				System.out.println("A�����Դϴ�.");
				break;
			case 8:
				System.out.println("B�����Դϴ�.");
				break;
			case 7:
				System.out.println("C�����Դϴ�.");
				break;
			case 6:
				System.out.println("D�����Դϴ�.");
				break;
			default :
				System.out.println("F�����Դϴ�.");
				break;
			}
			scan.close();
		}
	}

}
