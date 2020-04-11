package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) {
		try {
			Socket s1 = new Socket("127.0.0,1",5432);
			BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			System.out.println(br.readLine());
			br.close();
			s1.close();
		} catch (ConnectException e) {
			System.out.println("Could not connect to the server.");
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
