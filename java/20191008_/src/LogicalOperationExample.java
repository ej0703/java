
public class LogicalOperationExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode>=65)&(charCode<=90)) { //A~Z
			System.out.println("대문자이군요.");
		} else if((charCode>=97)&&(charCode<=122)) { //a~z
			System.out.println("소문자이군요.");
		} else if (!(charCode<48)&&!(charCode>57)) { //0~9
			System.out.println("0~9 숫자이군요.");
		}
		
		int value = 6;
		
		if((value%2==0)|(value%3==0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		if((value%2==0)||(value%3==0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}

	}

}
