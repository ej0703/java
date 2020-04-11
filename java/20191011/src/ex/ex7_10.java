package ex;

public class ex7_10 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i=1;i<=100;i++) {
			sum += i;
			if(sum>=1000) break;
			
		}
		
		System.out.printf("1~100의 합에서 최초로 1000이 넘는 위치는? %d 입니다.", i);
	}
}
