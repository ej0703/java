package ppt;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("c:\\windows\\system.ini"); //파일과 연결된 바이트 스트림을 생성
			
			int c;
			while((c=in.read())!=-1) { //-1을 만나면 더 이상 입력이 없음
				System.out.print((char)c); //바이트 c를 문자로 변환하여 화면에 출력
			}
			in.close(); //스트림을 닫는다. 더 이상 스트림으로부터 읽을 수 없다.
		}catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
