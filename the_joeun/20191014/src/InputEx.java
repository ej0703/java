import java.io.IOException;

//문자 하나 입력받기
// char ch = (char)System.in.read();
public class InputEx {

	public static void main(String[] args) throws IOException {
		System.out.printf("문자 입력 : ");
		int i = System.in.read(); //반드시 io는 checked Exception 처리
		System.out.println("ACKII Value = "+i);
	}

}
