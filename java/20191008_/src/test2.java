import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		String str1 = "����";
		String str2 = "����";
		String answer; // scan ���� �亯�� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����� ������? [����/����] ");
		
		answer = scan.nextLine(); //String �Է� ������ nextLine() ���
		
		if(answer.equals(str1)) { //==�� �ƴ� equal ���
			System.out.println("����� ������ ���ں� �̱���.");
		} else if(answer.equals(str2)) {
			System.out.println("����� ��� ���ں� �̱���.");
		} else { // ����, ���ڰ� �ƴ� �ٸ� ���� �Է��Ͽ��� ��
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		scan.close();
	}
}
