package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		
		switch(str) {
		case "남자" :
			System.out.println(str +"입니다.");
			break;
		case "여자" :
			System.out.printf("%s입니다.", str);
			break;
		}
		scan.close();
	}

}
