package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, count=1;
		String[] name;
		
		System.out.print("�л� ���� �Է��Ͻÿ� >> ");
		num = scan.nextInt();
		name = new String [num];
		
		System.out.print("�л� �̸����� �Է��Ͻÿ� >> ");
		for(int i=0;i<name.length;i++) {
			name[i] = scan.next();
		}
		
		System.out.println();
		System.out.println(" ���̽�&R��� ������ �÷��� ������ ���� ������");
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
