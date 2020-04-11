package ppt4;
/*
 * Product클래스는 각 상품의 고유한 식별자, 상품설명, 생산자, 가격 정보를 포함.
 * Book 클래스는 ISBN, 저자, 책 제목 포함.
 * compactDisc 클래스는 앨범 제목, 가수명 포함.
 * ConversationBook 회화책에서 다루는 언어명 포함.
 * 
 * 객체지향 개념에 부합하도록 적절한 접근 지정자, 필드 메소드, 생성자 등을 작성.
 * 
 * main을 포함 ProductInfo 만들고 최대 3개의 상품을 추가할 수 있도록 하고 모든 상품의 정보를 조회 가능하게 하시오.
 * 모든 제품에 대한 정보를 출력할 때 Product타입의 객체를 이용하시오.
 */
import java.util.Scanner;

public class ProductInfo {
	static int productID=0;
	static int numberOfProduct=0;
	static Product[] p = new Product[3];
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int choice = 0;
		
		while(choice != 3) {
			int type;
			System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) >> ");
			choice = sin.nextInt();
			switch(choice) {
			case 1 :
				if(numberOfProduct >= p.length) {
					System.out.println("더 이상 추가할 수 없습니다.");
					break;
				}
				System.out.print("상품 종류 : 책(1), 음악CD(2), 회화책(3) >> ");
				type = sin.nextInt();
				if(type < 1 || type >3) {
					System.out.println("잘못된 상품 종류입니다.");
					break;
				}
				addProduct(type);
				break;
			case 2:
				for(int i=0;i<numberOfProduct;i++) {
					p[i].showInfo();
					if(i != (numberOfProduct-1))
						System.out.println();
				}
				break;
			case 3:
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		//sin.close();
	}

	private static void addProduct(int type) {
		Scanner sin = new Scanner(System.in);
		System.out.print("상품설명>> ");
		String desc = sin.nextLine();
		System.out.print("생산자  >> ");
		String maker = sin.nextLine();
		System.out.print("가격    >> ");
		int price = sin.nextInt();
		sin.nextLine();
		switch(type) {
		case 1:
			System.out.print("책 제목 >> ");
			String title = sin.nextLine();
			System.out.print("저자    >> ");
			String author = sin.nextLine();
			System.out.print("ISBN  >> ");
			int ISBN = sin.nextInt();
			p[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
			break;
		case 2:
			System.out.print("앨범제목>> ");
			String albumTitle = sin.nextLine();
			System.out.print("아티스트>> ");
			String artist = sin.nextLine();
			p[numberOfProduct] = new compactDisk(productID++, desc, maker, price, albumTitle, artist);
			break;
		case 3:
			System.out.print("책 제목 >> ");
			String title2 = sin.nextLine();
			System.out.print("저자    >> ");
			String author2 = sin.nextLine();
			System.out.print("언어    >> ");	
			String language = sin.nextLine();
			System.out.print("ISBN  >> ");
			int ISBN2 = sin.nextInt();
			p[numberOfProduct] = new ConversationBook(productID++, desc, maker, price, ISBN2, title2, author2, language);
			break;
		}
		numberOfProduct++;
	}

}
