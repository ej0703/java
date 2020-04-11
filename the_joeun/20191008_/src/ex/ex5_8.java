package ex;

import java.util.Scanner;

public class ex5_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("점수를 입력하세요 : ");
		a = s.nextInt();
		
		//중첩 if
		/*if(a>=90) {
			System.out.printf("A");
		} else {
			if(a>=80) {
				System.out.printf("B");
			} else {
				if(a>=70) {
					System.out.printf("C");
				} else {
					if(a>=60) {
						System.out.printf("D");
					} else {
						System.out.printf("F");
					}
				}
			}
		}*/
		
		//간소화 중첩 if
		if(a>=90) {
			System.out.printf("A");
		} else if(a>=80) {
			System.out.printf("B");
		} else if(a>=70) {
			System.out.printf("C");
		} else if(a>=60) {
			System.out.printf("D");
		} else {
			System.out.printf("F");
		}
				
		System.out.println("학점입니다.");
		s.close();
	}

}
