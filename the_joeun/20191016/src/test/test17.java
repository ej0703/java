package test;

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;
		int max=0, min=0;
		
		System.out.print("�� ���� ���� ���� �Է��ϼ��� : ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		
		if((n1>n2)&&(n1>n3)) {
			max = n1;
			if(n2>n3) {
				min = n3;
			} else {
				min = n2;
			}
		} else if ((n2>n1)&&(n2>n3)) {
			max = n2;
			if(n1>n3) {
				min = n3;
			} else {
				min = n1;
			}
		} else {
			max = n3;
			if(n1>n2) {
				min = n2;
			} else {
				min = n1;
			}
		}
		System.out.println("�ִ밪�� "+ max +"�̴�.");
		System.out.println("�ּҰ��� "+ min +"�̴�.");
		scan.close();
	}

}
