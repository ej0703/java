package ex;

class Car1 {
	String color;
	int speed;
		
	public Car1() {
		//default 생성자, 반환형이 없음, 안 넣어줘도 JVM이 알아서 넣어줌
		//객체 데이터들의 초기화, 객체생성
	}
	
	public Car1(String c, int s) {
		color = c;
		this.speed = s;
	}
	
	//getter()/setter()메소드를 이용 멤버변수들을 초기화 - color
	public String getColor() {
		return color;
	}	
	public void setcolor(String c) {
		this.color = c;
	}
	
	//getter()/setter()메소드를 이용 멤버변수들을 초기화 - speed
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
		myCar1.color = "빨강";
		myCar1.speed = 0;

		Car1 myCar2 = new Car1();
		myCar2.color = "파랑";
		myCar2.speed = 0;
		
		Car1 myCar3 = new Car1();
		myCar3.color = "노랑";
		myCar3.speed = 0;
		
		myCar1.upSpeed(30);
		System.out.printf("자동차1의 색상은 %s이며, 현재속도는 %dkm 입니다.\n", myCar1.color, myCar1.speed);
		myCar2.upSpeed(60);
		System.out.printf("자동차2의 색상은 %s이며, 현재속도는 %dkm 입니다.\n", myCar2.color, myCar2.speed);
		myCar3.upSpeed(0);
		System.out.printf("자동차3의 색상은 %s이며, 현재속도는 %dkm 입니다.\n", myCar3.color, myCar3.speed);
	
	//------------------------------------------------------------------------
		//생성, 필드초기화
		Car1 myCar1_1 = new Car1("보라", 100);
		System.out.printf("자동차1_1의 색상은 %s이며, 현재속도는 %dkm 입니다.\n", myCar1_1.color, myCar1_1.speed);
		myCar1_1.color = "핑크";
		myCar1_1.speed = 20;
		System.out.printf("자동차1_1의 색상은 %s이며, 현재속도는 %dkm 입니다.\n", myCar1_1.color, myCar1_1.speed);
	//------------------------------------------------------------------------
		//getter()/setter()사용 - color
		//값설정
		myCar1_1.setcolor("검정");
		System.out.println(myCar1_1.getColor());
		//getter()/setter()사용 - speed
		myCar1_1.setSpeed(80);
		System.out.println(myCar1_1.getSpeed());
	}

}
