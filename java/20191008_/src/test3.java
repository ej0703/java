import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		int num1, num2;
		int h=0, m=0, s;
		
		
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt(); //int �Է� ���� �� nextInt() ���
		
		num2 = num1;
		
		//s = num % 60; //�ش� ���ڸ� 60���� ���� �������� ��
		//m = (num/60) %60; //�ʿ� �ش��ϴ� ���ڸ� ���� �� �� 60���� ���� �������� ��
		//h = (num/60) /60; //�ش� ���ڸ� 3600(60��*60��)�� ���� ���� �ð�
		
		while(true) {
			if(num1<60) {s = num1; break;}
			num1 = num1 - 60;
			if(m>=60) {
				h++;
				m=0;
			} else {
				m++;
			}			
		}
		
		System.out.print(num2+"�ʴ� "+h+"�ð�,"+m+"��,"+s+"�� �Դϴ�.");
		scan.close();
	}

}
