package ex;

public class ex8_9 {

	public static void main(String[] args) {
		int[][] aa = { {1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}};
		int[][] bb=aa;
		System.out.println("bb�� aa�� ������? "+bb.hashCode()+","+aa.hashCode()+"->"+bb.equals(aa));
		
		System.out.println("aa[0][0]���� aa[2][3]���� ���");
		
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				System.out.printf("%3d ", aa[i][j]);
			}
			System.out.println();
		}
	}
}
