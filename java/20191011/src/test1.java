import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.printf("영문자를 입력하시오 >> ");
			char a = scan.next().charAt(0);
			
			input = (int)a;

			if((input >= 'a') && (input <= 'z')) {
				input -=32;
				System.out.printf("%s\n", (char)input);
			} else if ((input >= 'A') && (input <='Z')) {
				input += 32;
				System.out.printf("%s\n", (char)input);
			} else {
				System.out.printf("영문자가 아닙니다.\n");
			}
			scan.close();
		}
	}
}
