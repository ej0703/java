package ex;

public class ex10_4 {

	public static void main(String[] args) {
		int a=100,b=0;
		int result;
		
		try {
			if(b==0) {
				throw new ArithmeticException("0���� ���������? �ȵ˴ϴ�.");
			}
			result =a/b;
		} catch (ArithmeticException e) {
			System.out.print("�߻� ���� ==> ");
			System.out.println(e.getMessage());
		}
	}

}
