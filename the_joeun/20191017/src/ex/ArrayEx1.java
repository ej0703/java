package ex;

public class ArrayEx1 {

	public static void main(String[] args) {
//		char[] ch; //������ �迭 ����
//		ch = new char[4]; //�迭 �޸� �Ҵ�, \u0000�� �ʱ�ȭ��
		
		//�迭�� ���� �Ҵ�(����)
//		ch[0]='J';
//		ch[1]='A';
//		ch[2]='V';
//		ch[3]='A';
		
		//����, �޸��Ҵ�, �ʱ�ȭ
		char[] ch = {'J','A','V','A'};
		
		//�迭 �� ���, �⺻�������� ���
		for(int i=0;i<ch.length;i++) {
			System.out.printf("ch[%d] = %c\n", i, ch[i]);
		}
		
		//���� for������ ��� == for each���̶� Ī��
		//������ �� �迭�̰ų� ��ü������ ���� for�� ���
		//��üŸ�� ��ü���� : ��ü����
		for(char c : ch) {
			System.out.println("c : "+c);
		}

	}

}
