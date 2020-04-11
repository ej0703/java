package ex;

class Car6 {
	String color;
	int speed;
	static int count=0;
	int init =0;
	
	Car6() {
		count++;
		init++;
	}
}

public class ex11_10 {

	public static void main(String[] args) {
		Car6 myCar1 = new Car6();
		System.out.println("현재 생산된 자동차 숫자 ==> "+myCar1.count+"  |  "+myCar1.init);

		Car6 myCar2 = new Car6();
		System.out.println("현재 생산된 자동차 숫자 ==> "+myCar2.count+"  |  "+myCar2.init);

		Car6 myCar3 = new Car6();
		System.out.println("현재 생산된 자동차 숫자 ==> "+myCar3.count+"  |  "+myCar3.init);
	}

}
