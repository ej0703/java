
public class CircleClass {
	final double PI = 3.14; //�ʱ�ȭ ��, ���Ҵ� �Ұ�
	public static void main(String[] args) {
		//������ ���ȭ��Ŵ, �ݵ�� �ʱ�ȭ �Ǿ����. �� ����, ���Ҵ�Ұ�
		final double PI = 3.14; //�������� ����� ����
		double radius = 10;//������
		double circleArea = 0;//���� ����
		
		circleArea = radius * radius * PI;
		
		System.out.printf("���� ���� = %.2f", circleArea);

		//PI = 5.0; //���Ҵ�Ұ�
	}
	//�޼ҵ� ����
	public final void display() {
		
	}
}
