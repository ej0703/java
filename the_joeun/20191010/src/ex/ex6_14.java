package ex;

import java.util.Scanner;

public class ex6_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, j;
		int dan1, dan2;
		
		for(i=0;i<=9;i++) {
			for(j=2;j<=9;j++) {
				if(i==0) {
					System.out.printf("       %d 단      ", j);
				} else {
					System.out.printf("%3d X %d = %2d", j, i, i*j);
					if(j != 9) {
						System.out.printf(" |");
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.printf("몇 단부터? ");
		dan1 = scan.nextInt();
		System.out.printf("몇 단까지? ");
		dan2 = scan.nextInt();
		
		for(i=dan1;i<=dan2;i++) {
			System.out.printf("%d 단 : ", i);
			for(j=1;j<=9;j++) {
				System.out.printf("%2d X %d = %2d", i, j, i*j);
				
				if(j != 9) {
					System.out.printf(" |");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
