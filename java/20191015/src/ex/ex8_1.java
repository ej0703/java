package ex;

import java.io.*;

public class ex8_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
//		String ch1;

		while(true) {
			System.out.print("���ĺ� �� ���� �Է�: ");
			ch = br.readLine().charAt(0);	
			// �ؿ� �� ���� ���� �� �ٷ� ���
//			ch1 = br.readLine();
//			ch = ch1.charAt(0);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				switch(ch) { 
				case 'a' : 
				case 'e' : 
				case 'i' : 
				case 'o' : 
				case 'u' : 
				case 'A' :
				case 'E' : 
				case 'I' : 
				case 'O' : 
				case 'U' :
					System.out.println((char)ch+"�� �����Դϴ�."); 
					break; 
				default :
					System.out.println((char)ch+"�� �����Դϴ�.");
					break; 
				}
			} else {
				System.out.println("�Է� ����");
				break;
			}
		}
		System.out.println("���α׷��� ����");
	}

}
