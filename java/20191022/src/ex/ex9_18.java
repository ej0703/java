package ex;

class myInt {
	int a;
}

public class ex9_18 {

	static void func(myInt m) {
		m.a ++;
		System.out.println("���޹��� a ==> "+m.a);
	}
	
	public static void main(String[] args) {
		myInt m = new myInt();
		m.a = 10;
		
		func(m);
		System.out.println("func() ���� ���� a ==> "+m.a);
	}

}
