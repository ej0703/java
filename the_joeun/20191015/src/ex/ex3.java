package ex;

import java.io.*;

public class ex3 {

	public static void main(String[] args) throws IOException {
		//filterStream
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String strData;
		
		System.out.printf("임의의 정수 입력 ");
		n= Integer.parseInt(br.readLine());
		
		//연산처리
		strData=(n<0) ? "음수": ((n==0) ? "영" : "양수"); //중첩 if로 가능
		//결과출력
		System.out.println(n+"==>"+strData);
	}

}
