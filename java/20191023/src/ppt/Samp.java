package ppt;

public class Samp {
	int id;
	public Samp() {
		System.out.println("기본 생성자...");
	}
	public Samp(int x) {
		this.id = x;
		System.out.println("인자가 있는 생성자 생성자...");
	}
	public void set (int x) {this.id=x;}
	public int get() {return this.id;}
	
	public static void main(String[] args) {
		Samp s = new Samp();		
		Samp ob1 = new Samp(3);
		Samp ob2 = new Samp(4);
		
		System.out.println("ob1 = "+ob1.hashCode());
		System.out.println("ob2 = "+ob2.hashCode());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.id = "+ob1.id);
		System.out.println("ob2.id = "+ob2.id);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("ob1 = "+ob1.hashCode());
		System.out.println("ob2 = "+ob2.hashCode());
		System.out.println("s = "+s.hashCode());
	}

}
