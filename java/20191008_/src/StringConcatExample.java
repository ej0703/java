
public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; //3���� ������ ���ƿ�. ��, �ּҰ� ����.
		String str2 = str1 + "Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3+ 3.0;
		String str3_1 = "JDK" + 6.0; //�޸𸮸� ����Ű�� ���� �ƴ�
		String str3_2 = new String("JDK" + 6.0); //�޸� �Ҵ�		
		String str4 = 3 + 3.0 + "JDK";
		
		System.out.println(str3);
		System.out.println(str3_1.toString());
		System.out.println(str4);

		//hashcode ���
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str3_1.hashCode());
		System.out.println("...."+str3_2.hashCode());
		System.out.println(str4.hashCode());
		
		//object �ּ� ���
		StringConcatExample ex = new StringConcatExample();
		StringConcatExample ex2 = new StringConcatExample();
		System.out.println(ex.toString());
		System.out.println("...."+ex2.toString());
	}

}
