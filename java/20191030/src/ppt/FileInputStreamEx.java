package ppt;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("c:\\windows\\system.ini"); //���ϰ� ����� ����Ʈ ��Ʈ���� ����
			
			int c;
			while((c=in.read())!=-1) { //-1�� ������ �� �̻� �Է��� ����
				System.out.print((char)c); //����Ʈ c�� ���ڷ� ��ȯ�Ͽ� ȭ�鿡 ���
			}
			in.close(); //��Ʈ���� �ݴ´�. �� �̻� ��Ʈ�����κ��� ���� �� ����.
		}catch (IOException e) {
			System.out.println("����� ����");
		}

	}

}
