package ex;

import java.util.Scanner;

public class ex7_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int order;
		
		do {
			System.out.printf(" �մ� �ֹ��Ͻðڽ��ϱ�?\n");
			System.out.printf("<1>ī��� <2>īǪġ�� <3>�Ƹ޸�ī�� <4>�׸���ų���� => ");
			order = scan.nextInt();
			switch(order) {
			case 1 : System.out.printf("#ī��� �ֹ��ϼ̽��ϴ�.\n\n");break;
			case 2 : System.out.printf("#īǪġ�� �ֹ��ϼ̽��ϴ�.\n\n");break;
			case 3 : System.out.printf("#�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.\n\n");break;
			case 4 : System.out.printf(" �ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.\n");break;
			default : System.out.printf(" �߸� �����̽��ϴ�.\n\n");break;
			}
		} while(order != 4);
		
		System.out.printf(" �����մϴ�. ������ �� �̿����ּ���.\n");
		scan.close();
	}

}
