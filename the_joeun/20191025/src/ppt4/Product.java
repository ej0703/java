package ppt4;

public class Product {
	private int productID;
	private String description;
	private String maker;
	private int price;
	
	public Product(int productID, String description, String maker, int price) {
		this.productID = productID;
		this.description = description;
		this.maker = maker;
		this.price = price;
	}
	
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품ID >> "+productID);
		System.out.println("상품설명>> "+description);
		System.out.println("생산자  >> "+maker);
		System.out.println("가격    >> "+price);
	}
}
