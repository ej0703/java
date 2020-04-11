import java.util.Scanner;

public class forTri {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int col, row;
		int i,j;
		
		col = scan.nextInt();
		row = col;
		
		for(i=0;i<col;i++) {
			for(j=0;j<row;j++) {
				System.out.printf(" * ");
			}
			System.out.printf("\n");
			row--;
		}
		scan.close();
	}

}
