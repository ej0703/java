

public class NullPointerException {

	public static void main(String[] args) {
		String data = null;
		
		try {
		System.out.println(data.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
