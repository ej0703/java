package test;

public class test1 {

	public static void main(String[] args) {
		int[] month = {2,5,5,1,3,6,1,4,0,2,5,0}; //�޷� ���� ��¥ ���� ����
		int[] end = {31,28,31,30,31,30,31,31,30,31,30,31}; //��¥��

		for(int i=0;i<month.length;i++) {
			System.out.printf(" <    2019�� %2d��     >\n",i+1);
			System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");
			
			for(int k=0;k<month[i];k++) { //���� ���
				System.out.printf("   ");
			}
			for(int j=1;j<=end[i];j++) { //��¥ ���
				System.out.printf("%3d",j);
				
				if((month[i]+j)%7==0) {
					System.out.println();
				}
			}
			System.out.print("\n\n");
		}
	}
}