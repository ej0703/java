package ex;

import java.util.Scanner;

public class ex7_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade;
		int sum=0;	
		
		System.out.printf("���� �Է��ϼ���. (���� ctrl + z) ");
		
		while(scan.hasNext()) {
			grade = scan.nextInt();
			sum +=grade;
			System.out.printf("���� �Է��ϼ���. (���� ctrl + z) ");
		}
		System.out.printf("\n���ݱ��� �Է��� ������ �� : %d", sum);
		scan.close();
	}
}
