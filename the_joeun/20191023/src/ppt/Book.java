package ppt;

public class Book {
	String title;
	String author;
	int ISBN;

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("3개 인자가 갖는 값 생성");
	}
	public Book(String title, int ISBN) {
		this(title, "Anonymous", ISBN);
		System.out.println("2개 인자가 갖는 값 생성");
	}
	public Book() {
		this(null, null, 0);
		System.out.println("생성자가 호출되었음");
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
		Book javaBook = new Book("Java JDK","황기태",3333);
		Book holyBible = new Book("Holy Bible", 1111);
		Book emptyBook = new Book();

		disp(javaBook, 0);
		System.out.println();
		//초기값 넣고 출력
		javaBook.setTitle("이것이 자바다");
		javaBook.setAuthor("신용권");
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
			System.out.println("책 제목 : "+javaBook.title);
			System.out.println("책 저자 : "+javaBook.author);
			System.out.println("바코드  : "+javaBook.ISBN);
		} else {
			System.out.println("책 제목 : "+javaBook.getTitle());
			System.out.println("책 저자 : "+javaBook.getAuthor());
			System.out.println("바코드  : "+javaBook.getISBN());
		}
	}
}
