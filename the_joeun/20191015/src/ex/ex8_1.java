package ex;

import java.io.*;

public class ex8_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
//		String ch1;

		while(true) {
			System.out.print("알파벳 한 문자 입력: ");
			ch = br.readLine().charAt(0);	
			// 밑에 두 줄이 위에 한 줄로 축약
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
					System.out.println((char)ch+"는 모음입니다."); 
					break; 
				default :
					System.out.println((char)ch+"는 자음입니다.");
					break; 
				}
			} else {
				System.out.println("입력 오류");
				break;
			}
		}
		System.out.println("프로그램이 종료");
	}

}
