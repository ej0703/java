
public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.printf("%c - %c\n", upper, lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
	System.out.println("���α׷��� �����մϴ�.");
	}

}
