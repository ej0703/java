import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("\\s|-");
		//warning 원하지 않을 경우 분리해서 사용하면 되지만 굳이,,,?
		//Scanner scan = new Scanner(System.in);
		//scan.useDelimiter("\\s|,");
				
		int former, latter;
		
		System.out.printf("주민번호를 입력하시오[-포함] : ");
		former = scan.nextInt();
		latter = scan.nextInt();
		System.out.printf("주민번호 앞자리는 %d\n주민번호 뒷자리는 %d", former, latter);
		scan.close();
	}

}
