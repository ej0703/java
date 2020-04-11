package ppt;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStructor {

	public static void main(String[] args) {
		// Queue ��ü ����
		Queue<Object> myQueue = new LinkedList<Object>();
		
		String str1 = "1-aaa";
		String str2 = "2-aaa";
		String str3 = "3-aaa";
		String str4 = "4-aaa";
		
		//myQueue��� ť �ڷᱸ���� ������ �߰�
		myQueue.offer(str1);
		myQueue.offer(str2);
		myQueue.offer(str3);
		myQueue.offer(str4);
		
		System.out.println("��1 : "+myQueue.element());
		System.out.println("��2 : "+myQueue.element());
		System.out.println();
		
		String val;
		//peek() : ť�� head��ҹ�ȯ, ���� ����
		//		      ť�� empty �� ���, null�� ��ȯ
		while(myQueue.peek() != null) {
			//poll() :ť�� head��� ��ȯ, ����
			//        ť�� empty�� ��� null ��ȯ
			val = (String)myQueue.poll();
			System.out.println("�� : "+val);
		}
		
//		System.out.println("---2.�ٸ� ���---");
//		while(true) {
//			val=(String)myQueue.poll();
//			if(val==null)
//				break;
//			else
//				System.out.println("�� : "+val);
//		}
//		
//		System.out.println("---3.�ٸ� ���---");
//		while(!myQueue.isEmpty()) {
//			val = (String)myQueue.poll();
//			System.out.println("�� : "+val);
//		}
	}

}
