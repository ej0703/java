package ex;
/*Ű����� ���ڸ� �Է¹޾�
  �Է¹��� ������ 2�� �������, 3�� �������,
  2�� 3�� �������, 2�� 3�� ����� �ƴ��� �Ǻ��Ͻÿ�.
  ����)
  ������ ���� : 8
  8-->2�� ���
  ������ ���� : 9
  9-->3�� ���
  ������ ���� : 8
  6-->2�� 3�� ���*/
 
import java.util.Scanner;;

public class ex6_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;

		while(true) {
			System.out.print("������ ���� : ");
			num = scan.nextInt();

			if(num<0) break;

			if(num%2==0) {
				System.out.println(num+"--> 2�� ���");
			} else if(num%3==0) {
				System.out.println(num+"--> 3�� ���");
			} else if((num%2==0)&&(num%3==0)) {
				System.out.println(num+"--> 2�� 3�� ���");
			} else {
				System.out.println(num+"--> 2 �Ǵ� 3�� ����� �ƴմϴ�");
			}
		}
		System.out.print("\n���α׷� ����");
		scan.close();
	}

}
