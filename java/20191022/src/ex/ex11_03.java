package ex;

class Car2 {
	//현재 클래스내에서만 접근가능, 외부 클래스에서, 패키지, 다른패키지에서 접든 불가
	//정보은닉, 캡슐화(외부에서는 사용법만 알면 됨, 내부가 어떻게 구성되었건 신경 쓸 필요 없음)
	//외부에서 접근해서 값변경 자유롭게 하지 못하도록 함.
	private String color;
	private int speed;
	
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -=value;
	}
	
	//getter()/setter() 선언 : private 멤버변수들의 값들을 저장, 인출가능하게 함.
	String getColor() {
		return color;
	}	
	int getSpeed() {
		return speed;
	}
	
	void setColor(String c) {
		this.color = c;
	}	
	void setSpeed(int s) {
		this.speed = s;
	}
}

public class ex11_03 {

	public static void main(String[] args) {
		Car2 myCar1 = new Car2();
		myCar1.setColor("빨강");
		//myCar1.color는 오류 ->private color 때문
		myCar1.setSpeed(0);
		//myCar1.speed는 오류 ->private speed 때문
		
		myCar1.upSpeed(30);
		System.out.printf("자동차1의 색상은 %s이며, 현재 속도는 %dkm 입니다.\n", myCar1.getColor(),myCar1.getSpeed());
	}

}
