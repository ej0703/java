package ppt;

import java.util.Vector;

class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class PointVectorEx {
/* 기본 용량 10, 인덱스 0 생성자(용량,증가값)
 * ? : 변수에 어떠한 값을 받을 수 있는 제너릭 타입, 알려지지 않은 타입을 의미
 * <?> : 객체 내부의 모든 제너익 타입은 Object로 인식
 * <? super 객체자료형> : 부모형(객체자료형의 상위 객체들을 배치를 의미)
 * <? extends 객체자료형> : 자식(상속받는 하위 객체들을 배치을 의미) 
 */
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();

		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));

		for(int i=0;i<v.size();i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}

}
