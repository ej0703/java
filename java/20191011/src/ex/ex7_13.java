package ex;

public class ex7_13 {

	public static void main(String[] args) {
		int i;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum=0;
		
		for(i=num1;i<=num2;i++) {
			sum += i;
		}
		
		System.out.printf("���۰� : %d\n", num1);
		System.out.printf("���ᰪ : %d\n", num2);
		System.out.printf("�� >> %d", sum);
		
	}

}
