package ex;

public class test12 {

	public static void main(String[] args) {
		int i,j;
		int sum, mul;
		
		for(i=1;i<=10;i++) {
			sum =0;
			mul=1;
			
			for(j=1;j<=i;j++) {
				sum +=j;
				mul *=j;
			}
			System.out.printf("%d %d %d\n", i, sum, mul);
		}

	}

}
