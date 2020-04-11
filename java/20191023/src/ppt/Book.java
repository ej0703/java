package ppt;

public class Book {
	String title;
	String author;
	int ISBN;

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("3�� ���ڰ� ���� �� ����");
	}
	public Book(String title, int ISBN) {
		this(title, "Anonymous", ISBN);
		System.out.println("2�� ���ڰ� ���� �� ����");
	}
	public Book() {
		this(null, null, 0);
		System.out.println("�����ڰ� ȣ��Ǿ���");
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public static void main(String[] args) {
		Book javaBook = new Book("Java JDK","Ȳ����",3333);
		Book holyBible = new Book("Holy Bible", 1111);
		Book emptyBook = new Book();

		disp(javaBook, 0);
		System.out.println();
		//�ʱⰪ �ְ� ���
		javaBook.setTitle("�̰��� �ڹٴ�");
		javaBook.setAuthor("�ſ��");
		javaBook.setISBN(4444);
		disp(javaBook, 1);
//		System.out.println();
//		javaBook = new Book();
//		disp(javaBook, 0);
		System.out.println();
		disp(holyBible, 1);
		System.out.println();
		disp(emptyBook, 0);		
	}

	public static void disp(Book javaBook, int n) {
		if(n==0) {
			System.out.println("å ���� : "+javaBook.title);
			System.out.println("å ���� : "+javaBook.author);
			System.out.println("���ڵ�  : "+javaBook.ISBN);
		} else {
			System.out.println("å ���� : "+javaBook.getTitle());
			System.out.println("å ���� : "+javaBook.getAuthor());
			System.out.println("���ڵ�  : "+javaBook.getISBN());
		}
	}
}
