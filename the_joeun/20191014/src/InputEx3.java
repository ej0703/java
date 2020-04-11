import java.io.*;
/*문자열 입력받기
 * InputStreamReader is = new InputStreamReader(System.in);
 * BufferedReader br = new BufferedReader(is);
 * name = br.readLine();
 */
public class InputEx3 {

	public static void main(String[] args) throws IOException {
		String name;
		String nai;
		String addr;
		String tel;
		//1바이트->2바이트로 변환
		InputStreamReader is = new InputStreamReader(System.in); //1차 스트림
		
		//filterStream 사용하기
		BufferedReader br = new BufferedReader(is); //2차 스트림
		
		System.out.print("이름 = ");
		name = br.readLine(); //한줄 전체(\n)를 읽어오기
		System.out.print("나이 = ");
		nai = br.readLine(); //한줄 전체(\n)를 읽어오기
		System.out.print("주소 = ");
		addr = br.readLine(); //한줄 전체(\n)를 읽어오기
		System.out.print("전화번호 = ");
		tel = br.readLine(); //한줄 전체(\n)를 읽어오기
		
		//결과 출력
		System.out.println(">>>>>> 결과출력 >>>>>>");
		System.out.println(name +"씨");
		System.out.println(nai +"세 네요.");
		System.out.println(addr +"에 사시는군요.");
		System.out.println(tel +"로 전화드리겠습니다.");
	}

}
