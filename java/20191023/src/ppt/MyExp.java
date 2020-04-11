package ppt;

public class MyExp {
	int base;
	int exp;
	
	int getValue() {
		int res =1;
		for(int i=0;i<exp;i++) {
			res *=base;
		}
		return res;
	}
	
	public static void main(String[] args) {
		MyExp num1 = new MyExp();
		num1.base = 2;
		num1.exp = 3;
		
		MyExp num2 = new MyExp();
		num2.base = 3;
		num2.exp = 4;
		
		System.out.println("2ÀÇ 3½Â = "+num1.getValue());
		System.out.println("3ÀÇ 4½Â = "+num2.getValue());
	}

}
