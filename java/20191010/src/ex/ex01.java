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
		}*/
		
		if(grade>=90) {
			System.out.println("A�����Դϴ�.");
		} else if(grade<90 && grade>=80) {
			System.out.println("B�����Դϴ�.");
		} else if(grade<80 && grade>=70) {
			System.out.println("C�����Դϴ�.");
		} else if(grade<70 && grade>=60) {
			System.out.println("D�����Դϴ�.");
		} else {
			System.out.println("F�����Դϴ�.");
		}

		scan.close();
	}

}
