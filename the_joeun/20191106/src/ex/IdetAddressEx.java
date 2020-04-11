package ex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IdetAddressEx {

	public static void main(String[] args) {
		// InetAddress�� ip������ host����(�̸�)�� ������ ��ü
		// InetAddress��ü�� �����ڰ� �ƴ� static�޼ҵ带 �̿��ؼ� �����Ѵ�.
		
		try {
			//host�̸��� �ش��ϴ� ip������ ���� InetAddress ��ü ���
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			
			//ip�ּ� ���
			String ip = ipInfo1.getHostAddress();
			System.out.println("ip�ּ�    : "+ip);
			//host �̸��� �ش��ϴ� ip������ ���� ��� InetAddress��ü ���
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			for(InetAddress inetAddress : ipArray) {
				System.out.println(inetAddress);
			}
			
			// ���� ��ǻ���� ip������ ���� InetAddress��ü ���
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host   : "+myHost.getHostName());
			System.out.println("host IP: "+myHost.getHostAddress());
		} catch (UnknownHostException e) {
			//host�̸��� �ش��ϴ� host�� ã�� ������ ��� ����ó��
			e.printStackTrace();
		}
	}
}
/* TCP : �ŷ��� �� �ִ�. ������ �ۼ��� ���� ����
 * 		 ��ȭ�� ��Ű� ���, ���ϰ� ���� �ɸ���, �ӵ��� ������.
 * 		 ����Ŭ���� : InetAddress, Socket, ServeSocket
 * InetAddress : IP�ּҸ� ǥ���� Ŭ����
 * 				 �ڹٿ����� ��� IP�ּҸ� InetAddress�� ����Ѵ�.
 * URL(Uniform Resource Locator) : ���ͳݿ��� ���� ������ �ڿ��� �ּҸ� ǥ���� �� �ִ� ������ ���Ѵ�.
 * 		http://www.naver.com:80/member/mem.jsp?name=kimbab#content
 * 	 protocol host			  port path	 	query		reference
 */
 