import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=0;
		double sum =0;
		int i=0;
		
		/*while((i=scan.nextInt()) !=0) {
			sum += i;
			n++;
		}*/
		
		while(true) {
			i = scan.nextInt();
			if(i == -1) break;

			sum += i;
			n++;
		}
		System.out.println("�Էµ� ���� ������ "+n+"���̸� ����� "+sum/n+"�Դϴ�.");
		scan.close();
	}

}
