package ex;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int balence = 0;
		int mid;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println(" 1.���� | 2.��� | 3.�ܱ� | 4.����");
			System.out.println("-------------------------------");
			System.out.printf("����>> ");

			switch(scan.nextInt()) {
			case 1 :
				System.out.printf("���ݾ�>> ");
				mid = scan.nextInt();
				System.out.printf("(���� �ܾ�)%d + (���ݾ�)%d = %d\n", balence, mid, balence+mid);
				balence += mid;
				break;
			case 2 :
				System.out.printf("��ݾ�>> ");
				mid = scan.nextInt();
				System.out.printf("(���� �ܾ�)%d - (��ݾ�)%d = %d\n", balence, mid, balence-mid);
				balence -= mid;
				break;
			case 3 :
				System.out.printf("�ܾ�>> %d\n", balence);
				break;
			case 4 :
				run = false;
			}
		}
		
		System.out.printf("\n���α׷� ����");
		scan.close();
	}

}
