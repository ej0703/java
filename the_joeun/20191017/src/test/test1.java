package test;

public class test1 {

	public static void main(String[] args) {
		String[] name;
		name = new String[] {"������", "����","�ڿ뱸","������","���ع�","���Ѱ�","�����","����","������","��â��","�ӱ���","�����ѹ�","�����","����ȣ","�ִټ�","����ȣ"};
		int count=1;
		
		System.out.println(" ���̽�&R��� ������ �÷��� ������ ���� ������");
		System.out.println("========================================");
		for(int i=0;i<name.length;i++) { //�⺻�� for��
			System.out.printf("   %2d.   %s\n",i+1,name[i]);
		}
		System.out.println("========================================");
		for(String s : name) { //���� for��
			System.out.printf("   %2d.   %s\n",count,s);
			count++;
		}
	}

}
