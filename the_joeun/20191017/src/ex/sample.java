package ex;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a;
		int n, count=0;
		int sum=0, entireN=0, entireSum=0;
		double avg=0;
			
		while(true) {
			//�迭�� ũ�� ���ϱ�
			if(count != 0) {
				System.out.print("\n\n");
			}
			System.out.print("�迭 ����(0 �Է½� ����) : ");
			n= scan.nextInt(); //���ϴ� �迭�� ���� scanner�� �Է¹ޱ�
			if(n==0) break; //Ż�� ���� : 0 �Է�
			a = new int[n]; //�Է¹��� ����ŭ�� �迭�� ũ��� ����
			entireN += n;
			count++;
			sum=0;
						
			//�迭�� �� �Է¹ް� ��, ��� ���ϱ�
			System.out.printf("[%d��° �迭�� �� �Է�] ", count);
			for(int i=0;i<a.length;i++) { //�迭�� ���̸�ŭ �ݺ�
				a[i] = scan.nextInt(); //�迭�� �� �Է¹ޱ�
				sum += a[i];
				entireSum += a[i];
			}
			avg = sum/(double)a.length;

			//�迭 �� �״�� ���
			System.out.println(">>>�迭�� �� �״�� ���<<<");
			for(int i : a) { //���� for��(for each��)
				System.out.print(i+" ");
			}
			//�迭�� �� �Ųٷ� ���. ��, ��� ���
			System.out.println("\n>>>�迭�� �� �Ųٷ� ���<<<");
			for(int i=(a.length-1);i>=0;i--) {
				System.out.print(a[i]+" ");
			}
			System.out.println("\n>>>��, ��� ���");
			System.out.printf("�� = %d\n��� = %.2f", sum, avg);
		}
		System.out.println("���α׷� ����");
		scan.close();		
		
		//��ü ��, ��� ���
		avg = entireSum / (double)entireN;
		System.out.printf("\n>>>�迭 %d���� �� %d�� ������ ��, ��� ���\n",count, entireN);
		System.out.printf("��ü �� = %d\n��ü��� = %.2f\n", entireSum, avg);
	}
	
}
