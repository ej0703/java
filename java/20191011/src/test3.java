import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price;
		
		System.out.printf("�ݾ��� �Է��Ͻÿ�>> ");
		price = scan.nextInt();
		
		System.out.printf("�������� %d��\n", price/50000);
		price = price%50000;
		System.out.printf("������ %d��\n", price/10000);
		price = price%10000;
		System.out.printf("õ���� %d��\n", price/1000);
		price = price%1000;
		System.out.printf("����� %d��\n", price/500);
		price = price%500;
		System.out.printf("��� %d��\n", price/100);
		price = price%100;
		System.out.printf("���ʿ� %d��\n", price/50);
		price = price%50;
		System.out.printf("�ʿ� %d��\n", price/10);
		scan.close();
	}

}
