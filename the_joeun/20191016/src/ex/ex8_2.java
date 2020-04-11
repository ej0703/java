package ex;

import java.util.Scanner;

public class ex8_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int[] aa = new int[4];
		int sum=0;

		System.out.print(" 초기값 ==> ");
		pr(aa); //초기값 출력
		System.out.println();
		sum = forInput(aa, scan);
		System.out.println("--------배열의 입력 후 처리 내용--------");
		pr(aa); //입력한 배열값 출력
		System.out.printf("\n 합계 ==> %d\n", sum); //합 출력
		scan.close();
	}
	
	public static void pr (int[] a) { //배열 전체의 값 출력
		for(int i=0;i<a.length;i++) {
			System.out.print("["+i+"]="+a[i]+" ");
		}
	}
	public static int forInput (int[] a, Scanner scan) {
		int sum=0;
		
		for(int i=0;i<a.length;i++) { 
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			a[i] = scan.nextInt(); //배열에 입력받기
			sum += a[i]; //입력받은 값 합에 더하기
		}
		return sum;
	}
}
