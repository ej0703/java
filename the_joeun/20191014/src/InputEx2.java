import java.io.IOException;

//���� �ϳ� �Է¹ޱ�
// char ch = (char)System.in.read();
public class InputEx2 {

	public static void main(String[] args) throws IOException {
		int num1, num2;
		
		System.out.printf("����1= ");
		num1 = System.in.read()-48;
		//System.in.read();
		//System.in.read();
		System.in.skip(2); //10, 13(enter��) ó��
		
		System.out.printf("����2= ");
		num2 = System.in.read()-'0';
		
		System.out.print("���� "+(num1>num2 ? num1: num2)+"�� �� ũ�׿�.");
	}

}
