package ex;

public class returnArray {

	public static void main(String[] args) {
		int[] intArray;
		//�޼ҵ带 ȣ���ϰ� �޼ҵ尡 ������ �迭�� �ּҰ��� ����.
		intArray=makeArray();
		
//		int sum=0;
		for(int i=0;i<intArray.length;i++) {
			System.out.printf("intArray[%d] =%d\n",i,intArray[i]);
//			sum+=intArray[i];
		}
//		System.out.println("�հ� : "+sum);
	}

	//�޼ҵ� ȣ��
	//���������� ������ ��ȯ�� �޼ҵ��(){ó���� ����};//�޼ҵ� ����
	static int[] makeArray() {
		int[] temp = new int[4];
		int sum=0;
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
			sum+=temp[i];
		}
		System.out.println("�հ� : "+sum);
		return temp;
	}

}
