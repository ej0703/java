package ex;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] intArray = new char[5];
		int max=0;
		
		for(int i=0;i<intArray.length;i++) {
			System.out.printf("�迭[%d]�� �ʱ� �� : %c\n",i,intArray[i]);			
		}
		
		System.out.print("���� �Է��غ����� >> ");
		
		for(int i=0;i<intArray.length;i++) {			
			intArray[i]=(char) scan.nextInt();
			if((int)intArray[i]>max) 
				max = intArray[i];
		}
		System.out.println("�Էµ� ������ ���� ū �� = "+max);
		scan.close();
	}

}
