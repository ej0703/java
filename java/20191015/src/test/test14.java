package test;

public class test14 {

	public static void main(String[] args) {
		int alp=65; //대문자 'A'의 아스키코드 65
		
		do {
			System.out.print((char)alp+" "); //int형이므로 알파벳 출력위해 char 변환
			
			if(alp%7==1) //문자 7개 입력 후 줄바꿈
				System.out.print("\n");
			
			alp++; //알파벳 하나씩 증가
		} while(alp<=90); //대문자 'Z'의 아스키코드 90, 출력 종료

	}

}
