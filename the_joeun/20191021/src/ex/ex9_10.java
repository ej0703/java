package ex;

import java.util.Scanner;

public class ex9_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffee;

		System.out.printf("어떤 커피를 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
		coffee = scan.nextInt();

		ex9_10 ex = new ex9_10(); // 메서드명에 static이 없는 경우
		ex.coffee_machine(coffee);
		
		System.out.println("손님~ 커피 여기 있습니다.\n");
		scan.close();
	}

	private int coffee_machine(int coffee) { //가변적인 것들은 static 안 하는게 더 좋음
		System.out.printf("\n# 1. (자동으로)뜨거운 물을 준비한다.\n");
		System.out.printf("# 2. (자동으로)종이컵을 준비한다.\n");

		switch(coffee) {
		case 1:
			System.out.printf("# 3. (자동으로)보통커피를 탄다.\n"); break;
		case 2:
			System.out.printf("# 3. (자동으로)설탕커피를 탄다.\n"); break;
		case 3:
			System.out.printf("# 3. (자동으로)블랙커피를 탄다.\n"); break;
		default :
			System.out.printf("# 3. (자동으로)아무 커피나 탄다.\n"); 	break;
		}		
		System.out.printf("# 4. (자동으로)물을 붓는다.\n");
		System.out.printf("# 5. (자동으로)스푼으로 저어서 녹인다.\n\n");
		
		return 0;
	}
	
}
