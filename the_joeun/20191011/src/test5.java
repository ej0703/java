import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;

		while(true) {
			System.out.printf("������ �Է��Ͻÿ� >> ");
			year = scan.nextInt();

			if((year%4 == 0)&&(year%100 != 100)) {
				System.out.printf("%d���� �����Դϴ�.\n", year);
			} else if (year%400==0) {
				System.out.printf("%d���� �����Դϴ�.\n", year);
			} else {
				System.out.printf("%d���� ����Դϴ�.\n", year);
			}
			scan.close();
		}
	}

}
