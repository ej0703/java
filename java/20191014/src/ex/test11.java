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
			System.out.println("결과 = 과락으로 불합격");
			System.out.println("학점 = F");
		} else {
			switch((int)avg/10) {
			case 10 :
			case 9 :
				System.out.println("결과 = 합격");
				System.out.println("학점 = A");
				break;
			case 8 :
				System.out.println("결과 = 합격");
				System.out.println("학점 = B");
				break;
			case 7 :
				System.out.println("결과 = 합격");
				System.out.println("학점 = C");
				break;
			case 6 :
				System.out.println("결과 = 합격");
				System.out.println("학점 = D");
				break;
			default :
				System.out.println("결과 = 불합격");
				System.out.println("학점 = F");
				break;
			}
		}
		scan.close();
	}
}

