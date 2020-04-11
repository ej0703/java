package ex;

interface Car3 {
	void work();
}

interface Cannon {
	void fire();
}

class Tank implements Car3, Cannon {
	public void work() {
		System.out.println("탱크가 앞으로 굴러갑니다.");
	}
	
	public void fire() {
		System.out.println("탱크에서 대포를 발사합니다.");
	}
}

public class Ex12_11 {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.work();
		tank.fire();
	}

}
