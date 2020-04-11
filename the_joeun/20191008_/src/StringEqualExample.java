
public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = "신용권";
		String strVar2 = "신용권";
		String strVar3 = new String("신용권");
		
		System.out.println(strVar1 == strVar2); // 기본자형의 값 비교
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //값을 비교, 재정의
		System.out.println(strVar1.equals(strVar3));
		
		//hashcode 값 출력
		System.out.println();
		System.out.println(strVar1.hashCode());
		System.out.println(strVar2.hashCode());
		System.out.println(strVar3.hashCode());
		
		//object 주소 출력
		StringEqualExample ex1 = new StringEqualExample();
		StringEqualExample ex2 = new StringEqualExample();
		System.out.println(); //== and equal() 둘 다 주소 비교
		System.out.println(ex1 == ex2);
		System.out.println(ex1.equals(ex2));
	}

}
