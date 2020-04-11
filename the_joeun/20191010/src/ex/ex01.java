package ex;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		int grade;
		
		Scanner scan = new Scanner(System.in);
		
		grade = scan.nextInt();
		
		/*switch(grade/10) {
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default :
			System.out.println("F학점입니다.");
			break;
		}*/
		
		if(grade>=90) {
			System.out.println("A학점입니다.");
		} else if(grade<90 && grade>=80) {
			System.out.println("B학점입니다.");
		} else if(grade<80 && grade>=70) {
			System.out.println("C학점입니다.");
		} else if(grade<70 && grade>=60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}

		scan.close();
	}

}
