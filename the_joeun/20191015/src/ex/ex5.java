package ex;

import java.io.*;

public class ex5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, mat, sum;
		double avg;
		String name, grade;
		//String stu1 = null, stu2 = null, stu3 = null;
		String result= null;
		int n=1;

		while(true) {
			System.out.print("�̸� �Է� : ");
			name = br.readLine();
			if(name.equals("0")) break; //���ѷ��� Ż�� ����
			System.out.print("���� ���� : ");
			kor = Integer.parseInt(br.readLine());
			System.out.print("���� ���� : ");
			eng = Integer.parseInt(br.readLine());
			System.out.print("���� ���� : ");
			mat = Integer.parseInt(br.readLine());

			sum = kor + eng +mat;
			avg = sum/3.0;
			
			if(avg<=100 && avg>90) {
				grade="A";
			} else if (avg>80) {
				grade="B";
			} else if (avg>70) {
				grade="C";
			} else if (avg>60) {
				grade="D";
			} else {
				grade="F";
			}
			
			//String�� �ݺ����� �л� �������� ���ٿ� �ϳ��� ū result String�� ����.
			//String.valueOf(n)���� n�� �������.
			result +="[" +String.valueOf(n)+"�� �л�]"+"\n�л��̸�: "+name+"\n��������: "+kor+"\n��������: "+eng+"\n��������: "+mat+"\n��    ��: "+sum+"\n��    ��: "+avg+"\n��    ��: "+grade+"\n\n";
			/*
			if(n==1) {
				stu1 = n+"�� �л�"+"\n�л��̸�: "+name+"\n��������: "+kor+"\n��������: "+eng+"\n��������: "+mat+"\n��   ��: "+sum+"\n��   ��: "+avg+"\n��   ��: "+grade;
			} else if(n==2) {
				stu2 = n+"�� �л�"+"\n�л��̸�: "+name+"\n��������: "+kor+"\n��������: "+eng+"\n��������: "+mat+"\n��   ��: "+sum+"\n��   ��: "+avg+"\n��   ��: "+grade;
			} else if(n==3) {
				stu3 = n+"�� �л�"+"\n�л��̸�: "+name+"\n��������: "+kor+"\n��������: "+eng+"\n��������: "+mat+"\n��   ��: "+sum+"\n��   ��: "+avg+"\n��   ��: "+grade;
			}
			*/		
			n++;
			sum=0;
			avg=0;
		}
		
		System.out.println();
		System.out.println(result);
		/*System.out.println();
		System.out.println(stu2);
		System.out.println();
		System.out.println(stu3);*/
	}

}
