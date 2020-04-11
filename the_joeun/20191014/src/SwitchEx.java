import java.io.IOException;

public class SwitchEx {

	public static void main(String[] args) throws IOException {
		int ch, i;
		
		System.out.print("한 문자 입력 : ");
		ch = System.in.read();
		System.in.skip(2);
		System.out.print("한 자리 정수 입력 : ");
		i = System.in.read()-48;
		
		System.out.println("한 문자 입력 : "+ (char)ch);
		System.out.printf("한 자리 정수 입력 : %d", i);
	}

}
