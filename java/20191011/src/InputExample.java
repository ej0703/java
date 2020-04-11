import java.io.InputStreamReader;

//키보드로 입력받아 키값을 문자로 변화
public class InputExample {

	public static void main(String[] args) {
		//입력장치 선언
		//자바에서는 입출력장치를 스트림으로 처리
		//최상위 입력장치(추상클래스) InputStream/OutputStream - 1바이트
		//최상위 입력장치(추상클래스) Reader/Writer -- 2바이트(문자)
		
		//1바이트를 2바이트로 변환
		InputStreamReader rs = new InputStreamReader(System.in);
		try {
			while(true) {
				int a = rs.read();
				if(a == -1) //EoF 파일의 끝 ^Z
					break;
				System.out.println((char)a);
			}
		} catch(Exception e) {
			System.out.println("입력 오류 발생");
		}
	}

}
