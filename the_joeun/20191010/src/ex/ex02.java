package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		int month;
		
		Scanner scan = new Scanner(System.in);
		
		month = scan.nextInt();
		
		if((2>=month && month>0) || month==12) {
			System.out.println("겨울");
		} else if(2<month && month<=5) {
			System.out.println("봄");
		} else if(5<month && month<=8) {
			System.out.println("여름");
		} else if(8<month && month<=11) {
			System.out.println("가을");
		}
		scan.close();
	}

}
