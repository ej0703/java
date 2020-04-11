package ex;

import java.io.*;

public class BufferedWriterEx2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;

		try {
			fis = new FileInputStream("c:\\tmp\\hello.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			fw = new FileWriter("src/ex/bfEx2.txt");

			//�� ���ο� �о���� ���ڿ��� ������ ����
			String str = null;

			//readLine() ���๮�ڸ� ������ ���๮�� ���������� ���ڿ��� ��ȯ�ϰ� ��Ʈ���� ���� �����ϸ� null�� ��ȯ
			while((str=br.readLine())!=null) { //�ٴ����� �о����
				//����ϱ�
				System.out.println(str);
				fw.write(str);
			}
			fw.close();
		}catch (Exception e) {
			e.getStackTrace();
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				if(br!=null) {
					br.close();
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
