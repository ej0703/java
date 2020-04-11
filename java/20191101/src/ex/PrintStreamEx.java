package ex;

import java.io.*;

/* - PrintStream
 *  .모든 자료형을 출력할 수 있는 print(), println()메소드가 오버로딩 되어 있다.
 *  .프로그램이 시작되면 장치와 연결된 출력 스트림인 System.in, System.out,System.err 객체가 PrintStream객체이다.
 *  .다른 스트림과는 다르게 플러쉬기능을 자동으로 처리할 수 있는 생성자를 가지고 있다.
 *       ★모든 메소드는 예외처리를 하지 않는다.
 * - PrintWriter
 *  .PrintWriter는 다른 스트림과 다르게 바이트 출력 스트림과 문자출력 스트림을 가지고 객체를 생성할 수 있는 클래스이다.
 *  .자동 플러쉬(auto flush)기능을 갖고 있다.
 *       ★PrintWriter 클래스의 생성자는 FileNotFoundException예외를 발생하기 때문에 반드시 예외처리를 해야한다.
 */
//PrintStream 파일에 문자 기록하기
public class PrintStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream("src/ex/data.sav");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos, true); //자동플러쉬
			ps.println("홍길동 : ");
			ps.println(2019);
			ps.println(true);
			ps.println('a');
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
				if(bos!=null) bos.close();
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}
}
