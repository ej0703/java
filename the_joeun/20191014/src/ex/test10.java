package ex;

public class test10 {

	public static void main(String[] args) {
		int standard=2500000;
		double tax;
		
		tax = standard * 0.033;
		
		System.out.println("*** A�� ���� ***");
		System.out.println("�⺻�� : "+standard);
		System.out.println("���� : "+(int)tax);
		System.out.println("���� : " +(standard-(int)tax));
	}

}
