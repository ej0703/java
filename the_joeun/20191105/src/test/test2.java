package test;

import java.io.*;

public class test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x, y;
		int a, b;
		
		System.out.print("ù��° ���� �Է� : ");
		x = br.readLine();
		a = Integer.parseInt(x);
		System.out.print("�ι�° ���� �Է� : ");
		y = br.readLine();
		b = Integer.parseInt(y);
		
		System.out.println("\n==[ ���� ��� ]==");
		System.out.printf("%3d  + %3d = %3d\n", a,b,a+b);
		System.out.printf("%3d  - %3d = %3d\n", a,b,a-b);
		System.out.printf("%3d  * %3d = %3d\n", a,b,a*b);
		System.out.printf("%3d  / %3d = %3d\n", a,b,a/b);
		System.out.printf("%3d  %% %3d = %3d\n", a,b,a%b);
	}
}
