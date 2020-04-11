import java.io.IOException;

//문자 하나 입력받기
// char ch = (char)System.in.read();
public class InputEx2 {

	public static void main(String[] args) throws IOException {
		int num1, num2;
		
		System.out.printf("숫자1= ");
		num1 = System.in.read()-48;
		//System.in.read();
		//System.in.read();
		System.in.skip(2); //10, 13(enter값) 처리
		
		System.out.printf("숫자2= ");
		num2 = System.in.read()-'0';
		
		System.out.print("숫자 "+(num1>num2 ? num1: num2)+"가 더 크네요.");
	}

}
