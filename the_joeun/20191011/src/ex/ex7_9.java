package ex;

import java.util.Scanner;

public class ex7_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int n1, n2;
		int result=0;
		int count=1;

		while(true) {
			System.out.printf("%d번>\n", count);
			System.out.printf("더할 첫번째 수 입력 : ");
			n1 = scan.nextInt();
			
			if(n1 == 0) break;
			
			System.out.printf("더할 두번째 수 입력 : ");
			n2 = scan.nextInt();
			
			result = n1 + n2;
			System.out.printf("%d + %d = %d\n\n", n1, n2, result);
			
			count++;
		}

		System.out.println("0을 입력해서 반복문을 탈출했습니다.");
		scan.close();
	}

}
