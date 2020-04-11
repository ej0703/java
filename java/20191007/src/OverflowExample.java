
public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z1 = x *y;
		long z2 = (long) x*y;
		System.out.println(z1);
		System.out.println(z2);
	}

}
