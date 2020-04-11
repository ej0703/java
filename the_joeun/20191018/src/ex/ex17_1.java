package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex17_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] subject=null , name , grade;
		int[] jumsu;
		float[] avg;
		int n=0, num=0;

		if(args.length == 0) { //args.length : ���� ��
			System.out.println("run : java Exam17 subject1 subject2... ");
			System.exit(0);
		}

		System.out.print("�л� ���? ");
		num = Integer.parseInt(br.readLine());
		name = new String[num];
		grade = new String[num];
		jumsu = new int[num];
		avg = new float[num];

		while(n<num) {
			System.out.print("your name : ");
			name[n] = br.readLine();

			subject = new String[args.length];

			for(int i=0;i<args.length;i++) {//������� ���� ����� �����ϴ� subject[]�� ����
				subject[i]=args[i];
			}

			//java jsp ����
			jumsu = new int[subject.length+1]; //������ ������ �������� ������ ����

			for(int i=0;i<jumsu.length-1;i++) {
				System.out.print(subject[i]+"���� ���� = ");
				jumsu[i] = Integer.parseInt(br.readLine());
				jumsu[jumsu.length-1] += jumsu[i]; //���� ��ġ�� ��� �հ� ���� == ������
			}
			avg[n] = jumsu[jumsu.length-1]/(float)subject.length; //���

			int avg1 = Math.round(avg[n]);
			//			grade[n]="";
			switch(avg1/10) {
			case 10:
			case 9: grade[n]="A";break;
			case 8: grade[n]="B";break;
			case 7: grade[n]="C";break;
			case 6: grade[n]="D";break;
			default : grade[n]="F";break;
			}
			n++;
		}

		System.out.println();
		System.out.println("################�� �� ǥ################");
		System.out.print("�̸�\t");
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}		
		System.out.println(" ����\t���\t����");
		
		for(int j=0;j<n;j++) {
			System.out.print(name[j]+"\t");
			for(int i=0;i<subject.length+1;i++) { //subject�� ������ ���� 2��, jumsu=�����-1
				System.out.print(" "+jumsu[j]+"\t");
			}
			System.out.println(avg[j]+"\t"+" "+grade[j]);
		}
	}

}
