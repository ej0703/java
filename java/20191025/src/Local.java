//3. Local class
public class Local {
	int a=100;
	//�޼��� ����
	public void innerTest(int k) {
		//final ��������(JDK1.8���� ��������, ���������� �� final�� ��� ��)
		int b =200;
		final int c = k;
		//���� ���� Ŭ���� ����
		class localInner{
			//���, ��������
			//���� Ŭ������ ������ �޼��峻�� ���ǵ� �������� ����
			public void getData() {
				System.out.println("int a = "+a);
				System.out.println("int b = "+b);
				System.out.println("final int c = "+c);
				System.out.println("method() = "+method());
			};
		};//localInner
		localInner i = new localInner(); //������ �޼��� ���� ���� ����
		i.getData();
	}; //Innertest
	public int method() {
		int m = 2;
		return m;
	}

	public static void main(String[] args) {
		Local outer = new Local(); //�ܺ�Ŭ���� ��ü ����
		outer.innerTest(1000); //�ܺ�Ŭ���� �޼��� ȣ��
	}

}
