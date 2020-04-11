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

			//한 라인에 읽어들은 문자열을 저장할 변수
			String str = null;

			//readLine() 개행문자를 만나면 개행문자 이전까지의 문자열을 반환하고 스트림의 끝에 도달하면 null을 반환
			while((str=br.readLine())!=null) { //줄단위로 읽어오기
				//출력하기
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
