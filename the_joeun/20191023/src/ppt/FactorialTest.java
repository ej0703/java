package ppt;

public class FactorialTest {
	public static int factorial(int n) {
		int result=0;
		if(n==0)
			result = 1;
		else
			result = n*factorial(n-1); //recursive function
		
		return result;
	}
	
	public static void main(String[] args) {
		int result = factorial(5);
		
		System.out.println("5! = "+result);
	}

}
