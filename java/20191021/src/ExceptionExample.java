

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int divisor=0;
		int dividend=0;
		
		System.out.print("�� �� : ");
		dividend =scan.nextInt();
		System.out.print("������ : ");
		divisor =scan.nextInt();
		try { //����� ���� �˻� : �����ϸ� catch�� ��, �������ϸ� ���� ����
		System.out.println("dividend�� divisor�� ������ ���� "+dividend/divisor+"�Դϴ�.");
		}catch (ArithmeticException e) { //���� �˻�� ���� �߻��ϸ� ����ͼ� ó����
			System.out.println(e.getMessage());
			System.out.println("zero�� ���� �� �����.");
		} finally { //�ڿ��� ��ȯ�Ҷ�
			System.out.println("���� ������ �����ϰ� ����� ������ ������.");
		}
		scan.close();
	}

}
