

public class NumException {

	public static void main(String[] args) {
		String[] strnum = {"23","12","998","3.141592"};
		
		try {
			for(int i=0;i<strnum.length;i++) {
				int j = Integer.parseInt(strnum[i]);
				System.out.println("숫자로 변환된 값 : "+j);
			}
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("숫자로 변환 할 수 없습니다.");
		} 
	}

}
