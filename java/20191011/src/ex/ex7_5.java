package ex;

public class ex7_5 {

	public static void main(String[] args) {
		int a=100;
		
		while(a==200) {
			System.out.println("while문 내부에 들어왔습니다.");
		}
		
		do {
			System.out.println("do-while문 내부에 들어왔습니다.");	
		} while(a ==200);

	}

}
