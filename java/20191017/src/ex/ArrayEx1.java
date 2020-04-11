package ex;

public class ArrayEx1 {

	public static void main(String[] args) {
//		char[] ch; //문자형 배열 선언
//		ch = new char[4]; //배열 메모리 할당, \u0000로 초기화됨
		
		//배열의 값을 할당(저장)
//		ch[0]='J';
//		ch[1]='A';
//		ch[2]='V';
//		ch[3]='A';
		
		//선언, 메모리할당, 초기화
		char[] ch = {'J','A','V','A'};
		
		//배열 값 출력, 기본형에서만 사용
		for(int i=0;i<ch.length;i++) {
			System.out.printf("ch[%d] = %c\n", i, ch[i]);
		}
		
		//향상된 for문으로 출력 == for each문이라 칭함
		//조건이 꼭 배열이거나 객체에서만 향상된 for문 사용
		//객체타입 객체변수 : 객체변수
		for(char c : ch) {
			System.out.println("c : "+c);
		}

	}

}
