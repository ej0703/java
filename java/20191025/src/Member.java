
public class Member {
	int a=10; //인스턴스 멤버변수, default(현재 패키지 내에서만 접근)
	private int b = 10;
	static int c =200;
	//내부 클래스 : 외부 클래스에 멤버, 메서드 자기것처럼 사용
	//클래스 선언 위치 멤버변수 위치
	class Inner {
		//Member m = new Member();
		private void printData() {
			System.out.println("int a : "+a);
			System.out.println("int b : "+b);
			System.out.println("static int c : "+c);
		}
	};
	
	public static void main(String[] args) {
		Member.Inner inner =new Member().new Inner();
		inner.printData();
	}
}
