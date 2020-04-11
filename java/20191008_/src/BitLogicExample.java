
public class BitLogicExample {

	public static void main(String[] args) {

		System.out.println("45 & 25 = "+ (45 & 25));
		System.out.println("45 | 25 = "+(45 | 25));
		System.out.println("45 ^ 25 = "+(45 ^ 25));
		System.out.println("~45 = "+~(45));
		System.out.println();
		System.out.println("45 이진수 = "+toBinaryString(45));
		System.out.println("25 이진수 = "+toBinaryString(25));
		System.out.println("45 & 25 = "+ toBinaryString(45 & 25));
		System.out.println("45 | 25 = "+toBinaryString(45 | 25));
		System.out.println("45 ^ 25 = "+toBinaryString(45 ^ 25));
		System.out.println("~45 = "+toBinaryString(~(45)));
	}

	private static String toBinaryString(int a) {
		String str = Integer.toBinaryString(a);
		while(str.length() < 32) {
			str = "0" +str;
		}
		return str;
	}

}
