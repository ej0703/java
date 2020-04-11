package ex;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a;
		int n, count=0;
		int sum=0, entireN=0, entireSum=0;
		double avg=0;
			
		while(true) {
			//배열의 크기 정하기
			if(count != 0) {
				System.out.print("\n\n");
			}
			System.out.print("배열 개수(0 입력시 종료) : ");
			n= scan.nextInt(); //원하는 배열의 개수 scanner로 입력받기
			if(n==0) break; //탈출 조건 : 0 입력
			a = new int[n]; //입력받은 수만큼을 배열의 크기로 생성
			entireN += n;
			count++;
			sum=0;
						
			//배열의 값 입력받고 합, 평균 구하기
			System.out.printf("[%d번째 배열의 값 입력] ", count);
			for(int i=0;i<a.length;i++) { //배열의 길이만큼 반복
				a[i] = scan.nextInt(); //배열에 값 입력받기
				sum += a[i];
				entireSum += a[i];
			}
			avg = sum/(double)a.length;

			//배열 값 그대로 출력
			System.out.println(">>>배열에 값 그대로 출력<<<");
			for(int i : a) { //향상된 for문(for each문)
				System.out.print(i+" ");
			}
			//배열에 값 거꾸로 출력. 합, 평균 출력
			System.out.println("\n>>>배열에 값 거꾸로 출력<<<");
			for(int i=(a.length-1);i>=0;i--) {
				System.out.print(a[i]+" ");
			}
			System.out.println("\n>>>합, 평균 출력");
			System.out.printf("합 = %d\n평균 = %.2f", sum, avg);
		}
		System.out.println("프로그램 종료");
		scan.close();		
		
		//전체 합, 평균 출력
		avg = entireSum / (double)entireN;
		System.out.printf("\n>>>배열 %d개의 총 %d개 값들의 합, 평균 출력\n",count, entireN);
		System.out.printf("전체 합 = %d\n전체평균 = %.2f\n", entireSum, avg);
	}
	
}
