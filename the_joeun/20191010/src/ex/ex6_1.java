package ex;

public class ex6_1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요? 빙글빙글 for 문을 공부중입니다.^^");
		System.out.println("안녕하세요? 빙글빙글 for 문을 공부중입니다.^^");
		System.out.println("안녕하세요? 빙글빙글 for 문을 공부중입니다.^^");
		System.out.println("안녕하세요? 빙글빙글 for 문을 공부중입니다.^^");
		System.out.println("안녕하세요? 빙글빙글 for 문을 공부중입니다.^^");
		System.out.println(); //복사, 붙여넣기
		
		int i;
		
		for(i=0;i<5;i++) { //for문으로 5번 반복
			System.out.printf("%d : 안녕하세요? 빙글빙글 for 문을 공부중입니다.^^\n", i);
		}
		
		System.out.println();
		
		for(i=5;i>0;i--) {
			System.out.printf("%d : 안녕하세요? 빙글빙글 for 문을 공부중입니다.^^\n", i);	
		}
		
		System.out.println();
		
		i=0;
		
		while(i<5) { //while문으로 5번 반복
			System.out.println("안녕하세요? 빙글빙글 for 문을 공부중입니다.^^");
			i++;
		}
	}

}
