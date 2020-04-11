package ex;

import java.util.Scanner;

public class ex9_10_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffee;
		char customer='A';
		String ret;

		for(int i=0;i<3;i++) {
			System.out.printf("%c님, 어떤 커피를 드릴까요? (1:보통, 2:설탕, 3:블랙) ", customer);
			coffee = scan.nextInt();

			ex9_10_1 ex = new ex9_10_1(); // 메서드명에 static이 없는 경우
			ret = ex.coffee_machine(coffee);

			System.out.printf("%c님~ 커피 여기 있습니다. %s\n", customer++, ret);
			System.out.println("-----------------------------------------------");
		}
		scan.close();
	}

	private String coffee_machine(int coffee) { //가변적인 것들은 static 안 하는게 더 좋음
		System.out.printf("\n# 1. (자동으로)뜨거운 물을 준비한다.\n");
		System.out.printf("# 2. (자동으로)종이컵을 준비한다.\n");
		
		String str = "";

		switch(coffee) {
		case 1:str="보통커피 선택!!";
			System.out.printf("# 3. (자동으로)보통커피를 탄다.\n"); break;
		case 2:str="설탕커피 선택!!";
			System.out.printf("# 3. (자동으로)설탕커피를 탄다.\n"); break;
		case 3:str="블랙커피 선택!!";
			System.out.printf("# 3. (자동으로)블랙커피를 탄다.\n"); break;
		default :str="자동커피 선택!!";
			System.out.printf("# 3. (자동으로)아무 커피나 탄다.\n"); 	break;
		}		
		System.out.printf("# 4. (자동으로)물을 붓는다.\n");
		System.out.printf("# 5. (자동으로)스푼으로 저어서 녹인다.\n\n");

		return str;
	}

}
