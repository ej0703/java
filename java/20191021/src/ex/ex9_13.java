package ex;

public class ex9_13 {

	public static void main(String[] args) {
		int sum;
		
		ex9_13 ex = new ex9_13(); //non-static : 객체를 꼭 생성후에 접근
		sum = ex.plus(100,200); //ex9_13.plus(100,200); plus(100,200);
		
		System.out.printf("100과 200의 plus() 메소드 결과는 : %d\n", sum);
	}

	private int plus(int i, int j) {
		int result;
		result = i+j;
		return result;
	}

}
