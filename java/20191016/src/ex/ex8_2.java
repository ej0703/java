package ex;

import java.util.Scanner;

public class ex8_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int[] aa = new int[4];
		int sum=0;

		System.out.print(" �ʱⰪ ==> ");
		pr(aa); //�ʱⰪ ���
		System.out.println();
		sum = forInput(aa, scan);
		System.out.println("--------�迭�� �Է� �� ó�� ����--------");
		pr(aa); //�Է��� �迭�� ���
		System.out.printf("\n �հ� ==> %d\n", sum); //�� ���
		scan.close();
	}
	
	public static void pr (int[] a) { //�迭 ��ü�� �� ���
		for(int i=0;i<a.length;i++) {
			System.out.print("["+i+"]="+a[i]+" ");
		}
	}
	public static int forInput (int[] a, Scanner scan) {
		int sum=0;
		
		for(int i=0;i<a.length;i++) { 
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ��� : ");
			a[i] = scan.nextInt(); //�迭�� �Է¹ޱ�
			sum += a[i]; //�Է¹��� �� �տ� ���ϱ�
		}
		return sum;
	}
}
