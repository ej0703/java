package ex;

import java.util.Scanner;

public class ex9_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.print("문자열을 입력하세요 : ");
		str = scan.nextLine();
		
		strRep = str.replace(" ", "$");
		strSub = str.substring(3,8);
		strAry = str.split(" ");
		
		System.out.println("입력 문자열 ==> "+str);
		System.out.println("바꾼 문자열 ==> "+strRep);
		System.out.println("일부 문자열 ==> "+strSub);
		for(int i=0;i<strAry.length;i++) {
			System.out.println("분리한 문자열"+i+" ==> "+strAry[i]);
		}
		scan.close();
	}

}
