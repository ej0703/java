

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx2_1 {
	public static final String[] colors= {
			"검정", "노랑","초록","파랑","빨강","연두"
	};
	public static void main(String[] args) {
		int i;
		String str;
		
		//1.벡터 클래스 인스턴스 생성
		Vector<String> v = new Vector<String>();
		//2.for문을 이용해 배열값을 벡터에 저장하세요
		for(i=0;i<colors.length;i++) {
			v.add(colors[i]);
		}
		//3.추가하세요.'[추가]'를 추가하세요.
		System.out.print("색상 하나를 추가하세요 >> ");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		v.add(str);
		//4.fistElement()를 이용 첫번째 요소를 가져와서 출력하시오.
		System.out.println(v.firstElement());
		//5.get()를 이용해서 인덱스 0을 가져와서 '첫번째 요소 : 검정'이렇게 출력하시오.
		System.out.println("첫번째 요소 : "+v.get(0));
		//6.get()을 이용해서 인덱스 1을 가져와서 '두번째 요소 : 노랑'이렇게 출력하시오.
		System.out.println("두번째 요소 : "+v.get(1));
		//7.두번째 요소 가져와서, elementAt()사용 '두번째 요소 : 노랑'이렇게 출력하시오.
		System.out.println("두번째 요소 : "+v.elementAt(1));
		//8.마지막 요소 : [추가]를 가져와서 '마지막 요소 : [추가]'이렇게 출력하시오.
		System.out.println("마지막 요소 : "+v.elementAt(colors.length));
		//9.벡터에 있는 모두를 출력하시오. Iterator이용하시오.
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			String n = it.next();
			System.out.print(n+" ");
		}
		System.out.println();
		//9.1 9번에 있는 것을 for문 이용해서 출력하시오.
		for(i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}
		scan.close();
	}

}
