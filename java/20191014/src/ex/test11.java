package ex;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int grade1, grade2, grade3;
		double avg;

		System.out.printf("java Exam1 ");
		grade1 = scan.nextInt();
		grade2 = scan.nextInt();
		grade3 = scan.nextInt();

		avg = (grade1 + grade2 + grade3) / 3.0;

		if((grade1<40) || (grade2<40) || (grade3<40)) {
			System.out.println("��� = �������� ���հ�");
			System.out.println("���� = F");
		} else {
			switch((int)avg/10) {
			case 10 :
			case 9 :
				System.out.println("��� = �հ�");
				System.out.println("���� = A");
				break;
			case 8 :
				System.out.println("��� = �հ�");
				System.out.println("���� = B");
				break;
			case 7 :
				System.out.println("��� = �հ�");
				System.out.println("���� = C");
				break;
			case 6 :
				System.out.println("��� = �հ�");
				System.out.println("���� = D");
				break;
			default :
				System.out.println("��� = ���հ�");
				System.out.println("���� = F");
				break;
			}
		}
		scan.close();
	}
}

