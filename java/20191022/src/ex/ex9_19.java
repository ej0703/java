package ex;

class myChar {
	char x;
	char y;
}

public class ex9_19 {
	
	public static void main(String[] args) {
		char x = 'A', y = 'Z';
		System.out.printf("���� ��\t    : x=%c, y=%c\n", x, y);
		func1(x,y);
		System.out.printf("���� ������ �� : x=%c, y=%c\n\n", x, y);

		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("���� ��\t    : x=%c, y=%c\n", ch.x, ch.y);
		func2(ch);
		System.out.printf("�ּ� ������ �� : x=%c, y=%c\n\n", ch.x, ch.y);
	}

	//�Ű������� ���� �޼ҵ�
	static void func1(char a, char b) {
		char temp;
		temp = a;
		a = b;
		b = temp;
	}
	
	//�Ű������� �ּ��� �޼ҵ�	
	static void func2(myChar c) {
		char temp;
		temp = c.x;
		c.x = c.y;
		c.y = temp;
	}

}
