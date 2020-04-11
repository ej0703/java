
public class CircleClass {
	final double PI = 3.14; //초기화 꼭, 재할당 불가
	public static void main(String[] args) {
		//변수를 상수화시킴, 반드시 초기화 되어야함. 값 고정, 재할당불가
		final double PI = 3.14; //원주율을 상수로 선언
		double radius = 10;//반지름
		double circleArea = 0;//원의 면적
		
		circleArea = radius * radius * PI;
		
		System.out.printf("원의 면적 = %.2f", circleArea);

		//PI = 5.0; //재할당불가
	}
	//메소드 선언
	public final void display() {
		
	}
}
