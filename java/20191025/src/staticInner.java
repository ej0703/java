
public class staticInner {
	int a = 10;
	private int b=100;
	static int c = 200;
	//b에 대한 getter()setter()정의

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	//static inner class 선언
	static class Inner {
		//외부클래스의 멤버인스턴스를 접근하기 위해 객체 생성
		staticInner s = new staticInner();
		int d = 100;
		
		public void prindData() {
			//non static error
			//객체생성후에 접근 가능, 기본접근시 불가능(e)
			System.out.println("int a = "+s.a);
			System.out.println("private int b = "+s.getB());
			System.out.println("static int c = "+s.getB());
			System.out.println("int d = "+d);
			sMethode(); //외부클래스에 static 메소드
			s.Method(); //객체생성후 접근 가능
		}; //printdData
	};//Inner
	static void sMethode() {
		System.out.println("스태틱메소드...");
	};
	void Method() {
		System.out.println("non-static 메소드...");
	}
	
	public static void main(String[] args) {
		staticInner.Inner inner = new staticInner.Inner();
		inner.prindData();
		
		System.out.println("----------------------------");
		Inner in = new Inner();
		in.prindData();
	}

}
