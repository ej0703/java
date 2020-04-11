package ppt;
/*
 * 생성자(Constructor)와 초기화 블럭(Initalized Block)
 * -----------------------------------------------
 * 클래스변수와 초기화시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다.
 * 인스턴스변의 초기화시점 : 인스턴스가 생성될때 마다 각각 인스턴스별로 초기화가 이루어진다.
 * 클래스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭 -> 인스턴스초기화 블럭 -> 생성자
 * 인스턴스변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 인스턴스초기화 블럭 -> 생성자
 */
public class InitBlock {
	int n, m;
	static int s;
	public InitBlock() {
		n=500;
		m=300;
	}
	public InitBlock(int n, int m) {
		this.n=n;
		this.m =m;
	}
	//인스턴스 초기화 블럭
	{
		n=500;
		m=200;
		System.out.println("\n 인스턴스 초기화 블럭...");
	}
	//static초기화 블럭
	static {
		s=200;
		System.out.println("static 초기화 블럭...");
	}
	void write() {
		System.out.println("n : "+n+", m : "+m);
	}
	
	public static void main(String[] args) {
		InitBlock init = new InitBlock();
		init.write();
		
		InitBlock init1 = new InitBlock();
		init1.write();
	}

}
