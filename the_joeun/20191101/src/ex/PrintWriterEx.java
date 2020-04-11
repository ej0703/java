package ex;

import java.io.*;

//PrintWriter파일에 문자 기록하기
public class PrintWriterEx {

	public static void main(String[] args) {
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("src/ex/data.sav");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);
			pw.println("안녕하세요.");
			pw.println("어제 즐거우셨나요?");
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
