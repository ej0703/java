package ex;

abstract class Car1 {
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
	
	abstract void work();
}

class Sedan1 extends Car1 {
	void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

class Trunk1 extends Car1 {
	void work() {
		System.out.println("트럭이 짐을 신고 있습니다.");
	}
}

public class Ex12_09 {

	public static void main(String[] args) {
		Sedan1 sedan = new Sedan1();
		sedan.work();
		Trunk1 trunk = new Trunk1();
		trunk.work();

	}

}
