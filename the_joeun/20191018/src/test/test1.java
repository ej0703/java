package test;

public class test1 {

	public static void main(String[] args) {
		int n=0;
		//��ü����, ��������, ���۷��� ����, �ν��ٽ� ����
		int[][] arr = new int[4][]; //�� ���� ���۷��� �迭 ����
		arr[0] = new int[4];
		arr[1] = new int[1];
		arr[2] = new int[1];
		arr[3] = new int[4];
				
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = n++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
