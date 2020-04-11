
public class ArrayInArrayExample {

	public static void main(String[] args) {
		int i,j;
		
		int[][] mathScores = new int[2][3];
		for(i=0;i<mathScores.length;i++) {
			for(j=0;j<mathScores[i].length;j++) {
				System.out.println("mathScores["+i+"]["+j+"]="+mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] =new int[2];
		englishScores[1] =new int[3];
		for(i=0;i<englishScores.length;i++) {
			for(j=0;j<englishScores[i].length;j++) {
				System.out.println("englishScores["+i+"]["+j+"]="+englishScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95,80},{92,96,80}};
//		for(i=0;i<javaScores.length;i++) {
//			for(j=0;j<javaScores[i].length;j++) {
//				System.out.println("javaScores["+i+"]["+j+"]="+javaScores[i][j]);
//			}
//		}
		i=0; j=0;
		for(int[] a : javaScores) {
			for(int b : a) {
				System.out.printf("javaScores[%d][%d]=%d\n",i,j,b);
				j++;
			}
			i++; j=0;
		}

	}
}
