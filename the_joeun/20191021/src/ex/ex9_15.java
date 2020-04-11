package ex;

public class ex9_15 {
	static int a = 100; //클래스멤버변수, 각 객체마다 똑같은 주소를 가리킴
	int b=100; //인스턴스멤버변수, 각 객체마다 생성됨
	
	public static void main(String[] args) {
		func1();
		System.out.printf("main() 에서 a의 값 ==> %d\n", a);
//		System.out.printf("main() 에서 b의 값 ==> %d\n", b);
	}

	private static void func1() {
		int a = 200;
		System.out.printf("func1()에서 a의 값 ==> %d\n", a);
	}

}
