
public class StringEqualExample {

	public static void main(String[] args) {
		//동일한 문자열 리터럴로 생성된 객체를 참조 -> ==연산자 true
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 ==strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		//new 연산자로 String 객체를 별도로 생성 -> ==연산자 false
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 ==strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar4과 strVar4는 문자열이 같음");
		}
	}

}
