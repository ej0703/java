package ppt;
/* 컬레션(Collection)특징 정리
 * Set 				:중복 불허, 무순 /인덱스 없음
 * List 			:중복허용, 정렬 /인덱스 있음
 * Map(Key와 Value) 	:키-중복 불허, 값-중복 허용 /인덱스 없음, 무순
 */
import java.util.*;

public class CollectionsEx {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		System.out.println("정렬전-----------------");
		printList(myList);
		
		System.out.println("\n정렬후-----------------");
		Collections.sort(myList);
		printList(myList);
		
		System.out.println("\n이분검색-----------------");
		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+index+"번째 요소입니다.");
		
		System.out.println("\n역순 출력-----------------");
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
