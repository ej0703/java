package ex;

public class test10 {

	public static void main(String[] args) {
		int standard=2500000;
		double tax;
		
		tax = standard * 0.033;
		
		System.out.println("*** A의 월급 ***");
		System.out.println("기본급 : "+standard);
		System.out.println("세금 : "+(int)tax);
		System.out.println("월급 : " +(standard-(int)tax));
	}

}
