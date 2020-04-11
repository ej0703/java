package ex;

public class ex7_8 {

	public static void main(String[] args) {
		int i;
		int sum=0;

		for(i=1;i<100;i++) {
			sum +=i;
			if(sum == 55) {
				System.out.printf("합이 %d 가 되어 프로그램을 종료합니다.\n", sum);
				break;
			}
		}

	}

}
