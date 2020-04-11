package ex;

import java.io.*;

public class BufferedWriterEx {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("c:/tmp/hello.txt");
			bw = new BufferedWriter(fw);

			bw.write("BufferedWriter �׽�Ʈ�Դϴ�.");
			bw.newLine();
			bw.write("�ȳ��ϼ��� "+System.getProperty("line.separator"));
			bw.write("�ݰ����ϴ�");
			bw.flush();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(fw!=null) {
					fw.close();
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				if(bw!=null) {
					bw.close();
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
