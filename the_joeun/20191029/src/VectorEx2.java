

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {
	public static final String[] colors= {
			"����", "���","�ʷ�","�Ķ�","����","����"
	};
	public static void main(String[] args) {
		int i;

		//1.���� Ŭ���� �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();
		//2.for���� �̿��� �迭���� ���Ϳ� �����ϼ���
		for(i=0;i<colors.length;i++) {
			v.add(colors[i]);
		}
		//3.�߰��ϼ���.'[�߰�]'�� �߰��ϼ���.
		v.add("[�߰�]");
		//4.fistElement()�� �̿� ù��° ��Ҹ� �����ͼ� ����Ͻÿ�.
		System.out.println(v.firstElement());
		//5.get()�� �̿��ؼ� �ε��� 0�� �����ͼ� 'ù��° ��� : ����'�̷��� ����Ͻÿ�.
		System.out.println("ù��° ��� : "+v.get(0));
		//6.get()�� �̿��ؼ� �ε��� 1�� �����ͼ� '�ι�° ��� : ���'�̷��� ����Ͻÿ�.
		System.out.println("�ι�° ��� : "+v.get(1));
		//7.�ι�° ��� �����ͼ�, elementAt()��� '�ι�° ��� : ���'�̷��� ����Ͻÿ�.
		System.out.println("�ι�° ��� : "+v.elementAt(1));
		//8.������ ��� : [�߰�]�� �����ͼ� '������ ��� : [�߰�]'�̷��� ����Ͻÿ�.
		System.out.println("������ ��� : "+v.elementAt(colors.length));
		//9.���Ϳ� �ִ� ��θ� ����Ͻÿ�. Iterator�̿��Ͻÿ�.
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			String n = it.next();
			System.out.print(n+" ");
		}
		System.out.println("\n------------for �̿�-------------");
		//9.1 9���� �ִ� ���� for�� �̿��ؼ� ����Ͻÿ�.
		for(i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}
	}

}
