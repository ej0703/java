import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.printf("�����ڸ� �Է��Ͻÿ� >> ");
			char a = scan.next().charAt(0);
			
			input = (int)a;

			if((input >= 'a') && (input <= 'z')) {
				input -=32;
				System.out.printf("%s\n", (char)input);
			} else if ((input >= 'A') && (input <='Z')) {
				input += 32;
				System.out.printf("%s\n", (char)input);
			} else {
				System.out.printf("�����ڰ� �ƴմϴ�.\n");
			}
			scan.close();
		}
	}
}
