import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price;
		
		System.out.printf("금액을 입력하시오>> ");
		price = scan.nextInt();
		
		System.out.printf("오만원권 %d개\n", price/50000);
		price = price%50000;
		System.out.printf("만원권 %d개\n", price/10000);
		price = price%10000;
		System.out.printf("천원권 %d개\n", price/1000);
		price = price%1000;
		System.out.printf("오백원 %d개\n", price/500);
		price = price%500;
		System.out.printf("백원 %d개\n", price/100);
		price = price%100;
		System.out.printf("오십원 %d개\n", price/50);
		price = price%50;
		System.out.printf("십원 %d개\n", price/10);
		scan.close();
	}

}
