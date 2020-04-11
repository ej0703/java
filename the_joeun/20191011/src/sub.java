/*
 * final
 - class : 상속불가(상속)
 - 필드, 변수 : 재할당불가, 값 고정시, 반드시 초기화
 - 메소드 : 재정의 불가(상속)
*/

//부모
class Super {
	public void disp() {
		
	}
}; //final 붙으면 상속 불가

public class sub extends Super {
	public static void main(String a[]) {
		
	}
	@Override
	public void disp() {
		
	}
}
