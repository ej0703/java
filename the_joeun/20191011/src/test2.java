import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("\\s|-");
		//warning ������ ���� ��� �и��ؼ� ����ϸ� ������ ����,,,?
		//Scanner scan = new Scanner(System.in);
		//scan.useDelimiter("\\s|,");
				
		int former, latter;
		
		System.out.printf("�ֹι�ȣ�� �Է��Ͻÿ�[-����] : ");
		former = scan.nextInt();
		latter = scan.nextInt();
		System.out.printf("�ֹι�ȣ ���ڸ��� %d\n�ֹι�ȣ ���ڸ��� %d", former, latter);
		scan.close();
	}

}
