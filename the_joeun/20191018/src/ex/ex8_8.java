package ex;

public class ex8_8 {

	public static void main(String[] args) {
		int[][] aa =new int[3][4];
		int n=1;

		//		for(int i=0;i<3;i++) {
		//			for(int j=0;j<4;j++) {
		//				aa[i][j]=n;
		//				n++;
		//			}
		//		}
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				aa[i][j]=n;
				n++;
			}
		}

		//		for(int i=0;i<3;i++) {
		//			for(int j=0;j<4;j++) {
		//				System.out.printf("%3d ", aa[i][j]);
		//			}
		//			System.out.println();
		//		}

		for(int[] arr : aa) {
			for(int i : arr) {
				System.out.printf("%3d ", i);
			}
			System.out.println();
		}
	}


}
