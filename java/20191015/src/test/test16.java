package test;

public class test16 {

	public static void main(String[] args) {
		
		for(int i=2;i<9;i+=3) { //������ ���� ���ڸ� ����, k���� ���ϰ� ��
			for(int j=1;j<=9;j++) { //������ ������ ����
				for(int k=i;k<=i+2;k++) { //3���� ��� ���� i~i+2����
					System.out.printf("%d*%d=%2d ", k, j, k*j);
				}
				System.out.print("\n"); //3�� ��� �� �� �ٲ�
			}
		}

	}

}
