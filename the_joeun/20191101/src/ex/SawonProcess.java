package ex;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SawonProcess {

	public static void main(String[] args) {
		// ���Ͽ��� �о���� sawon.txt
		String fileName = "src/ex/sawon.txt";
		String fileNameOutput = "src/ex/sawon_output.txt";
		
		try {
			//1.�б�
			FileReader fr = new FileReader(fileName);
			//2.���ۿ��� �б�
			BufferedReader br = new BufferedReader(fr);
			//3.����ϱ�
			FileWriter fw = new FileWriter(fileNameOutput);
			PrintWriter pw = new PrintWriter(fw);
			String line = "";

			pw.println("          2019�� ���Ի�� �� ����                  ");
			pw.println("---------------------------------------");
			
			Date today = new Date();
			SimpleDateFormat d = new SimpleDateFormat("yyyy�� MM�� dd��");
			pw.println("���� : "+d.format(today));
			pw.println("�̸� java jquery  html5  css3  total  avg");
			pw.println("----------------------------------------");
			
			while(true) {
				line = br.readLine(); //������ �� ������ �о��
			
				if(line == null) break; //����ִ� �� ������ ���ѷ��� Ż��
				
				String str[] = line.split(","); //,������ ����� String �迭�� ����
				
				int[] grade = null;
				grade = new int[str.length-1]; //�̸��� String ������ int�̹Ƿ� ������ �����ϱ� ���� str���� ũ�Ⱑ �ϳ� �۴�.
				
				int sum=0;
				double avg=0;
				
				for(int i=0;i<grade.length;i++) {
					grade[i] = Integer.parseInt(str[i+1]); //��ü ��, ��� �����ϱ� ���� int�� �迭�� ����
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
