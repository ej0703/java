package ex;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) {
		// URL�� ���� ������ ������ �ִ� Ŭ����
		BufferedReader br = null;
		try {
			URL url = new URL("http://www.daum.net/index.html");
			
			//url ��ü�κ��� ��������, ȣ��Ʈ��, ��Ʈ��ȣ, �ڿ��� ���, ������Ʈ������ ���� �� �ִ�.
			System.out.println("�������� : "+url.getProtocol());
			System.out.println("ȣ��Ʈ    : "+url.getHost());
			System.out.println("��Ʈ��ȣ : "+url.getPort());
			System.out.println("���       : "+url.getPath());
			System.out.println("����       : "+url.getFile());
			
			//url�� ����Ű�� �ڿ��� ����� InputStream����
			InputStream is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is));
			String str = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (MalformedURLException e) {
			//�߸��� url�� ��� MalformedURLException �߻�
		} catch (IOException e) {
			//openStream()�� IOException �߻�
		} finally {
			try { if(br!=null)br.close();} catch (Exception e) { }
		}
	}
}
