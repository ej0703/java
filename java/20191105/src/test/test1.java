package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] month = {"January","February","March","April","May","June","July","August","September","October","Nobember","December"};
		int answer;
		boolean run = true;

		while(run) {
			int num = (int)(Math.random()*12+1);
			System.out.println("<<  ���� "+month[num-1]+"  >>");
			System.out.print("�� ���ΰ���? [1~12��, 0:����] : ");
			answer = scan.nextInt();

			if(answer == num)
				System.out.println("�����Դϴ�.\n");
			else if (answer == 0) 
				run = false;
			else {				
				while(answer != num) {
					System.out.println("�ƴմϴ�.");
					System.out.print("�� ���ΰ���? [1~12��, 0:����] : ");
					answer = scan.nextInt();
				}
				System.out.println("�����Դϴ�.\n");
			}

		}
		System.out.println("���α׷� ����");
		scan.close();
	}

}
