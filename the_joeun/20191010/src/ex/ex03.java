package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		
		switch(str) {
		case "����" :
			System.out.println(str +"�Դϴ�.");
			break;
		case "����" :
			System.out.printf("%s�Դϴ�.", str);
			break;
		}
		scan.close();
	}

}
