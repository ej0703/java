
public class staticInner {
	int a = 10;
	private int b=100;
	static int c = 200;
	//b�� ���� getter()setter()����

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	//static inner class ����
	static class Inner {
		//�ܺ�Ŭ������ ����ν��Ͻ��� �����ϱ� ���� ��ü ����
		staticInner s = new staticInner();
		int d = 100;
		
		public void prindData() {
			//non static error
			//��ü�����Ŀ� ���� ����, �⺻���ٽ� �Ұ���(e)
			System.out.println("int a = "+s.a);
			System.out.println("private int b = "+s.getB());
			System.out.println("static int c = "+s.getB());
			System.out.println("int d = "+d);
			sMethode(); //�ܺ�Ŭ������ static �޼ҵ�
			s.Method(); //��ü������ ���� ����
		}; //printdData
	};//Inner
	static void sMethode() {
		System.out.println("����ƽ�޼ҵ�...");
	};
	void Method() {
		System.out.println("non-static �޼ҵ�...");
	}
	
	public static void main(String[] args) {
		staticInner.Inner inner = new staticInner.Inner();
		inner.prindData();
		
		System.out.println("----------------------------");
		Inner in = new Inner();
		in.prindData();
	}

}
