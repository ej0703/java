import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		String str1 = "남자";
		String str2 = "여자";
		String answer; // scan 받은 답변을 받음
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 성별은? [남자/여자] ");
		
		answer = scan.nextLine(); //String 입력 받을때 nextLine() 사용
		
		if(answer.equals(str1)) { //==이 아닌 equal 사용
			System.out.println("당신은 씩씩한 남자분 이군요.");
		} else if(answer.equals(str2)) {
			System.out.println("당신은 어여쁜 여자분 이군요.");
		} else { // 남자, 여자가 아닌 다른 문자 입력하였을 때
			System.out.println("잘못 입력하셨습니다.");
		}
		scan.close();
	}
}
