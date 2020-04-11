
public class forDot {

	public static void main(String[] args) {
		int col=5, row=5;
		int i,j;
		int count=0;


		for(i=1;i<=col;i++) {
			for(j=0;j<row;j++) {
				if(i == 2) {
					System.out.printf("         ");
					if(j==4) {
						System.out.printf("¢Ï");
					}
				} else if(i == 4) {
					System.out.printf("   ¡Ú");
					break;
				} else {
					count++;
					System.out.printf(" %2d ", count);
				}
			}
			System.out.printf("\n");
		}
	}

}
