package ex;

import java.util.Scanner;

public class ex6_11 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int start, finish, up;
		int i, sum=0;
		
		System.out.printf("���۰� �Է� : ");
		start = scan.nextInt();
		System.out.printf("��  �� �Է� : ");
		finish = scan.nextInt();
		System.out.printf("������ �Է� : ");
		up = scan.nextInt();
		
		for(i=start; i<=finish; i+=up) {
			sum += i;
		}
		System.out.printf(" %d���� %d���� %d�� ������ ���� �� : %d", start, finish, up, sum);
		scan.close();
	}

}
