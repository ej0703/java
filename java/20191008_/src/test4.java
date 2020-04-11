import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		int java, oracle, web;
		int sum;
		double average;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("계산할 점수들을 입력하시오[자바, 오라클, 웹표준]\n자바   점수 : ");
		java = scan.nextInt();
		System.out.print("오라클 점수 : ");
		oracle = scan.nextInt();
		System.out.print("웹표준 점수 : ");
		web = scan.nextInt();
		
		sum = java + oracle + web;
		average = sum/4.0;
		System.out.println();
		System.out.println("자바   오라클   웹표준   총점    평균");
		System.out.println("-------------------------------");
		System.out.println(java+"   "+oracle+"    "+web+"    "+sum+"   "+average);
	
		scan.close();
	}

}
