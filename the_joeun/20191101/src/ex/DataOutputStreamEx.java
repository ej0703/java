package ex;

import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		//DataOutputStream은 기본자료형 타입 그대로 스트림을 통해서 기록할 수 있다.
		//DataOutputStream은 1차스트림이 아니기 때문에 다른 스트림을 이용해서 특정 Device와 연결 될 수 있다.
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		try {
			//DataOutputStream과 연결된 FileOutputStream
			//객체생성
			fos = new FileOutputStream("src/ex/data.sav");
			
			//기본자료형의 타입을 유지한채 기록할 수 있는 DataOutputStream객체 생성
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "JAVA프로그램";
			//DataOutputStream은 기본자료형별로 write메소드가 존재
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

/* DataInputStream : 바이트 스트림으로부터 자바기본자료형 Data로 읽는다.
 * DataOuputStream : 기본자료형을 바이트스트림으로 출력
 * - 특정 데이터 타입과 포맷을 유지한 채 데이터를 읽고 쓸 수 있는 스트림이다.
 * - 특정 데이터 타입과 포맷에 맞게 읽고 쓸 수 있는 readBoolean(), writeBoolean(), readInt(), readUTF(), writeUTF(String s)등 메소드 제공한다.
 * - 주요 생성자
 *   DataInputStream(InputStream stream)
 *   DataOutputStream(OutputStream stream)
 * - 스트림의 특징
 * . FIFO구조이다. (큐) : 먼저 입력된 것이 먼저 출력되는 구조로 순서 바뀌지 않음
 * . 자바에서는 입출력이 동시에 이루어지지 않음. 읽기/쓰기하려면 읽기/쓰기스트림을 하나씩 열어 사용해야 한다.
 * . 스트림은 지연(대기)될 수 있다.--> 스트림에 입력된 데이터가 처리되기 전까지는 스트림에 사용되는 스레드는 지연상태에 빠진다.
 *   네트워크내에서는 데이터가 모두 전송되기 전까지 네트워크 스레드는 지연상태가 된다.
 * - 스트림 분류
 *   <스트림의 용도에 따라>
 *   1차 스트림 : 장치(Device)에 직접적으로 연결되는 스트림 == node stream == 기본 stream
 *   2차 스트림 : 장치(Device)에 직접적으로 연결되지 않는 스트림
 *   		   1차 스트림과 연결을 통해서만 장치에 연결 할 수 있다.(filter기능이 있다.)
 *   <스트림의 데이터 전송 방향에 따라>
 *   입력 스트림 : 장치(Device)로부터 데이터를 읽어오는 스트림
 *   출력 스트림 : 장치(Device)로 데이터를 기록하는 스트림
 *   <데이터 전송 단위에 따라>
 *   바이트 스트림 : 한 byte 단위로 읽고 쓸 수 있는 스트림
 *   문자 스트림 : 한 문자(2byte)단위로 읽고 쓸 수 있는 스트림
*/