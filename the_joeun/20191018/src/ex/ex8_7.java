package ex;

public class ex8_7 {

	public static void main(String[] args) {
		int[][]aa = new int[3][4];
		
		aa[0][0]=1;aa[0][1]=2;aa[0][2]=3;aa[0][3]=4;
		aa[1][0]=5;aa[1][1]=6;aa[1][2]=7;aa[1][3]=8;
		aa[2][0]=9;aa[2][1]=10;aa[2][2]=11;aa[2][3]=12;
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력");
		
//		System.out.printf("%3d %3d %3d %3d\n", aa[0][0],aa[0][1],aa[0][2],aa[0][3]);
//		System.out.printf("%3d %3d %3d %3d\n", aa[1][0],aa[1][1],aa[1][2],aa[1][3]);
//		System.out.printf("%3d %3d %3d %3d\n", aa[2][0],aa[2][1],aa[2][2],aa[2][3]);
		
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				System.out.printf("%3d ", aa[i][j]);
			}
			System.out.printf("\n");
		}
	}
	//배열.length == 전체 행의 길이
	//배열[0].length == 0행의 열의 길이
}
