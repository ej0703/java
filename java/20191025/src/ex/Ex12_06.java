package ex;

class Car {
	int speed = 0;
	
	final void upSpeed(int speed) {
		this.speed += speed;
	}
//	void upSpeed(int speed) {
//		this.speed += speed;
//		System.out.println("현재속도(슈퍼클래스) : "+this.speed);
//	}
}

class Sedan extends Car {
	final static String CAR_TYPE = "승용차";
//	void upSpeed(int speed) {
//		this.speed += speed;
//		if(this.speed>150) 
//			this.speed = 150;
//		System.out.println("현재속도(서브클래스) : "+this.speed);
//	}
}

class Trunk extends Car {}

public class Ex12_06 {

	public static void main(String[] args) {
//		Trunk trunk1 = new Trunk();
//		Sedan sedan1 = new Sedan();
//		
//		System.out.print("트럭   -> ");
//		trunk1.upSpeed(200);
//		
//		System.out.print("승용차 -> ");
//		sedan1.upSpeed(200);
		
		System.out.println("Sedan 클래스 타입 -> "+Sedan.CAR_TYPE);

	}

}
