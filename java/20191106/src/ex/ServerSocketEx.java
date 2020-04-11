package ex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx {

	public static void main(String[] args) {
		ServerSocket s = null;
		try {
		s = new ServerSocket(5432);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(true) { //클라이언트가 들어올때까지 무한 루프
			try {
				//클라이언트에서 오는 신호를 Socket으로 받기
				Socket s1 = s.accept();
				System.out.println(s1.getInetAddress());
				//클라이언트에게 보낼 출력장치
				OutputStream s1out = s1.getOutputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));
				bw.write("Hello 방가워요\n"); //클라이언트에 보낼내용
				bw.close();
				s1.close();
			} catch (IOException e) {
				e.printStackTrace(); //exception 경로 추적
			}
		}

	}

}

//----------클라이언트