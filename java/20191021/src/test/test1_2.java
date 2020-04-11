package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] end = {31,28,31,30,31,30,31,31,30,31,30,31}; //날짜수
		int y, m, w, day;

		do {
			System.out.print("년도를 입력하세요: ");
			y = Integer.parseInt(br.readLine());
		} while(y<1);
		
		do {
			System.out.print("월을 입력하세요  : ");
			m = Integer.parseInt(br.readLine());
		} while(m<0 || m>12);
		
		System.out.println("======================");
		
		day = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		if((y%4 == 0 && y%100 != 0)||(y%400==0)) { //윤년
			end[1] = 29;
		}
		
		for(int i=0;i<m-1;i++) {
			day += end[i];
		}
		day++;
		w = day%7;
		
		//달력 그리기
		System.out.printf(" <    %4d년 %2d월     >\n",y,m);
		System.out.println(" 일  월  화  수  목  금  토");

		for(int i=0;i<w;i++) { //공백 출력
			System.out.printf("   ");
		}
		for(int j=1;j<=end[m-1];j++) { //날짜 출력
			System.out.printf("%3d",j);
			w++;
			
			if(w%7 == 0)
				System.out.println();
		}
		System.out.println("\n======================");
		
	}
}