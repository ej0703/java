import java.io.*;

public class test1_1 {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		int a;
		System.out.printf("�����ڸ� �Է��Ͻÿ�>> ");
		while(true) {
			try {
				a = rd.read();
				
				if(a==-1) break;
				else if(a=='\n' || a=='\r') continue;
				
				if(a >= 'a' && a<= 'z') {
					a = a- ('a'-'A');
				} else if (a>= 'A' && a <= 'Z') {
					a = a + ('a'-'A');
				} else {
					System.out.println("�����ڰ� �ƴմϴ�.");
					continue;
				}
				System.out.println((char)a);
				System.out.printf("�����ڸ� �Է��Ͻÿ�>> ");
			} catch (IOException e) {
				System.out.println("�Է� ���� �߻�");
			}
		}
	}

}
