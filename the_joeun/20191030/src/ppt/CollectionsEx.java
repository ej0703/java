package ppt;
/* �÷���(Collection)Ư¡ ����
 * Set 				:�ߺ� ����, ���� /�ε��� ����
 * List 			:�ߺ����, ���� /�ε��� ����
 * Map(Key�� Value) 	:Ű-�ߺ� ����, ��-�ߺ� ��� /�ε��� ����, ����
 */
import java.util.*;

public class CollectionsEx {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		
		System.out.println("������-----------------");
		printList(myList);
		
		System.out.println("\n������-----------------");
		Collections.sort(myList);
		printList(myList);
		
		System.out.println("\n�̺а˻�-----------------");
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ")+1;
		System.out.println("�ƹ�Ÿ�� "+index+"��° ����Դϴ�.");
		
		System.out.println("\n���� ���-----------------");
		Collections.reverse(myList);
		printList(myList);
	}

	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String seperator;
			if(iterator.hasNext()) 
				seperator = "->";
			else
				seperator = "\n";
			System.out.print(e+seperator);
		}		
	}
}
