package ex;

class Car2 {
	//���� Ŭ������������ ���ٰ���, �ܺ� Ŭ��������, ��Ű��, �ٸ���Ű������ ���� �Ұ�
	//��������, ĸ��ȭ(�ܺο����� ������ �˸� ��, ���ΰ� ��� �����Ǿ��� �Ű� �� �ʿ� ����)
	//�ܺο��� �����ؼ� ������ �����Ӱ� ���� ���ϵ��� ��.
	private String color;
	private int speed;
	
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -=value;
	}
	
	//getter()/setter() ���� : private ����������� ������ ����, ���Ⱑ���ϰ� ��.
	String getColor() {
		return color;
	}	
	int getSpeed() {
		return speed;
	}
	
	void setColor(String c) {
		this.color = c;
	}	
	void setSpeed(int s) {
		this.speed = s;
	}
}

public class ex11_03 {

	public static void main(String[] args) {
		Car2 myCar1 = new Car2();
		myCar1.setColor("����");
		//myCar1.color�� ���� ->private color ����
		myCar1.setSpeed(0);
		//myCar1.speed�� ���� ->private speed ����
		
		myCar1.upSpeed(30);
		System.out.printf("�ڵ���1�� ������ %s�̸�, ���� �ӵ��� %dkm �Դϴ�.\n", myCar1.getColor(),myCar1.getSpeed());
	}

}
