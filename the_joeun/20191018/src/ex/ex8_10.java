package ex;

import java.util.Scanner;

public class ex8_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, num=1;
		
		System.out.print("행 개수를 입력 : ");
		i = scan.nextInt();
		System.out.print("열 개수를 입력 : ");
		j = scan.nextInt();
		
		int[][] arr = new int[i][j];
		
		for(int k=0;k<arr.length;k++) {
			for(int l=0;l<arr[k].length;l++) {
				arr[k][l] = num;
				num++;
			}
		}
		
		System.out.printf("arr[0][0]부터 arr[%d][%d]까지 출력\n", i,j);
		for(int k=0;k<arr.length;k++) {
			for(int l=0;l<arr[k].length;l++) {
				System.out.printf("%3d ", arr[k][l]);
			}
			System.out.println();
		}
		scan.close();
	}

}
