package ppt;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStructor {

	public static void main(String[] args) {
		// Queue 객체 생성
		Queue<Object> myQueue = new LinkedList<Object>();
		
		String str1 = "1-aaa";
		String str2 = "2-aaa";
		String str3 = "3-aaa";
		String str4 = "4-aaa";
		
		//myQueue라는 큐 자료구조에 데이터 추가
		myQueue.offer(str1);
		myQueue.offer(str2);
		myQueue.offer(str3);
		myQueue.offer(str4);
		
		System.out.println("값1 : "+myQueue.element());
		System.out.println("값2 : "+myQueue.element());
		System.out.println();
		
		String val;
		//peek() : 큐의 head요소반환, 제거 안함
		//		      큐가 empty 일 경우, null을 반환
		while(myQueue.peek() != null) {
			//poll() :큐가 head요소 반환, 제거
			//        큐가 empty일 경우 null 반환
			val = (String)myQueue.poll();
			System.out.println("값 : "+val);
		}
		
//		System.out.println("---2.다른 방법---");
//		while(true) {
//			val=(String)myQueue.poll();
//			if(val==null)
//				break;
//			else
//				System.out.println("값 : "+val);
//		}
//		
//		System.out.println("---3.다른 방법---");
//		while(!myQueue.isEmpty()) {
//			val = (String)myQueue.poll();
//			System.out.println("값 : "+val);
//		}
	}

}
