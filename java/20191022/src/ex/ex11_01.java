package ex;

class Car1 {
	String color;
	int speed;
		
	public Car1() {
		//default ������, ��ȯ���� ����, �� �־��൵ JVM�� �˾Ƽ� �־���
		//��ü �����͵��� �ʱ�ȭ, ��ü����
	}
	
	public Car1(String c, int s) {
		color = c;
		this.speed = s;
	}
	
	//getter()/setter()�޼ҵ带 �̿� ����������� �ʱ�ȭ - color
	public String getColor() {
		return color;
	}	
	public void setcolor(String c) {
		this.color = c;
	}
	
	//getter()/setter()�޼ҵ带 �̿� ����������� �ʱ�ȭ - speed
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		this.speed = s;
	}
	
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -= value;
	}
}

public class ex11_01 {

	public static void main(String[] args) {
		Car1 myCar1 = new Car1();
		myCar1.color = "����";
		myCar1.speed = 0;

		Car1 myCar2 = new Car1();
		myCar2.color = "�Ķ�";
		myCar2.speed = 0;
		
		Car1 myCar3 = new Car1();
		myCar3.color = "���";
		myCar3.speed = 0;
		
		myCar1.upSpeed(30);
		System.out.printf("�ڵ���1�� ������ %s�̸�, ����ӵ��� %dkm �Դϴ�.\n", myCar1.color, myCar1.speed);
		myCar2.upSpeed(60);
		System.out.printf("�ڵ���2�� ������ %s�̸�, ����ӵ��� %dkm �Դϴ�.\n", myCar2.color, myCar2.speed);
		myCar3.upSpeed(0);
		System.out.printf("�ڵ���3�� ������ %s�̸�, ����ӵ��� %dkm �Դϴ�.\n", myCar3.color, myCar3.speed);
	
	//------------------------------------------------------------------------
		//����, �ʵ��ʱ�ȭ
		Car1 myCar1_1 = new Car1("����", 100);
		System.out.printf("�ڵ���1_1�� ������ %s�̸�, ����ӵ��� %dkm �Դϴ�.\n", myCar1_1.color, myCar1_1.speed);
		myCar1_1.color = "��ũ";
		myCar1_1.speed = 20;
		System.out.printf("�ڵ���1_1�� ������ %s�̸�, ����ӵ��� %dkm �Դϴ�.\n", myCar1_1.color, myCar1_1.speed);
	//------------------------------------------------------------------------
		//getter()/setter()��� - color
		//������
		myCar1_1.setcolor("����");
		System.out.println(myCar1_1.getColor());
		//getter()/setter()��� - speed
		myCar1_1.setSpeed(80);
		System.out.println(myCar1_1.getSpeed());
	}

}
