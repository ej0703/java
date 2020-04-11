
public class FloatDoubleExample {
	public static void main (String[] args) {
		double var1 = 3.14;
		//float var2 = 3.14; ->컴파일에러
		float var3 = 3.14F;
		
		double var4 = 0.1234567890123456789; //소수점 아래 17
		float var5 = 0.1234567890123456789F; //소수점 아래 8
		//실수는 반올림, 정수는 버림
		
		System.out.println("var1:"+var1);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("var5:"+var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6:"+var6);
		System.out.println("var7:"+var7);
		System.out.println("var8:"+var8);
		System.out.println("var9:"+var9);
	}
}
