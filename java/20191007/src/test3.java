import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int result=0;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		result = num1 + num2;
		System.out.println(result);
		scan.close();
	}

}
