package ex;

public class ex9_17 {
//call by value: 값만 복사되어 현재 값의 영향 없음
	public static void main(String[] args) {
		int a=10;
		
		func(a);
		System.out.println("func() 실행 후의 a ==> "+a);
	}

	private static void func(int i) {
		System.out.printf("전달 받은 a ==> %d\n", ++i);		
	}

}
