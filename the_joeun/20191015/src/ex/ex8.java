package ex;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;

		while(true) {
			System.out.print("알파벳 한 문자 입력: ");
			ch = scan.next().charAt(0);

			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				/*
				 * if((ch =='a')||(ch =='e')||(ch =='i')||(ch =='o')||(ch =='u')) {
				 * System.out.println(ch+"는 모음입니다."); 
				 * } else if((ch =='A')||(ch =='E')||(ch =='I')||(ch =='O')||(ch =='U')) {
				 *  System.out.println(ch+"는 모음입니다."); 
				 * } else {
				 * System.out.println(ch+"는 자음입니다."); 
				 * }
				 */ 

				switch(String.valueOf(ch).toUpperCase()) { 
				/*case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : 
				* case 'A' : case 'E' : case 'I' : case 'O' :	case 'U' :
				* 이런 경우에는 switch(ch) { ~ */
				case "A" : case "E" : case "I" : case "O" :
					System.out.println(ch+"는 모음입니다."); 
					break; 
				default :
					System.out.println(ch+"는 자음입니다.");
					break; 
				}
			} else {
				System.out.println("입력 오류");
				break;
			}
		}
		System.out.println("프로그램이 종료");
		scan.close();
	}

}
