package ex;

public class ex9_17 {
//call by value: ���� ����Ǿ� ���� ���� ���� ����
	public static void main(String[] args) {
		int a=10;
		
		func(a);
		System.out.println("func() ���� ���� a ==> "+a);
	}

	private static void func(int i) {
		System.out.printf("���� ���� a ==> %d\n", ++i);		
	}

}
