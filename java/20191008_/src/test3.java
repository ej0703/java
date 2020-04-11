import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		int num1, num2;
		int h=0, m=0, s;
		
		
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt(); //int 입력 받을 때 nextInt() 사용
		
		num2 = num1;
		
		//s = num % 60; //해당 숫자를 60으로 나눈 나머지가 초
		//m = (num/60) %60; //초에 해당하는 숫자를 제외 한 후 60으로 나눈 나머지가 분
		//h = (num/60) /60; //해당 숫자를 3600(60분*60초)로 나눈 몫이 시간
		
		while(true) {
			if(num1<60) {s = num1; break;}
			num1 = num1 - 60;
			if(m>=60) {
				h++;
				m=0;
			} else {
				m++;
			}			
		}
		
		System.out.print(num2+"초는 "+h+"시간,"+m+"분,"+s+"초 입니다.");
		scan.close();
	}

}
