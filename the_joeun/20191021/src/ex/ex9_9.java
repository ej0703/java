package ex;

public class ex9_9 {

	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "Java Programing";
		String str3 = new String("Java Programing");
		
		System.out.println("�� ���ڿ�1 ==> ["+str1+"]");
		System.out.println("�� ���ڿ�2 ==> ["+str2+"]");
		System.out.println("�� ���ڿ�3 ==> ["+str3+"]");
		System.out.println(str1.hashCode()+", "+str2.hashCode()+", "+str3.hashCode());
		
		System.out.println("���ڿ�1==���ڿ�2 ��� :\t"+(str1==str2));
		System.out.println("���ڿ�1.equals(���ڿ�2) ��� :"+str1.equals(str2));
		System.out.println("���ڿ�1==���ڿ�3 ��� :\t"+(str1==str3));
		System.out.println("���ڿ�1.equals(���ڿ�3) ��� :"+str1.equals(str3));
	}

}
