
public class calender {

	public static void main(String[] args) {
		int i, j;
		int day=1;
		
		for(i=0;i<6;i++) {
			if(i==0) {
				System.out.println("Mon Tue Wed Thu Fri Sat Sun");
				continue;
			}
			for(j=0;j<7;j++) {
				if(((j==0)||(j==1))&&(i==1)) {
					System.out.printf("    ");
				} else {
					System.out.printf(" %2d ", day);
					day++;
				}
				
				if(day>31) break;
			}
			System.out.printf("\n");
		}
	}

}
