package ex;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SawonProcess2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileNameOutput = "src/ex/sawon_output2.txt";
		String line[][] = new String[3][5];
		
		try {
			for(int i=0;i<3;i++) {
				for(int j=0;j<5;j++) {
					line[i][j] = scan.next();
				}
			}
			
			//3.출력하기
			FileWriter fw = new FileWriter(fileNameOutput);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("          2019년 신입사원 평가 점수                  ");
			pw.println("---------------------------------------");
			
			Date today = new Date();
			SimpleDateFormat d = new SimpleDateFormat("yyyy년 MM월 dd일");
			pw.println("평가일 : "+d.format(today));
			pw.println("이름 java jquery  html5  css3  total  avg");
			pw.println("----------------------------------------");
			
			int n=0;
			while(n<3) {
				int[] grade = null;
				grade = new int[line[n].length-1];
				
				int sum=0;
				double avg=0;
				
				for(int i=0;i<grade.length;i++) {
					grade[i] = Integer.parseInt(line[n][i+1]);
					sum += grade[i];
				}
				for(int i=0;i<line[n].length;i++) {
					pw.print("  "+line[n][i]+"  ");					
				}
				pw.print(" "+sum+" ");
				avg = sum/(double)grade.length;
				pw.println(" "+avg+" ");
				n++;
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
