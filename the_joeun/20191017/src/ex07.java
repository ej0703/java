import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max =0, n;
		int[] array;
		
		System.out.print("배열의 크기 : ");
		n = scan.nextInt();
		
		array = new int[n];
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
		}
		
		max = array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("Max = "+max);
		scan.close();
	}

}
