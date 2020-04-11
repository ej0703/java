package ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		int num;
		
		Scanner scan= new Scanner(System.in);
		
		num = scan.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		/*switch(num % 3) {
		case 0:
			System.out.println("3의 배수입니다.");
			break;
		default :
			System.out.println("3의 배수가 아닙니다.");
			break;
		}*/
		scan.close();
	}

}
