package ex;

public class test13 {

	public static void main(String[] args) {
		int i;
		int sum=0;

		for(i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.printf("+%d",i);
				sum +=i;
			} else {
				System.out.printf("-%d",i);
				sum -=i;
			}
		}
		System.out.printf("=%d", sum);
	}

}
