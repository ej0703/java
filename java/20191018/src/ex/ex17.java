package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if(args.length == 0) { //args.length : ���� ��
			System.out.println("run : java Exam17 subject1 subject2... ");
			System.exit(0);
		}
		System.out.print("your name : ");
		String name = br.readLine();

		String[] subject = new String[args.length];

		for(int i=0;i<args.length;i++) {//������� ���� ����� �����ϴ� subject[]�� ����
			subject[i]=args[i];
		}

		//java jsp ����
		int jumsu[] = new int[subject.length+1]; //������ ������ �������� ������ ����

		for(int i=0;i<jumsu.length-1;i++) {
			System.out.print(subject[i]+"���� ���� = ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length-1] += jumsu[i]; //���� ��ġ�� ��� �հ� ���� == ������
		}
		float avg = jumsu[jumsu.length-1]/(float)subject.length; //���

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
		System.out.println("################�� �� ǥ################");
		System.out.print("�̸�\t");
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}

		System.out.println(" ����\t���\t����");
		System.out.print(name+"\t");
		for(int i=0;i<subject.length+1;i++) { //subject�� ������ ���� 2��, jumsu=�����-1
			System.out.print(" "+jumsu[i]+"\t");
		}
		System.out.println(avg+"\t"+" "+grade);
	}

}
