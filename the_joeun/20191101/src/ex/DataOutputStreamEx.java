package ex;

import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		//DataOutputStream�� �⺻�ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ����� �� �ִ�.
		//DataOutputStream�� 1����Ʈ���� �ƴϱ� ������ �ٸ� ��Ʈ���� �̿��ؼ� Ư�� Device�� ���� �� �� �ִ�.
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		try {
			//DataOutputStream�� ����� FileOutputStream
			//��ü����
			fos = new FileOutputStream("src/ex/data.sav");
			
			//�⺻�ڷ����� Ÿ���� ������ä ����� �� �ִ� DataOutputStream��ü ����
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "JAVA���α׷�";
			//DataOutputStream�� �⺻�ڷ������� write�޼ҵ尡 ����
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
				if(dos!=null) dos.close();
			} catch(IOException e) {
				e.getMessage();
			}
		}//try
	}//main
}//class

/* DataInputStream : ����Ʈ ��Ʈ�����κ��� �ڹٱ⺻�ڷ��� Data�� �д´�.
 * DataOuputStream : �⺻�ڷ����� ����Ʈ��Ʈ������ ���
 * - Ư�� ������ Ÿ�԰� ������ ������ ä �����͸� �а� �� �� �ִ� ��Ʈ���̴�.
 * - Ư�� ������ Ÿ�԰� ���˿� �°� �а� �� �� �ִ� readBoolean(), writeBoolean(), readInt(), readUTF(), writeUTF(String s)�� �޼ҵ� �����Ѵ�.
 * - �ֿ� ������
 *   DataInputStream(InputStream stream)
 *   DataOutputStream(OutputStream stream)
 * - ��Ʈ���� Ư¡
 * . FIFO�����̴�. (ť) : ���� �Էµ� ���� ���� ��µǴ� ������ ���� �ٲ��� ����
 * . �ڹٿ����� ������� ���ÿ� �̷������ ����. �б�/�����Ϸ��� �б�/���⽺Ʈ���� �ϳ��� ���� ����ؾ� �Ѵ�.
 * . ��Ʈ���� ����(���)�� �� �ִ�.--> ��Ʈ���� �Էµ� �����Ͱ� ó���Ǳ� �������� ��Ʈ���� ���Ǵ� ������� �������¿� ������.
 *   ��Ʈ��ũ�������� �����Ͱ� ��� ���۵Ǳ� ������ ��Ʈ��ũ ������� �������°� �ȴ�.
 * - ��Ʈ�� �з�
 *   <��Ʈ���� �뵵�� ����>
 *   1�� ��Ʈ�� : ��ġ(Device)�� ���������� ����Ǵ� ��Ʈ�� == node stream == �⺻ stream
 *   2�� ��Ʈ�� : ��ġ(Device)�� ���������� ������� �ʴ� ��Ʈ��
 *   		   1�� ��Ʈ���� ������ ���ؼ��� ��ġ�� ���� �� �� �ִ�.(filter����� �ִ�.)
 *   <��Ʈ���� ������ ���� ���⿡ ����>
 *   �Է� ��Ʈ�� : ��ġ(Device)�κ��� �����͸� �о���� ��Ʈ��
 *   ��� ��Ʈ�� : ��ġ(Device)�� �����͸� ����ϴ� ��Ʈ��
 *   <������ ���� ������ ����>
 *   ����Ʈ ��Ʈ�� : �� byte ������ �а� �� �� �ִ� ��Ʈ��
 *   ���� ��Ʈ�� : �� ����(2byte)������ �а� �� �� �ִ� ��Ʈ��
*/