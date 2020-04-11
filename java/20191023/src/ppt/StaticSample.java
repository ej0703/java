package ppt;

public class StaticSample {
	public int n; //개별 메모리
	public void g() {
		m=20;
	}
	public void h() {
		m=30;
	}
	public static int m; //공유 메모리
	public static void f() {
		m=5;
	}

	public static void main(String[] args) {
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5;
		s1.g();
		s1.m = 50;
		s2 = new StaticSample();
		s2.n = 8;
		s2.h();
		s2.f();
		System.out.println("s1.m = "+s1.m+"\ts1.n = "+s1.n);
		System.out.println("s2.m = "+s2.m+"\ts2.n = "+s2.n);
		
		System.out.println();
		
		StaticSample.m = 10;
		System.out.println("s1.m = "+s1.m);
		s1.f();
		StaticSample.f();
		System.out.println("s1.m = "+s1.m);
		System.out.println("StaticSample.m = "+s1.m);
	}

}
