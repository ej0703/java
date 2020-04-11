package ex;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SawonProcess3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileNameOutput;
		String[] str = new String[5]; //�̸� + ���� 4�� ������ �迭

		try {
			System.out.print("������ ���ϸ��� �Է��ϼ��� >> ");
			fileNameOutput = scan.next();
			FileWriter fw = new FileWriter("src/ex/"+fileNameOutput); //��� ���� + �����̸�
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("          2019�� ���Ի�� �� ����                  ");
			pw.println("---------------------------------------");

			Date today = new Date();
			SimpleDateFormat d = new SimpleDateFormat("yyyy�� MM�� dd��");
			pw.println("���� : "+d.format(today));
			pw.println("�̸� java jquery  html5  css3  total  avg");
			pw.println("----------------------------------------");			
			
			while(true) {
				System.out.print("����(0) ���� : ");
				str[0] = scan.next();
				if(str[0].equals("0")) break; //0 �Է½� ���ѷ��� Ż��
				System.out.print("java : ");
				str[1] = scan.next();
				System.out.print("jquery : ");
				str[2] = scan.next();
				System.out.print("html5 : ");
				str[3] = scan.next();
				System.out.print("css3 : ");
				str[4] = scan.next();
				
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
			scan.close();
			pw.flush();
			fw.close();
			pw.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
