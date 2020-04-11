package ex;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] intArray = new char[5];
		int max=0;
		
		for(int i=0;i<intArray.length;i++) {
			System.out.printf("배열[%d]의 초기 값 : %c\n",i,intArray[i]);			
		}
		
		System.out.print("수를 입력해보세요 >> ");
		
		for(int i=0;i<intArray.length;i++) {			
			intArray[i]=(char) scan.nextInt();
			if((int)intArray[i]>max) 
				max = intArray[i];
		}
		System.out.println("입력된 수에서 가장 큰 수 = "+max);
		scan.close();
	}

}
