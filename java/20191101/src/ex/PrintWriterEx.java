package ex;

import java.io.*;

//PrintWriter���Ͽ� ���� ����ϱ�
public class PrintWriterEx {

	public static void main(String[] args) {
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("src/ex/data.sav");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);
			pw.println("�ȳ��ϼ���.");
			pw.println("���� ��ſ�̳���?");
			pw.println(100.0);
			pw.println(new Boolean(true));
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(bos != null) bos.close();
				if(pw != null) pw.close();
			} catch (IOException e) {
				e.getStackTrace();
			}
		}
	}

}
