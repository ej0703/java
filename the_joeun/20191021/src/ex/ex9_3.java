package ex;
import java.util.Scanner;

public class ex9_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է� ==> ");
		str = scan.nextLine();
		
		System.out.print("��� ���ڿ� ==> ");
		
		if(!str.startsWith("(")) {
			System.out.print("(");
		}
		for(int i=0;i<str.length();i++) {
			System.out.printf("%c", str.charAt(i));
		}
		if (!str.endsWith(")")) {
			System.out.print(")");
		}
		scan.close();
	}

}
