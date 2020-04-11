package ex;

interface Car2 {
	static final int CAR_COUNT =0;
	
	abstract void work();
}

class Sedan2 implements Car2 {
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

class Trunk2 implements Car2 {
	public void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}

public class Ex12_10 {

	public static void main(String[] args) {
		Sedan2 sedan = new Sedan2();
		sedan.work();
		Trunk2 trunk = new Trunk2();
		trunk.work();
	}

}
