package ex;

public class ex9_4 {

	public static void main(String[] args) {
		String str = " Java�� �����ϴ� ��, Java�� ��վ��.^^ ";
		
		System.out.println("���ڿ� ==> "+str);
		
		System.out.print("���� ó�� ������ Java ��ġ ==> ");
		System.out.println(str.indexOf("Java"));
		System.out.print("�������� ������ Java ��ġ ==> ");
		System.out.println(str.lastIndexOf("Java"));
		System.out.println(str.substring(2,5)); //substring(a,b) -> a���� b-1������ ���ڿ� ����
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
	}

}
