
public class ArrayCreateByNewExamlple {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0;i<arr1.length;i++) {
			System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0;i<arr1.length;i++) {
			System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
		}
		System.out.println();
		
		double[] arr2 = new double[3];
		for(int i=0;i<arr2.length;i++) {
			System.out.printf("arr2[%d] = %.1f\n", i, arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0;i<arr2.length;i++) {
			System.out.printf("arr2[%d] = %.1f\n", i, arr2[i]);
		}
		System.out.println();
		
		String[] arr3 = new String[3];
		for(int i=0;i<(int)arr3.length;i++) {
			System.out.printf("arr3[%d] = %s\n", i, arr3[i]);
		}
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i=0;i<arr3.length;i++) {
			System.out.printf("arr3[%d] = %s\n", i, arr3[i]);
		}
	}
}
