package ex;

import java.io.IOException;

public class ex8_2 {

	public static void main(String[] args) throws IOException {
		char ch;

		while(true) {
			System.out.print("알파벳 한 문자 입력: ");
			ch = (char)System.in.read();
			System.in.skip(2);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				
				if((ch =='a')||(ch =='e')||(ch =='i')||(ch =='o')||(ch =='u')) {
				  System.out.println(ch+"는 모음입니다."); 
				} else if((ch =='A')||(ch =='E')||(ch =='I')||(ch =='O')||(ch =='U')) {
				   System.out.println(ch+"는 모음입니다."); 
				} else {
				  System.out.println(ch+"는 자음입니다."); 
				}
				
			} else {
				System.out.println("입력 오류");
				break;
			}
		}
		System.out.println("프로그램이 종료");
	}

}
