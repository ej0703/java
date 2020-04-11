import java.util.Scanner;

public class teat1 {

	public static void main(String[] args) {
		int age;
		double weight;
		double height;
		
		Scanner scan = new Scanner(System.in); //scan 함수 하나만 생성할 것
		
		age = scan.nextInt();
		weight = scan.nextDouble();
		height = scan.nextDouble();
		
		System.out.println("당신의 나이는 "+age+"살 입니다.");
		System.out.println("당신의 체중은 "+weight+"kg 입니다.");
		System.out.println("당신의 신장은 "+height+"cm 입니다.");
		scan.close();
	}

}
