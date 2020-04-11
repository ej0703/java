package ex;

import java.io.*;

public class FileCoptEx {

	public static void main(String[] args) {
		System.out.println("���� ���� ����");
		long start = System.currentTimeMillis();
		
		FileInputStream src = null;
		FileOutputStream dest = null;
		try {
			src = new FileInputStream("c:\\tmp\\src.zip");
			dest = new FileOutputStream("c:\\tmp\\dest.zip");
			//�ӽ�����ҿ� ����� data�� ��ü������ ������ ����
			int length=0;
			//�ӽ�����ҷ� ����� byte[]�迭 ����
			byte[] buffer = new byte[1024*8];
			//inputstream�� ���ؼ� �о���� data�� �ӽ�����ҿ� �װ� ����� data�� ������ length�� �����Ѵ�.
			while((length=src.read(buffer))!=-1) {
				//outputstream�� ���ؼ� �ӽ�����ҿ� �׿��ִ� data�� length��ŭ ���Ͽ� ����Ѵ�.
				dest.write(buffer,0,length);
			}
		} catch(FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				if(dest!=null) dest.close();
				if(src!=null) src.close();
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
		
		long end = System.currentTimeMillis();
		long copyTime = (end-start)/1000;
		System.out.println("�ɸ��ð� : "+copyTime+"��");
	}

}
