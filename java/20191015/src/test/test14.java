package test;

public class test14 {

	public static void main(String[] args) {
		int alp=65; //�빮�� 'A'�� �ƽ�Ű�ڵ� 65
		
		do {
			System.out.print((char)alp+" "); //int���̹Ƿ� ���ĺ� ������� char ��ȯ
			
			if(alp%7==1) //���� 7�� �Է� �� �ٹٲ�
				System.out.print("\n");
			
			alp++; //���ĺ� �ϳ��� ����
		} while(alp<=90); //�빮�� 'Z'�� �ƽ�Ű�ڵ� 90, ��� ����

	}

}
