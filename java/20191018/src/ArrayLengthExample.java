
public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		int[] copy = reArr(scores);
		
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
//			copy[scores.length-i-1] = scores[i];
		}
		
//		for(int i=0;i<scores.length;i++) {
//			System.out.printf("scores[%d] = %d\n", i, scores[i]);
//		}
//		System.out.println();
//		for(int i=0;i<copy.length;i++) {
//			System.out.printf("copy[%d] = %d\n", i, copy[i]);
//		}
		
		System.out.print("���� ���� : "); 
		disp(scores);
		System.out.print("\n�Ųٷ� �� : ");
		disp(copy);
		System.out.println("\n���� : "+sum);		
		double avg = (double) sum / scores.length;
		System.out.printf("��� : %.2f",avg);
	}
	
	public static int[] reArr(int[] a) {
		int[] copy = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			copy[a.length-i-1] = a[i];
		}
		return copy;
	}
	
	public static void disp(int[] b) {
		for(int i : b) {
			System.out.printf("%d ", i);
		}
	}
}
