package ex;

import java.io.*;

public class ex4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n=0;
		while(true) {
			System.out.print("������ ���� �Է� ");
			n= Integer.parseInt(br.readLine());
			if(n==-1) break;

			if(n%2==0) {
				System.out.println(n+" ¦����.");
			} else if(n%2 != 0) {
				System.out.println(n+" Ȧ����.");				
			} else {
				System.out.println("�ǵ� �Ұ�");
			}
		}
		System.out.println("���α׷� ����");
	}

}
