package ex;

import java.util.Scanner;

public class ex18_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;

		System.out.print("첫번째 수 입력 : ");
		n1 = scan.nextInt();
		System.out.print("두번째 수 입력 : ");
		n2 = scan.nextInt();
		System.out.print("세번째 수 입력 : ");
		n3 = scan.nextInt();

		if((n1>n2)&&(n1>n3)) { //n1이 가장 클 때 맨 뒤로
			n1 = n1^n3;
			n3 = n3^n1;
			n1 = n1^n3;
		} else if ((n2>n1)&&(n2>n3)) { //n2가 가장 클 때 맨 뒤로
			n2 = n2^n3;
			n3 = n3^n2;
			n2 = n2^n3;
		} //n3가 가장 클 경우 처리할 필요 없음
		
		if(n2<n1) { //가장 큰 수는 정해졌으므로 두 숫자 작은 순서대로 나열
			n2 = n2^n1;
			n1 = n1^n2;
			n2 = n2^n1;
		}
		System.out.println(n1 + " "+n2 + " "+n3);
		scan.close();
	}

}
