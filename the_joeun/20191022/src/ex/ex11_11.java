package ex;

class Car7 {
	String color;
	int speed;
	static private int count=0;
	
	Car7() {
		count++;
	}
	
	static int getCount() {
		return count;
	}
}

public class ex11_11 {

	public static void main(String[] args) {
		System.out.println("���� ����� �ڵ��� ���� ==> "+Car7.getCount());
		
		Car7 myCar = new Car7();
		System.out.println("���� ����� �ڵ��� ���� ==> "+myCar.getCount());
		

	}

}
