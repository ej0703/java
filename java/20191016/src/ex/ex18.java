package ex;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;
		int temp;

		System.out.print("ù��° �� �Է� : ");
		n1 = scan.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		n2 = scan.nextInt();
		System.out.print("����° �� �Է� : ");
		n3 = scan.nextInt();

		if((n1>n2)&&(n1>n3)) { //n1�� ���� Ŭ �� �� �ڷ�
			temp = n1;
			n1 = n3;
			n3 = temp;
		} else if ((n2>n1)&&(n2>n3)) { //n2�� ���� Ŭ �� �� �ڷ�
			temp = n2;
			n2 = n3;
			n3 = temp;
		} //n3�� ���� Ŭ ��� ó���� �ʿ� ����
		
		if(n2<n1) { //���� ū ���� ���������Ƿ� �� ���� ���� ������� ����
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		System.out.println(n1 + " "+n2 + " "+n3);
		scan.close();
	}

}
