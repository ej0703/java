
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
		System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
		System.out.println("���� Ȯ�����ּ���.");
		//boolean�� size�� �����Ƿ� �ִ� �ּ� ����
	}
	else {
		byte b =(byte) i;
		System.out.println(b);
	}
	}

}
