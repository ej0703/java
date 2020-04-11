import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		int n=1;
		
		h.put(n++, "김지상");
		h.put(n++, "노희선");
		h.put(n++, "박용구");
		h.put(n++, "박주희");
		h.put(n++, "박준범");
		h.put(n++, "박한결");
		h.put(n++, "백우준");
		h.put(n++, "변명섭");
		h.put(n++, "이은지");
		h.put(n++, "이창윤");
		h.put(n++, "임규혁");
		h.put(n++, "제갈한범");
		h.put(n++, "허상훈");
		h.put(n++, "정충호");
		h.put(n++, "최다솔");
		h.put(n++, "유경호");
		
		System.out.println("번호   이름\n---------");
		Set<Integer> keys = h.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = h.get(key);
			System.out.printf("%2d  %s\n",key,value);
		}
	}
}
