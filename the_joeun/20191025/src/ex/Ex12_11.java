package ex;

interface Car3 {
	void work();
}

interface Cannon {
	void fire();
}

class Tank implements Car3, Cannon {
	public void work() {
		System.out.println("��ũ�� ������ �������ϴ�.");
	}
	
	public void fire() {
		System.out.println("��ũ���� ������ �߻��մϴ�.");
	}
}

public class Ex12_11 {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.work();
		tank.fire();
	}

}
