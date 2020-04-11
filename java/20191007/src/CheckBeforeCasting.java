
public class CheckBeforeCasting {

	public static void main(String[] args) {
	int i =128;
	
	if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
		System.out.println("Byte.MIN_VALUE="+Byte.MIN_VALUE);
		System.out.println("Byte.MAX_VALUE="+Byte.MAX_VALUE);
		System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("Integer.SIZE="+Integer.SIZE);
		System.out.println("Integer.TYPE="+Integer.TYPE);
		System.out.println("byte 타입으로 변환할 수 없습니다.");
		System.out.println("값을 확인해주세요.");
		//boolean은 size가 없으므로 최대 최소 없음
	}
	else {
		byte b =(byte) i;
		System.out.println(b);
	}
	}

}
