import java.io.InputStreamReader;

//Ű����� �Է¹޾� Ű���� ���ڷ� ��ȭ
public class InputExample {

	public static void main(String[] args) {
		//�Է���ġ ����
		//�ڹٿ����� �������ġ�� ��Ʈ������ ó��
		//�ֻ��� �Է���ġ(�߻�Ŭ����) InputStream/OutputStream - 1����Ʈ
		//�ֻ��� �Է���ġ(�߻�Ŭ����) Reader/Writer -- 2����Ʈ(����)
		
		//1����Ʈ�� 2����Ʈ�� ��ȯ
		InputStreamReader rs = new InputStreamReader(System.in);
		try {
			while(true) {
				int a = rs.read();
				if(a == -1) //EoF ������ �� ^Z
					break;
				System.out.println((char)a);
			}
		} catch(Exception e) {
			System.out.println("�Է� ���� �߻�");
		}
	}

}
