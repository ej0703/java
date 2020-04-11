import java.util.Scanner;

public class InputEx5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int nai;
		String addr;
		String tel;
				
		System.out.print("이름 = ");
		name = scan.next(); //토큰 spacebar, enter, tap으로 구분
		//nextLine(); -> \n까지
		System.out.print("나이 = ");
		nai = scan.nextInt(); //나이 int로 읽어오기
		System.out.print("주소 = ");
		addr = scan.next(); //한줄 전체(\n)를 읽어오기
		System.out.print("전화번호 = ");
		tel = scan.next(); //한줄 전체(\n)를 읽어오기
		
		//결과 출력
		System.out.println(">>>>>> 결과출력 >>>>>>");
		System.out.println(name +"씨");
		System.out.println(nai +"세 네요.");
		System.out.println(addr +"에 사시는군요.");
		System.out.println(tel +"로 전화드리겠습니다.");
		scan.close();
	}

}
