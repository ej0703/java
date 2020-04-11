package ex;

public class ArrayEx2 {
	enum Week {��,ȭ,��,��,��,��,��}; //������ ����� : class ������ ����
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		//String �迭 ����
		String name[] = {"���","����","ü��","�ٳ���","����"};
		int sum=0;
		
		//num�� ���� ����Ͻÿ�(���� for�� �̿��ؼ�)
		for(int i : num) {
			sum += i;
			System.out.print(i+" ");
		}
		System.out.println("�� = "+sum);
		
		//name�� ��ĭ�� �� ����Ͻÿ�(���� for�� �̿��ؼ�)
		for(String s : name) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//enumeration(enum) �������� ����� �ʿ��� �� ���
		//Week�� �ڷḦ ����ϱ�
		for(Week w : Week.values()) { 
			//�ڹ������Ϸ��� �ڵ����� ��� enum�� ���� static values()�޼��带 �����Ѵ�. (JVM�� �ڵ����� ������)
			System.out.print(w+"���� ");
		}
		
		Week w = Week.ȭ;
		System.out.println(w.name());
		System.out.println(w.ordinal());
		
		// enum ��ü ����
		Week day1 = Week.��;
		Week day2 = Week.��;
		System.out.println("1->2 = "+day1.compareTo(day2));
		System.out.println("2->1 = "+day2.compareTo(day1));
		Week weekDay = Week.valueOf("��");
		System.out.println("weekday = "+weekDay);
		
		Week[] wd = Week.values();
		for(int i=0;i<wd.length;i++) {
			System.out.print(wd[i]+"���� ");
		}
		System.out.println();
		for(Week wk : wd) {
			System.out.print(wk+"���� ");
		}
	}

}
