

public class tryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
			String str = "dkdkdk";
			System.out.println("�־��."+str.getClass().getMethods().toString());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()+"Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

}
