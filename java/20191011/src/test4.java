import java.util.Scanner;

public class test4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int count=0;
		
		System.out.printf("1~99 ������ ������ �Է��Ͻÿ�>> ");
		num = scan.nextInt();
		
		if((num/10 == 3) || (num/10 == 6) || (num/10 ==9)) {
			count ++;
		} else if ((num%10 == 3) || (num%10 == 6) || (num%10 ==9)) {
			count++;
		}
		
		if(count == 1) {
			System.out.println("�ڼ�¦!");
		} else if(count == 2) {
			System.out.println("�ڼ�¦¦!");
		}
		
		scan.close();
	}

}
