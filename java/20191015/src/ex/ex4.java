package ex;

import java.io.*;

public class ex4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n=0;
		while(true) {
			System.out.print("임의의 정수 입력 ");
			n= Integer.parseInt(br.readLine());
			if(n==-1) break;

			if(n%2==0) {
				System.out.println(n+" 짝수죠.");
			} else if(n%2 != 0) {
				System.out.println(n+" 홀수죠.");				
			} else {
				System.out.println("판독 불가");
			}
		}
		System.out.println("프로그램 종료");
	}

}
