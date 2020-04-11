package ppt;

public class Goods {
	String name;
	private int price;
	int numberOfStock;
	static private int sold;
	
	public static void main(String[] args) {
		Goods camera =new Goods();
		
		camera.name = "Nikon";
		camera.price = 400000; //타클래스에서는 setter() 사용해야함.
		camera.numberOfStock = 30;
		sold=50;
		
		System.out.println("상품 이름 : "+camera.name);
		System.out.println("상품 가격 : "+camera.price);
		System.out.println("재고 수량 : "+camera.numberOfStock);
		System.out.println("팔린 수량 : "+sold);
		
		//private접근지정자의 해당하는 자료형일때
		camera.setPrice(2);
		int p = camera.getPrice();
		System.out.println("getter로 전달된 변수값 : "+p);
		System.out.println("camera.getPrice() = "+ camera.getPrice());
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
