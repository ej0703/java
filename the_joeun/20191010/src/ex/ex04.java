package ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		int num;
		
		Scanner scan= new Scanner(System.in);
		
		num = scan.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		/*switch(num % 3) {
		case 0:
			System.out.println("3�� ����Դϴ�.");
			break;
		default :
			System.out.println("3�� ����� �ƴմϴ�.");
			break;
		}*/
		scan.close();
	}

}
