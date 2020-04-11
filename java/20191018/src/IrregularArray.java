
public class IrregularArray {

	public static void main(String[] args) {
		//int[][] intArray = {{2,2},{2,3},{3,4}}; //정방행렬
		//int[][] intArray = {{2},{2,3},{3,4,5}}; //비정방행렬
		int[][] intArray = new int[4][]; //각행의 레퍼런스 배열 생성
		intArray[0] = new int[3]; //0행의 3개의 정수 배열 생성
		intArray[1] = new int[2]; //1행의 2개의 정수 배열 생성
		intArray[2] = new int[3]; //2행의 3개의 정수 배열 생성
		intArray[3] = new int[2]; //3행의 2개의 정수 배열 생성

		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				intArray[i][j]=(i+1)*10+j;
			}
		}

		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
