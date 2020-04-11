package ex;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) {
		// URL에 대한 정보를 가지고 있는 클래스
		BufferedReader br = null;
		try {
			URL url = new URL("http://www.daum.net/index.html");
			
			//url 객체로부터 프로토콜, 호스트명, 포트번호, 자원의 경로, 쿼리스트링들을 얻을 수 있다.
			System.out.println("프로토콜 : "+url.getProtocol());
			System.out.println("호스트    : "+url.getHost());
			System.out.println("포트번호 : "+url.getPort());
			System.out.println("경로       : "+url.getPath());
			System.out.println("파일       : "+url.getFile());
			
			//url이 가리키는 자원과 연결된 InputStream생성
			InputStream is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is));
			String str = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (MalformedURLException e) {
			//잘못된 url인 경우 MalformedURLException 발생
		} catch (IOException e) {
			//openStream()은 IOException 발생
		} finally {
			try { if(br!=null)br.close();} catch (Exception e) { }
		}
	}
}
