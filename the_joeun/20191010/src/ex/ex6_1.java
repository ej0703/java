package ex;

public class ex6_1 {

	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�.^^");
		System.out.println("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�.^^");
		System.out.println("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�.^^");
		System.out.println("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�.^^");
		System.out.println("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�.^^");
		System.out.println(); //����, �ٿ��ֱ�
		
		int i;
		
		for(i=0;i<5;i++) { //for������ 5�� �ݺ�
			System.out.printf("%d : �ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�.^^\n", i);
		}
		
		System.out.println();
		
		for(i=5;i>0;i--) {
			System.out.printf("%d : �ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�.^^\n", i);	
		}
		
		System.out.println();
		
		i=0;
		
		while(i<5) { //while������ 5�� �ݺ�
			System.out.println("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�.^^");
			i++;
		}
	}

}
