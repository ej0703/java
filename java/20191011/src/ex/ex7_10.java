package ex;

public class ex7_10 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i=1;i<=100;i++) {
			sum += i;
			if(sum>=1000) break;
			
		}
		
		System.out.printf("1~100�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ��? %d �Դϴ�.", i);
	}
}
