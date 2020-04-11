package test;

import java.io.*;

public class test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x, y;
		int a, b;
		
		System.out.print("첫번째 정수 입력 : ");
		x = br.readLine();
		a = Integer.parseInt(x);
		System.out.print("두번째 정수 입력 : ");
		y = br.readLine();
		b = Integer.parseInt(y);
		
		System.out.println("\n==[ 연산 결과 ]==");
		System.out.printf("%3d  + %3d = %3d\n", a,b,a+b);
		System.out.printf("%3d  - %3d = %3d\n", a,b,a-b);
		System.out.printf("%3d  * %3d = %3d\n", a,b,a*b);
		System.out.printf("%3d  / %3d = %3d\n", a,b,a/b);
		System.out.printf("%3d  %% %3d = %3d\n", a,b,a%b);
	}
}
