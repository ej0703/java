package ex;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;

		while(true) {
			System.out.print("���ĺ� �� ���� �Է�: ");
			ch = scan.next().charAt(0);

			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				/*
				 * if((ch =='a')||(ch =='e')||(ch =='i')||(ch =='o')||(ch =='u')) {
				 * System.out.println(ch+"�� �����Դϴ�."); 
				 * } else if((ch =='A')||(ch =='E')||(ch =='I')||(ch =='O')||(ch =='U')) {
				 *  System.out.println(ch+"�� �����Դϴ�."); 
				 * } else {
				 * System.out.println(ch+"�� �����Դϴ�."); 
				 * }
				 */ 

				switch(String.valueOf(ch).toUpperCase()) { 
				/*case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : 
				* case 'A' : case 'E' : case 'I' : case 'O' :	case 'U' :
				* �̷� ��쿡�� switch(ch) { ~ */
				case "A" : case "E" : case "I" : case "O" :
					System.out.println(ch+"�� �����Դϴ�."); 
					break; 
				default :
					System.out.println(ch+"�� �����Դϴ�.");
					break; 
				}
			} else {
				System.out.println("�Է� ����");
				break;
			}
		}
		System.out.println("���α׷��� ����");
		scan.close();
	}

}
