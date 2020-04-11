package ex;

public class ex6_6 {

	public static void main(String[] args) {
		int i;
		int sum;
		
		sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.printf(" 1에서 10까지의 합 : %d\n", sum);
		
		sum=0;
		
		for(i=1;i<=10;i++) {
			sum += i;
		}
		System.out.printf(" 1에서 10까지의 합(반복문) : %d\n", sum);
	}

}
