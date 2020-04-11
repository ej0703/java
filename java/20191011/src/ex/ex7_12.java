package ex;

public class ex7_12 {

	public static void main(String[] args) {
		int sum=0;
		int i;
		
		while(true) {
			for(i=0;i<=100;i++) {
				sum += i;
				
				if(sum>2000) {
					System.out.printf("%d\n", sum);
					sum = 0;
					break;
				}
			}
			System.out.println("아직도 반복중...");
		}

	}

}
