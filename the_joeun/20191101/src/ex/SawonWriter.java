package ex;

import java.io.*;

public class SawonWriter {

	public static void main(String[] args) {
		//파일에서 읽어오기 sawon.txt
		String filename = "src/ex/sawon.txt";
		try {
			//1.fileWriter (파일명, 추가X false);
			FileWriter fw = new FileWriter(filename,true);
			//2.PrintWriter 생성시 file
			PrintWriter pw = new PrintWriter(fw);
			//2번에 추가
			pw.println("e,90,90,60,95");
			pw.println("f,90,90,60,95");
			pw.println("g,90,90,60,95");
			pw.println("h,90,90,60,95");
			//자원 반환
			fw.close();
			pw.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
