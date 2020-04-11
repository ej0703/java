
public class ex3 {
	public static void main(String[] args) {
		int i;
		int sum=0;
		
		for(i=1;i<=100;i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.printf("3의 배수의 합 : %d", sum);
	}
}
