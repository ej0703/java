package ex;

class Car {
	int speed = 0;
	
	final void upSpeed(int speed) {
		this.speed += speed;
	}
//	void upSpeed(int speed) {
//		this.speed += speed;
//		System.out.println("����ӵ�(����Ŭ����) : "+this.speed);
//	}
}

class Sedan extends Car {
	final static String CAR_TYPE = "�¿���";
//	void upSpeed(int speed) {
//		this.speed += speed;
//		if(this.speed>150) 
//			this.speed = 150;
//		System.out.println("����ӵ�(����Ŭ����) : "+this.speed);
//	}
}

class Trunk extends Car {}

public class Ex12_06 {

	public static void main(String[] args) {
//		Trunk trunk1 = new Trunk();
//		Sedan sedan1 = new Sedan();
//		
//		System.out.print("Ʈ��   -> ");
//		trunk1.upSpeed(200);
//		
//		System.out.print("�¿��� -> ");
//		sedan1.upSpeed(200);
		
		System.out.println("Sedan Ŭ���� Ÿ�� -> "+Sedan.CAR_TYPE);

	}

}
