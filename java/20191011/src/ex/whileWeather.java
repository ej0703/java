package ex;

import java.util.Scanner;

public class whileWeather {

	public static void main(String[] args) {
		int month;
		
		while(true) {
			Scanner scan = new Scanner(System.in);

			System.out.printf("���� �Է��ϼ���. ");
			month = scan.nextInt();

			if((2>=month && month>0) || month==12) {
				System.out.println("�ܿ�");
			} else if(2<month && month<=5) {
				System.out.println("��");
			} else if(5<month && month<=8) {
				System.out.println("����");
			} else if(8<month && month<=11) {
				System.out.println("����");
			}
			scan.close();
		}
	}

}
