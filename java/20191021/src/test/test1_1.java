package test;

import java.util.Scanner;

public class test1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] month = {2,5,5,1,3,6,1,4,0,2,5,0}; //�޷� ���� ��¥ ���� ����
		int[] end = {31,28,31,30,31,30,31,31,30,31,30,31}; //��¥��
		int num;

		while(true) {
			System.out.print("�� ��? >> ");
			num = scan.nextInt();
			if(num==0) break;

			System.out.printf(" <    2019�� %2d��     >\n",num);
			System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");

			for(int k=0;k<month[num-1];k++) { //���� ���
				System.out.printf("   ");
			}
			for(int j=1;j<=end[num-1];j++) { //��¥ ���
				System.out.printf("%3d",j);

				if((month[num-1]+j)%7==0) {
					System.out.println();
				}
			}
			System.out.println("\n======================");
		}
		System.out.println("���α׷� ����");
		scan.close();
	}
}