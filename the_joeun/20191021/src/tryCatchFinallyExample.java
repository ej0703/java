

public class tryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
			String str = "dkdkdk";
			System.out.println("있어요."+str.getClass().getMethods().toString());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()+"클래스가 존재하지 않습니다.");
		}
	}

}
