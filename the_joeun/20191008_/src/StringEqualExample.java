
public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = "�ſ��";
		String strVar2 = "�ſ��";
		String strVar3 = new String("�ſ��");
		
		System.out.println(strVar1 == strVar2); // �⺻������ �� ��
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //���� ��, ������
		System.out.println(strVar1.equals(strVar3));
		
		//hashcode �� ���
		System.out.println();
		System.out.println(strVar1.hashCode());
		System.out.println(strVar2.hashCode());
		System.out.println(strVar3.hashCode());
		
		//object �ּ� ���
		StringEqualExample ex1 = new StringEqualExample();
		StringEqualExample ex2 = new StringEqualExample();
		System.out.println(); //== and equal() �� �� �ּ� ��
		System.out.println(ex1 == ex2);
		System.out.println(ex1.equals(ex2));
	}

}
