package ppt;
import java.util.Scanner;

public class GoodsArray {
	public static void main(String[] args) {
		Goods1[] goodsArray;
		goodsArray = new Goods1[3];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<goodsArray.length;i++) {
			String name = scan.next();
			int price = scan.nextInt();
			int numberOfStock = scan.nextInt();
			int sold = scan.nextInt();
			goodsArray[i] = new Goods1(name, price, numberOfStock, sold);
		}
		
		for(int i=0;i<goodsArray.length;i++) {
			System.out.printf("%s´Â %d¿ø %d°³ ³²¾Ò°í %d°³ ÆÈ·È´Ù.\n",goodsArray[i].getName(), goodsArray[i].getPrice(), goodsArray[i].getNumberOfStock(), goodsArray[i].getSold());
		}		
		scan.close();
	}
}

class Goods1 {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Goods1(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	String getName() {return name;}
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
}
