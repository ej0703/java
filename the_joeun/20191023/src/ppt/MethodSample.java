package ppt;

public class MethodSample {
	//�ʵ� ����
	String name;
	int age;
	MethodSample method;
	//������ �����ε�
	public MethodSample() {

	}
	public MethodSample(String name) {
		this(); //����Ʈ������ ȣ��, ������ ȣ���ϱ� ������ ������ �������� ���, ��ù�ٿ� ���
		//�ʵ� �ʱ�ȭ
		this.name = name;
	}
	public MethodSample(String name, int age, MethodSample method) {
		this("������"); //������ ȣ��
		
		//�ʵ� �ʱ�ȭ
		this.name = name;
		this.age = age;
		this.method = method;
	}

	//�޼ҵ� �����ε�
	//�޼ҵ� �����ε�(�޼ҵ�� �ݵ�� ��ġ, �Ű������� Ÿ��, ����, ������ ��� �޶�� �Ѵ�.)
	//���� �������� ����ϱ� �����̰�, �ڵ带 �����ϱ� ����.
	public int getSum(int i, int j) {
		return i+j;
	}
	public int getSum(int i, int j, int k) {
		return i+j+k;
	}
	public double getSum(double i, double j) {
		return i+j;
	}

	public static void main(String[] args) {
		MethodSample meth = new MethodSample();
		MethodSample meth2 = new MethodSample("ȫ�浿");
		MethodSample meth3 = new MethodSample("ȫ���",20,meth);

		int a = meth.getSum(1, 2);
		int b = meth.getSum(1, 2,3);
		double c = meth.getSum(1.1, 2.2);

		System.out.printf("a = %d\nb = %d\nc = %.1f\n",a,b,c);
		
		System.out.println(meth2.name+" "+meth3.name+" "+meth3.age);
	}

}
