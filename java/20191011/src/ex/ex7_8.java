package ex;

public class ex7_8 {

	public static void main(String[] args) {
		int i;
		int sum=0;

		for(i=1;i<100;i++) {
			sum +=i;
			if(sum == 55) {
				System.out.printf("���� %d �� �Ǿ� ���α׷��� �����մϴ�.\n", sum);
				break;
			}
		}

	}

}
