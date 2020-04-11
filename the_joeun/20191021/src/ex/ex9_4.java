package ex;

public class ex9_4 {

	public static void main(String[] args) {
		String str = " Java를 공부하는 중, Java는 재밌어요.^^ ";
		
		System.out.println("문자열 ==> "+str);
		
		System.out.print("제일 처음 나오는 Java 위치 ==> ");
		System.out.println(str.indexOf("Java"));
		System.out.print("마지막에 나오는 Java 위치 ==> ");
		System.out.println(str.lastIndexOf("Java"));
		System.out.println(str.substring(2,5)); //substring(a,b) -> a부터 b-1까지의 문자열 찍음
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
	}

}
