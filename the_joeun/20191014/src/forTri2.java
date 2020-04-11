import java.util.Scanner;

public class forTri2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int col, row=1;
		int i,j;
		
		col = scan.nextInt();
			
		for(i=0;i<col;i++) {
			for(j=0;j<row;j++) {
				System.out.printf(" * ");
			}
			System.out.printf("\n");
			row++;
		}
		scan.close();
	}

}
