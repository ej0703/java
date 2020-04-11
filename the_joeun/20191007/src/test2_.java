
public class test2_ {

	public static void main(String[] args) {
		int result = 0;
		int i=1;
		
		while(true) {
			result = result + i;
		
			if(i==5) {
				System.out.print(i+"\n");
				break;
			} else {
			System.out.print(i+",");
			}
			
			i++;
		}
		
		System.out.println("1~5гу? "+result);
	}

}
