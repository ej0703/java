
public class test2 {

	public static void main(String[] args) {
		int result = 0;
		int i;
		
		for(i=1;i<=5;i++) {
			result = result + i;
			if(i==5) {
				System.out.print(i+"\n");
			} else {
			System.out.print(i+",");
			}
		}
		System.out.println("1~5гу? "+result);
	}

}
