package ex;

public class ex8_6 {

	public static void main(String[] args) {
		int[] aa = {10,20,30,40,50};
		int count, size;
		
		count = aa.length;
		size = aa.length*Integer.BYTES;
		
		
		System.out.printf("�迭 aa[]�� ����� ������ %d�� �Դϴ�.\n", count);
		System.out.printf("�迭 aa[]�� ����� ��ü ũ��� %d����Ʈ �Դϴ�.", size);

	}

}
