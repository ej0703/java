package ex;

import java.io.*;

public class SawonWriter {

	public static void main(String[] args) {
		//���Ͽ��� �о���� sawon.txt
		String filename = "src/ex/sawon.txt";
		try {
			//1.fileWriter (���ϸ�, �߰�X false);
			FileWriter fw = new FileWriter(filename,true);
			//2.PrintWriter ������ file
			PrintWriter pw = new PrintWriter(fw);
			//2���� �߰�
			pw.println("e,90,90,60,95");
			pw.println("f,90,90,60,95");
			pw.println("g,90,90,60,95");
			pw.println("h,90,90,60,95");
			//�ڿ� ��ȯ
			fw.close();
			pw.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
