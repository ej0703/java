package ex;

import java.io.*;

public class ex3 {

	public static void main(String[] args) throws IOException {
		//filterStream
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String strData;
		
		System.out.printf("������ ���� �Է� ");
		n= Integer.parseInt(br.readLine());
		
		//����ó��
		strData=(n<0) ? "����": ((n==0) ? "��" : "���"); //��ø if�� ����
		//������
		System.out.println(n+"==>"+strData);
	}

}
