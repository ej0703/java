package ppt;

public class Goods {
	String name;
	private int price;
	int numberOfStock;
	static private int sold;
	
	public static void main(String[] args) {
		Goods camera =new Goods();
		
		camera.name = "Nikon";
		camera.price = 400000; //ŸŬ���������� setter() ����ؾ���.
		camera.numberOfStock = 30;
		sold=50;
		
		System.out.println("��ǰ �̸� : "+camera.name);
		System.out.println("��ǰ ���� : "+camera.price);
		System.out.println("��� ���� : "+camera.numberOfStock);
		System.out.println("�ȸ� ���� : "+sold);
		
		//private������������ �ش��ϴ� �ڷ����϶�
		camera.setPrice(2);
		int p = camera.getPrice();
		System.out.println("getter�� ���޵� ������ : "+p);
		System.out.println("camera.getPrice() = "+ camera.getPrice());
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
