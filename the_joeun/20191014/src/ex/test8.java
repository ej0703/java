package ex;

import java.io.*;

public class test8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1, n2;
		
		System.out.printf("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.printf("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.printf("%d + %d = %d\n", n1,n2,n1+n2);
		System.out.printf("%d - %d = %d\n", n1,n2,n1-n2);
		System.out.printf("%d * %d = %d\n", n1,n2,n1*n2);
		System.out.printf("%d / %d = %.2f\n", n1,n2,(double)n1/n2);
		System.out.printf("%d %% %d = %d\n", n1,n2,n1%n2);
	}

}
