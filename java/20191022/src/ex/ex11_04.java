package ex;

class Car4 {
	String color;
	int speed;
	
	public void upSpeed(int value) {
		speed += value;
	}
	
	public void downSpeed(int value) {
		speed -=value;
	}
	
	public String getColor() {
		return color;
	}	
	public int getSpeed() {
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class ex11_04 {

	public static void main(String[] args) {
		Car4 myCar1 = new Car4();
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);
		
		myCar1.upSpeed(30);
		System.out.printf("자동차1의 색상은 %s이며, 현재 속도는 %dkm입니다.\n", myCar1.getColor(), myCar1.getSpeed());

	}

}
