package ex;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SawonProcess {

	public static void main(String[] args) {
		// 파일에서 읽어오기 sawon.txt
		String fileName = "src/ex/sawon.txt";
		String fileNameOutput = "src/ex/sawon_output.txt";
		
		try {
			//1.읽기
			FileReader fr = new FileReader(fileName);
			//2.버퍼에서 읽기
			BufferedReader br = new BufferedReader(fr);
			//3.출력하기
			FileWriter fw = new FileWriter(fileNameOutput);
			PrintWriter pw = new PrintWriter(fw);
			String line = "";

			pw.println("          2019년 신입사원 평가 점수                  ");
			pw.println("---------------------------------------");
			
			Date today = new Date();
			SimpleDateFormat d = new SimpleDateFormat("yyyy년 MM월 dd일");
			pw.println("평가일 : "+d.format(today));
			pw.println("이름 java jquery  html5  css3  total  avg");
			pw.println("----------------------------------------");
			
			while(true) {
				line = br.readLine(); //파일의 줄 단위로 읽어옴
			
				if(line == null) break; //비어있는 줄 나오면 무한루프 탈출
				
				String str[] = line.split(","); //,단위로 나누어서 String 배열에 저장
				
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
			br.close();
			fr.close();
			pw.flush();
			fw.close();
			pw.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
