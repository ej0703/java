import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		int java, oracle, web;
		int sum;
		double average;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("����� �������� �Է��Ͻÿ�[�ڹ�, ����Ŭ, ��ǥ��]\n�ڹ�   ���� : ");
		java = scan.nextInt();
		System.out.print("����Ŭ ���� : ");
		oracle = scan.nextInt();
		System.out.print("��ǥ�� ���� : ");
		web = scan.nextInt();
		
		sum = java + oracle + web;
		average = sum/4.0;
		System.out.println();
		System.out.println("�ڹ�   ����Ŭ   ��ǥ��   ����    ���");
		System.out.println("-------------------------------");
		System.out.println(java+"   "+oracle+"    "+web+"    "+sum+"   "+average);
	
		scan.close();
	}

}
