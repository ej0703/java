import java.io.IOException;

public class SwitchEx {

	public static void main(String[] args) throws IOException {
		int ch, i;
		
		System.out.print("�� ���� �Է� : ");
		ch = System.in.read();
		System.in.skip(2);
		System.out.print("�� �ڸ� ���� �Է� : ");
		i = System.in.read()-48;
		
		System.out.println("�� ���� �Է� : "+ (char)ch);
		System.out.printf("�� �ڸ� ���� �Է� : %d", i);
	}

}
