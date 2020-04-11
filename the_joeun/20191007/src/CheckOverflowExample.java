
public class CheckOverflowExample {

	public static void main(String[] args) {
		try {//에러 검사 //에러 없으면 try문 안에 내용 수행, 에러가 있으면 catch문 수행
			int result = safeAdd(2000000000,2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없습니다.");
		}
	}

	public static int safeAdd(int left, int right) {
		if ((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left+right;
	}

}
