package ex;

import java.util.Scanner;

public class winLoseGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a, b;

		while(true) {
			System.out.printf("����, ����, �� �߿��� �ϳ��� �Է��Ͻÿ�.(�ٸ� ���� �Է½� ����)\n");
			System.out.printf("A>> ");
			a = scan.nextLine(); //String �Է¹ޱ�
			System.out.printf("B>> ");
			b = scan.nextLine(); //String �Է¹ޱ�

			if((a.equals("��") && b.equals("����")) || (b.equals("��") && a.equals("����"))) { //���� �̱�� ���
				System.out.printf("���� �̰���ϴ�.\n\n");
			} else if((a.equals("����") && b.equals("��")) || (a.equals("��") && b.equals("����"))){ //������ �̱�� ���
				System.out.printf("������ �̰���ϴ�.\n\n");
			} else if((a.equals("����") && b.equals("����")) || (a.equals("����") && b.equals("����"))) { //������ �̱�� ���
				System.out.printf("������ �̰���ϴ�.\n\n");
			} else if(a.contentEquals(b)) { //���� ���
				if((a.equals("����")|| a.equals("����")) || a.equals("��")) {	//���� ���� ���� a,b ���ÿ� �Է��� ��츦 �����ϱ� ����
				} else break;
				System.out.printf("�����ϴ�.\n\n");
			} else break; //���� ���� ���� �Է� �� ��� ����
		}
		System.out.printf("���α׷��� �����մϴ�.");
		scan.close();
	}

}
