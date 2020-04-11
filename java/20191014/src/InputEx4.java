import java.io.*;

//숫자열 (두자리이상) 입력받기
/* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * String jumsu = br.readLine();
 * int kor = Integer.parseInt(jumsu); //스트링을 객체형정수로 변환 후 다시 기본형 정수로 변환
 */
public class InputEx4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat;
		double hap;
		
		System.out.print("국어 = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 = ");
		mat = Integer.parseInt(br.readLine());
		
		hap = kor + eng + mat;
		
		System.out.printf("총점 = %.1f", hap);
	}

}
