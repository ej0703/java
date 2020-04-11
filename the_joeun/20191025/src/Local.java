//3. Local class
public class Local {
	int a=100;
	//메서드 정의
	public void innerTest(int k) {
		//final 생략가능(JDK1.8부터 가능해짐, 이전버전은 꼭 final을 써야 함)
		int b =200;
		final int c = k;
		//내부 로컬 클래스 선언
		class localInner{
			//상수, 전역변수
			//내부 클래스를 포함한 메서드내에 정의된 지역변수 접근
			public void getData() {
				System.out.println("int a = "+a);
				System.out.println("int b = "+b);
				System.out.println("final int c = "+c);
				System.out.println("method() = "+method());
			};
		};//localInner
		localInner i = new localInner(); //로컬의 메서드 접근 위해 생성
		i.getData();
	}; //Innertest
	public int method() {
		int m = 2;
		return m;
	}

	public static void main(String[] args) {
		Local outer = new Local(); //외부클래스 객체 생성
		outer.innerTest(1000); //외부클래스 메서드 호출
	}

}
