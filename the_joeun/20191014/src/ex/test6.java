package ex;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		int kor, eng, mat;
		int sum;
		double avg;
		
		name = scan.next();
		kor = scan.nextInt();
		eng = scan.nextInt();
		mat = scan.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.println("¿Ã∏ß : "+name);
		System.out.println("√—¡° : "+sum);
		System.out.printf("∆Ú±’ : %.2f", avg);
		scan.close();
	}

}
