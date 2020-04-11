package ex;
/*키보드로 숫자를 입력받아
  입력받은 숫자의 2의 배수인지, 3의 배수인지,
  2와 3의 배수인지, 2와 3의 배수가 아닌지 판별하시오.
  실행)
  임의의 정수 : 8
  8-->2의 배수
  임의의 정수 : 9
  9-->3의 배수
  임의의 정수 : 8
  6-->2와 3의 배수*/
 
import java.util.Scanner;;

public class ex6_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;

		while(true) {
			System.out.print("임의의 정수 : ");
			num = scan.nextInt();

			if(num<0) break;

			if(num%2==0) {
				System.out.println(num+"--> 2의 배수");
			} else if(num%3==0) {
				System.out.println(num+"--> 3의 배수");
			} else if((num%2==0)&&(num%3==0)) {
				System.out.println(num+"--> 2와 3의 배수");
			} else {
				System.out.println(num+"--> 2 또는 3의 배수가 아닙니다");
			}
		}
		System.out.print("\n프로그램 종료");
		scan.close();
	}

}
