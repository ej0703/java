
public class Member {
	int a=10; //�ν��Ͻ� �������, default(���� ��Ű�� �������� ����)
	private int b = 10;
	static int c =200;
	//���� Ŭ���� : �ܺ� Ŭ������ ���, �޼��� �ڱ��ó�� ���
	//Ŭ���� ���� ��ġ ������� ��ġ
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
