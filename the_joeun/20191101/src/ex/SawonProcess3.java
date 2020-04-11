package ex;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SawonProcess3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileNameOutput;
		String[] str = new String[5]; //이름 + 점수 4개 저장할 배열

		try {
			System.out.print("생성할 파일명을 입력하세요 >> ");
			fileNameOutput = scan.next();
			FileWriter fw = new FileWriter("src/ex/"+fileNameOutput); //경로 설정 + 파일이름
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("          2019년 신입사원 평가 점수                  ");
			pw.println("---------------------------------------");

			Date today = new Date();
			SimpleDateFormat d = new SimpleDateFormat("yyyy년 MM월 dd일");
			pw.println("평가일 : "+d.format(today));
			pw.println("이름 java jquery  html5  css3  total  avg");
			pw.println("----------------------------------------");			
			
			while(true) {
				System.out.print("성명(0) 종료 : ");
				str[0] = scan.next();
				if(str[0].equals("0")) break; //0 입력시 무한루프 탈출
				System.out.print("java : ");
				str[1] = scan.next();
				System.out.print("jquery : ");
				str[2] = scan.next();
				System.out.print("html5 : ");
				str[3] = scan.next();
				System.out.print("css3 : ");
				str[4] = scan.next();
				
				int[] grade = null;
				grade = new int[str.length-1]; //이름은 String 점수는 int이므로 점수만 저장하기 위해 str보다 크기가 하나 작다.

				int sum=0;
				double avg=0;

				for(int i=0;i<grade.length;i++) {
					grade[i] = Integer.parseInt(str[i+1]); //전체 합, 평균 저장하기 위해 int형 배열에 저장
					sum += grade[i];
				}
				for(int i=0;i<str.length;i++) {
					pw.print("  "+str[i]+"  ");					
				}
				pw.print(" "+sum+" ");
				avg = sum/(double)grade.length;
				pw.println(" "+avg+" ");
			}
			scan.close();
			pw.flush();
			fw.close();
			pw.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
