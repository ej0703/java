import java.io.IOException;

//���� �ϳ� �Է¹ޱ�
// char ch = (char)System.in.read();
public class InputEx {

	public static void main(String[] args) throws IOException {
		System.out.printf("���� �Է� : ");
		int i = System.in.read(); //�ݵ�� io�� checked Exception ó��
		System.out.println("ACKII Value = "+i);
	}

}
