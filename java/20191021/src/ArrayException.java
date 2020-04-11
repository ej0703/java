

public class ArrayException {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0]=0;
		
		try {
			for (int i=0;i<5;i++) {
				intArray[i] = i+1+intArray[i];
				System.out.println("intArray["+i+"]"+intArray[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("배열의 인덱스가 범위를 넘어갔습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}

	}

}
