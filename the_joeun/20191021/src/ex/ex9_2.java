package ex;

import java.util.Scanner;

public class ex9_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է� ==> ");
		str = scan.nextLine();
		
		System.out.print("��� ���ڿ� ==> ");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'o')
				System.out.printf("%c", '$');
			else
				System.out.printf("%c", str.charAt(i));
		}
		scan.close();
	}

}
