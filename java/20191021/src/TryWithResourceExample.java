

public class TryWithResourceExample {
	
	public static void main(String[] args) {
		//try(예외가 발생할 수 있는 조건이 들어감)
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}

}
