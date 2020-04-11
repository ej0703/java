
public class ArithmeticOperationExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = "+result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 = "+result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = "+result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 = "+result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 = "+result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("result6 = "+result6);
		
		double result7 = (double) (v1 / v2); //몫을 정수값으로 구하고 실수로 변경 후 저장
		System.out.println("result7 = "+result7);
		
		double result8 = v1 / v2; //몫을 정수값으로 구하고 실수로 변경
		System.out.println("result8 = "+result8);
	}

}
