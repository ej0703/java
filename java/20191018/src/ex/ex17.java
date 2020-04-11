package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if(args.length == 0) { //args.length : 과목 수
			System.out.println("run : java Exam17 subject1 subject2... ");
			System.exit(0);
		}
		System.out.print("your name : ");
		String name = br.readLine();

		String[] subject = new String[args.length];

		for(int i=0;i<args.length;i++) {//과목명을 실제 과목명 저장하는 subject[]에 저장
			subject[i]=args[i];
		}

		//java jsp 총점
		int jumsu[] = new int[subject.length+1]; //과목의 갯수에 마지막은 총점의 공간

		for(int i=0;i<jumsu.length-1;i++) {
			System.out.print(subject[i]+"과목 점수 = ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length-1] += jumsu[i]; //총점 위치에 계속 합계 누적 == 누적합
		}
		float avg = jumsu[jumsu.length-1]/(float)subject.length; //평균

		char grade=0;
		switch(Math.round(avg)/10) {
		case 10:
		case 9: grade='A';break;
		case 8: grade='B';break;
		case 7: grade='C';break;
		case 6: grade='D';break;
		default : grade='F';break;
		}

		System.out.println();
		System.out.println("################성 적 표################");
		System.out.print("이름\t");
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}

		System.out.println(" 총점\t평균\t학점");
		System.out.print(name+"\t");
		for(int i=0;i<subject.length+1;i++) { //subject는 과목의 갯수 2개, jumsu=과목수-1
			System.out.print(" "+jumsu[i]+"\t");
		}
		System.out.println(avg+"\t"+" "+grade);
	}

}
