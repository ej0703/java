import java.util.Scanner;

public class InputEx5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int nai;
		String addr;
		String tel;
				
		System.out.print("�̸� = ");
		name = scan.next(); //��ū spacebar, enter, tap���� ����
		//nextLine(); -> \n����
		System.out.print("���� = ");
		nai = scan.nextInt(); //���� int�� �о����
		System.out.print("�ּ� = ");
		addr = scan.next(); //���� ��ü(\n)�� �о����
		System.out.print("��ȭ��ȣ = ");
		tel = scan.next(); //���� ��ü(\n)�� �о����
		
		//��� ���
		System.out.println(">>>>>> ������ >>>>>>");
		System.out.println(name +"��");
		System.out.println(nai +"�� �׿�.");
		System.out.println(addr +"�� ��ô±���.");
		System.out.println(tel +"�� ��ȭ�帮�ڽ��ϴ�.");
		scan.close();
	}

}
