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
/* �⺻ �뷮 10, �ε��� 0 ������(�뷮,������)
 * ? : ������ ��� ���� ���� �� �ִ� ���ʸ� Ÿ��, �˷����� ���� Ÿ���� �ǹ�
 * <?> : ��ü ������ ��� ������ Ÿ���� Object�� �ν�
 * <? super ��ü�ڷ���> : �θ���(��ü�ڷ����� ���� ��ü���� ��ġ�� �ǹ�)
 * <? extends ��ü�ڷ���> : �ڽ�(��ӹ޴� ���� ��ü���� ��ġ�� �ǹ�) 
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
