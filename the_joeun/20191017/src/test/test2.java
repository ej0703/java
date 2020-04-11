package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, count=1;
		String[] name;
		
		System.out.print("학생 수를 입력하시오 >> ");
		num = scan.nextInt();
		name = new String [num];
		
		System.out.print("학생 이름들을 입력하시오 >> ");
		for(int i=0;i<name.length;i++) {
			name[i] = scan.next();
		}
		
		System.out.println();
		System.out.println(" 파이썬&R기반 빅데이터 플랫폼 개발자 과정 연락망");
		System.out.println("========================================");
		for(int i=0;i<name.length;i++) {
			System.out.printf("   %2d.   %s\n", i+1,name[i]);
		}
		System.out.println("========================================");
		for(String s : name) { 
			System.out.printf("   %2d.   %s\n",count,s);
			count++;
		}
		scan.close();
	}

}
