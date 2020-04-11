
public class GarbageValueExample {
	public static void main(String[] args ) {
		byte var1 = 125;
		int var2 = 125;
		
		for(int i=0; i<5; i++) {
			var1++;//var1 = var1 + 1;
			var2++;
			System.out.println("var1:"+var1+"\t var2:"+var2);
			//+ 연결연산자 : 문자+문자, 문자+숫자, 숫자+문자
			//+ 산술연산자 : 숫자+숫자
		}
	}
}
