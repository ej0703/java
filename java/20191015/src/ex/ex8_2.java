package ex;

import java.io.IOException;

public class ex8_2 {

	public static void main(String[] args) throws IOException {
		char ch;

		while(true) {
			System.out.print("���ĺ� �� ���� �Է�: ");
			ch = (char)System.in.read();
			System.in.skip(2);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				
				if((ch =='a')||(ch =='e')||(ch =='i')||(ch =='o')||(ch =='u')) {
				  System.out.println(ch+"�� �����Դϴ�."); 
				} else if((ch =='A')||(ch =='E')||(ch =='I')||(ch =='O')||(ch =='U')) {
				   System.out.println(ch+"�� �����Դϴ�."); 
				} else {
				  System.out.println(ch+"�� �����Դϴ�."); 
				}
				
			} else {
				System.out.println("�Է� ����");
				break;
			}
		}
		System.out.println("���α׷��� ����");
	}

}
