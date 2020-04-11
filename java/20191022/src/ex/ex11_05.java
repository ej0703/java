package ex;

class Car5 {
	private int speed;
	
	public void upSpeed(int value) {
		if(speed+value>200)
			speed = 200;
		else
			speed += value;
	
		System.out.println("현재 속도 ==> "+getSpeed());
	}
	
	public void downSpeed(int value) {
		if(speed-value < 0)
			speed = 0;
		else
			speed -= value;
		
		System.out.println("현재 속도 ==> "+getSpeed());
	}

	private int getSpeed() {
		return speed;
	}
	
}

public class ex11_05 {

	public static void main(String[] args) {
		Car5 myCar = new Car5();
		
		myCar.upSpeed(80);
		myCar.upSpeed(150);
		
		myCar.downSpeed(70);
		myCar.downSpeed(150);

	}

}
