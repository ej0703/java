package ex;

public class ex6_9 {

	public static void main(String[] args) {
		int sum=0;
		int i;
		
		for(i=501;i<1000;i+=2) {
			sum +=i;
			//System.out.printf("%d ", i);
		}
		System.out.printf("500���� 1000���� Ȧ���� �� : %d", sum);
	}
}
