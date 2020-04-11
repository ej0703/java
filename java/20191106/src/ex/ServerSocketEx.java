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
		while(true) { //Ŭ���̾�Ʈ�� ���ö����� ���� ����
			try {
				//Ŭ���̾�Ʈ���� ���� ��ȣ�� Socket���� �ޱ�
				Socket s1 = s.accept();
				System.out.println(s1.getInetAddress());
				//Ŭ���̾�Ʈ���� ���� �����ġ
				OutputStream s1out = s1.getOutputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));
				bw.write("Hello �氡����\n"); //Ŭ���̾�Ʈ�� ��������
				bw.close();
				s1.close();
			} catch (IOException e) {
				e.printStackTrace(); //exception ��� ����
			}
		}

	}

}

//----------Ŭ���̾�Ʈ