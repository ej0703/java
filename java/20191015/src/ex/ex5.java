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
			System.out.print("이름 입력 : ");
			name = br.readLine();
			if(name.equals("0")) break; //무한루프 탈출 조건
			System.out.print("국어 점수 : ");
			kor = Integer.parseInt(br.readLine());
			System.out.print("영어 점수 : ");
			eng = Integer.parseInt(br.readLine());
			System.out.print("수학 점수 : ");
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
			
			//String에 반복적인 학생 정보들을 덧붙여 하나의 큰 result String을 만듬.
			//String.valueOf(n)으로 n을 출력해줌.
			result +="[" +String.valueOf(n)+"번 학생]"+"\n학생이름: "+name+"\n국어점수: "+kor+"\n영어점수: "+eng+"\n수학점수: "+mat+"\n총    점: "+sum+"\n평    균: "+avg+"\n등    급: "+grade+"\n\n";
			/*
			if(n==1) {
				stu1 = n+"번 학생"+"\n학생이름: "+name+"\n국어점수: "+kor+"\n영어점수: "+eng+"\n수학점수: "+mat+"\n총   점: "+sum+"\n평   균: "+avg+"\n등   급: "+grade;
			} else if(n==2) {
				stu2 = n+"번 학생"+"\n학생이름: "+name+"\n국어점수: "+kor+"\n영어점수: "+eng+"\n수학점수: "+mat+"\n총   점: "+sum+"\n평   균: "+avg+"\n등   급: "+grade;
			} else if(n==3) {
				stu3 = n+"번 학생"+"\n학생이름: "+name+"\n국어점수: "+kor+"\n영어점수: "+eng+"\n수학점수: "+mat+"\n총   점: "+sum+"\n평   균: "+avg+"\n등   급: "+grade;
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
