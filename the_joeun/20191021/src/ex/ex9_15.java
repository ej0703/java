package ex;

public class ex9_15 {
	static int a = 100; //Ŭ�����������, �� ��ü���� �Ȱ��� �ּҸ� ����Ŵ
	int b=100; //�ν��Ͻ��������, �� ��ü���� ������
	
	public static void main(String[] args) {
		func1();
		System.out.printf("main() ���� a�� �� ==> %d\n", a);
//		System.out.printf("main() ���� b�� �� ==> %d\n", b);
	}

	private static void func1() {
		int a = 200;
		System.out.printf("func1()���� a�� �� ==> %d\n", a);
	}

}
