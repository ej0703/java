import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		int n=1;
		
		h.put(n++, "������");
		h.put(n++, "����");
		h.put(n++, "�ڿ뱸");
		h.put(n++, "������");
		h.put(n++, "���ع�");
		h.put(n++, "���Ѱ�");
		h.put(n++, "�����");
		h.put(n++, "����");
		h.put(n++, "������");
		h.put(n++, "��â��");
		h.put(n++, "�ӱ���");
		h.put(n++, "�����ѹ�");
		h.put(n++, "�����");
		h.put(n++, "����ȣ");
		h.put(n++, "�ִټ�");
		h.put(n++, "����ȣ");
		
		System.out.println("��ȣ   �̸�\n---------");
		Set<Integer> keys = h.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = h.get(key);
			System.out.printf("%2d  %s\n",key,value);
		}
	}
}
