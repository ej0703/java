package ex;

public class ex6_6 {

	public static void main(String[] args) {
		int i;
		int sum;
		
		sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.printf(" 1���� 10������ �� : %d\n", sum);
		
		sum=0;
		
		for(i=1;i<=10;i++) {
			sum += i;
		}
		System.out.printf(" 1���� 10������ ��(�ݺ���) : %d\n", sum);
	}

}
