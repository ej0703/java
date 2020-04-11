package ex;

import java.io.*;;

public class DataInputStreamEx {

	public static void main(String[] args) {
		DataInputStream dis =null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/ex/data.sav"); //�̹� �����ؾ� ��
			dis = new DataInputStream(fis);
			
			//DataInputStream�� �⺻�ڷ����� ������ä�� ����� ���� �о���� �� �ִ� read�޼ҵ尡 �����Ѵ�.
			//�о���� ���� �ݵ�� ����� ������ȣ �о�;� �Ѵ�.
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			
			System.out.println("i �� = "+i);
			System.out.println("d �� = "+d);
			System.out.println("s �� = "+s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
				if(dis!=null) dis.close();
			} catch(IOException e) {
				e.getMessage();
			}
		}//try
	}
}
