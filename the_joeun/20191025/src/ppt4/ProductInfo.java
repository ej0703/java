package ppt4;
/*
 * ProductŬ������ �� ��ǰ�� ������ �ĺ���, ��ǰ����, ������, ���� ������ ����.
 * Book Ŭ������ ISBN, ����, å ���� ����.
 * compactDisc Ŭ������ �ٹ� ����, ������ ����.
 * ConversationBook ȸȭå���� �ٷ�� ���� ����.
 * 
 * ��ü���� ���信 �����ϵ��� ������ ���� ������, �ʵ� �޼ҵ�, ������ ���� �ۼ�.
 * 
 * main�� ���� ProductInfo ����� �ִ� 3���� ��ǰ�� �߰��� �� �ֵ��� �ϰ� ��� ��ǰ�� ������ ��ȸ �����ϰ� �Ͻÿ�.
 * ��� ��ǰ�� ���� ������ ����� �� ProductŸ���� ��ü�� �̿��Ͻÿ�.
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
			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3) >> ");
			choice = sin.nextInt();
			switch(choice) {
			case 1 :
				if(numberOfProduct >= p.length) {
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
					break;
				}
				System.out.print("��ǰ ���� : å(1), ����CD(2), ȸȭå(3) >> ");
				type = sin.nextInt();
				if(type < 1 || type >3) {
					System.out.println("�߸��� ��ǰ �����Դϴ�.");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		//sin.close();
	}

	private static void addProduct(int type) {
		Scanner sin = new Scanner(System.in);
		System.out.print("��ǰ����>> ");
		String desc = sin.nextLine();
		System.out.print("������  >> ");
		String maker = sin.nextLine();
		System.out.print("����    >> ");
		int price = sin.nextInt();
		sin.nextLine();
		switch(type) {
		case 1:
			System.out.print("å ���� >> ");
			String title = sin.nextLine();
			System.out.print("����    >> ");
			String author = sin.nextLine();
			System.out.print("ISBN  >> ");
			int ISBN = sin.nextInt();
			p[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
			break;
		case 2:
			System.out.print("�ٹ�����>> ");
			String albumTitle = sin.nextLine();
			System.out.print("��Ƽ��Ʈ>> ");
			String artist = sin.nextLine();
			p[numberOfProduct] = new compactDisk(productID++, desc, maker, price, albumTitle, artist);
			break;
		case 3:
			System.out.print("å ���� >> ");
			String title2 = sin.nextLine();
			System.out.print("����    >> ");
			String author2 = sin.nextLine();
			System.out.print("���    >> ");	
			String language = sin.nextLine();
			System.out.print("ISBN  >> ");
			int ISBN2 = sin.nextInt();
			p[numberOfProduct] = new ConversationBook(productID++, desc, maker, price, ISBN2, title2, author2, language);
			break;
		}
		numberOfProduct++;
	}

}
