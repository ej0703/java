import java.util.Scanner;

public class test4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int count=0;
		
		System.out.printf("1~99 사이의 정수를 입력하시오>> ");
		num = scan.nextInt();
		
		if((num/10 == 3) || (num/10 == 6) || (num/10 ==9)) {
			count ++;
		} else if ((num%10 == 3) || (num%10 == 6) || (num%10 ==9)) {
			count++;
		}
		
		if(count == 1) {
			System.out.println("박수짝!");
		} else if(count == 2) {
			System.out.println("박수짝짝!");
		}
		
		scan.close();
	}

}
