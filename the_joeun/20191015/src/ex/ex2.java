package ex;

public class ex2 {

	public static void main(String[] args) {
		int x  = 20, y = 23;
		
		System.out.printf("x=%d, y=%d\n",x,y);
		
		//���� �� ó��(����)
		x=x^y; //temp=x;
		y=y^x; //x = y;
		x=x^y; //y = temp;
		
		System.out.println("\n----------------x, y �� ���� �� ���");
		System.out.printf("x=%d, y=%d\n",x,y);

	}

}
