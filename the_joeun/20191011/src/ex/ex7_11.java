package ex;

public class ex7_11 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		int sum2=0;
		
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				sum2 +=i;
				continue;
			}			
			sum +=i;
		}
		System.out.printf("1~100������ ��(Ȧ����) : %d\n1~100������ ��(¦����) : %d", sum, sum2);
	}
}
