import java.util.Scanner;

public class teat1 {

	public static void main(String[] args) {
		int age;
		double weight;
		double height;
		
		Scanner scan = new Scanner(System.in); //scan �Լ� �ϳ��� ������ ��
		
		age = scan.nextInt();
		weight = scan.nextDouble();
		height = scan.nextDouble();
		
		System.out.println("����� ���̴� "+age+"�� �Դϴ�.");
		System.out.println("����� ü���� "+weight+"kg �Դϴ�.");
		System.out.println("����� ������ "+height+"cm �Դϴ�.");
		scan.close();
	}

}
