package ppt4;

public class GoodClac extends Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public double averge(int[] a) {
		double sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		Calculator c = new GoodClac();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.averge(new int[] {2,3,4}));
	}

}
