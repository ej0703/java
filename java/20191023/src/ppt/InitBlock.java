package ppt;
/*
 * ������(Constructor)�� �ʱ�ȭ ��(Initalized Block)
 * -----------------------------------------------
 * Ŭ���������� �ʱ�ȭ���� : Ŭ������ ó�� �ε��� �� �� �ѹ� �ʱ�ȭ �ȴ�.
 * �ν��Ͻ����� �ʱ�ȭ���� : �ν��Ͻ��� �����ɶ� ���� ���� �ν��Ͻ����� �ʱ�ȭ�� �̷������.
 * Ŭ���� ������ �ʱ�ȭ ���� : �⺻�� -> ����� �ʱ�ȭ -> Ŭ���� �ʱ�ȭ �� -> �ν��Ͻ��ʱ�ȭ �� -> ������
 * �ν��Ͻ������� �ʱ�ȭ ���� : �⺻�� -> ����� �ʱ�ȭ -> �ν��Ͻ��ʱ�ȭ �� -> ������
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
	//�ν��Ͻ� �ʱ�ȭ ��
	{
		n=500;
		m=200;
		System.out.println("\n �ν��Ͻ� �ʱ�ȭ ��...");
	}
	//static�ʱ�ȭ ��
	static {
		s=200;
		System.out.println("static �ʱ�ȭ ��...");
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
