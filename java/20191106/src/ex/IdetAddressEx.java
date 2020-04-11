package ex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IdetAddressEx {

	public static void main(String[] args) {
		// InetAddress는 ip정보와 host정보(이름)를 가지는 객체
		// InetAddress객체는 생성자가 아닌 static메소드를 이용해서 생성한다.
		
		try {
			//host이름에 해당하는 ip정보를 가진 InetAddress 객체 얻기
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			
			//ip주소 얻기
			String ip = ipInfo1.getHostAddress();
			System.out.println("ip주소    : "+ip);
			//host 이름에 해당하는 ip정보를 가진 모든 InetAddress객체 얻기
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			for(InetAddress inetAddress : ipArray) {
				System.out.println(inetAddress);
			}
			
			// 현재 컴퓨터의 ip정보를 가진 InetAddress객체 얻기
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host   : "+myHost.getHostName());
			System.out.println("host IP: "+myHost.getHostAddress());
		} catch (UnknownHostException e) {
			//host이름에 해당하는 host를 찾지 못했을 경우 예외처리
			e.printStackTrace();
		}
	}
}
/* TCP : 신뢰할 수 있다. 데이터 송수신 상태 점검
 * 		 전화기 통신과 비슷, 부하가 많이 걸리고, 속도가 느리다.
 * 		 관련클래스 : InetAddress, Socket, ServeSocket
 * InetAddress : IP주소를 표현한 클래스
 * 				 자바에서는 모든 IP주소를 InetAddress를 사용한다.
 * URL(Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소를 표현할 수 있는 형식을 말한다.
 * 		http://www.naver.com:80/member/mem.jsp?name=kimbab#content
 * 	 protocol host			  port path	 	query		reference
 */
 