package ex;

import java.util.Scanner;

public class ex7_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int n1, n2;
		int result=0;
		int count=1;

		while(true) {
			System.out.printf("%d��>\n", count);
			System.out.printf("���� ù��° �� �Է� : ");
			n1 = scan.nextInt();
			
			if(n1 == 0) break;
			
			System.out.printf("���� �ι�° �� �Է� : ");
			n2 = scan.nextInt();
			
			result = n1 + n2;
			System.out.printf("%d + %d = %d\n\n", n1, n2, result);
			
			count++;
		}

		System.out.println("0�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�.");
		scan.close();
	}

}
