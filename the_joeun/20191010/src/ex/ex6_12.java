package ex;

import java.util.Scanner;

public class ex6_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dan, i;
		
		System.out.printf("¸î ´Ü? ");
		dan = scan.nextInt();
		
		for(i=1;i<10;i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		scan.close();
	}

}
