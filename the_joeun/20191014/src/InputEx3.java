import java.io.*;
/*���ڿ� �Է¹ޱ�
 * InputStreamReader is = new InputStreamReader(System.in);
 * BufferedReader br = new BufferedReader(is);
 * name = br.readLine();
 */
public class InputEx3 {

	public static void main(String[] args) throws IOException {
		String name;
		String nai;
		String addr;
		String tel;
		//1����Ʈ->2����Ʈ�� ��ȯ
		InputStreamReader is = new InputStreamReader(System.in); //1�� ��Ʈ��
		
		//filterStream ����ϱ�
		BufferedReader br = new BufferedReader(is); //2�� ��Ʈ��
		
		System.out.print("�̸� = ");
		name = br.readLine(); //���� ��ü(\n)�� �о����
		System.out.print("���� = ");
		nai = br.readLine(); //���� ��ü(\n)�� �о����
		System.out.print("�ּ� = ");
		addr = br.readLine(); //���� ��ü(\n)�� �о����
		System.out.print("��ȭ��ȣ = ");
		tel = br.readLine(); //���� ��ü(\n)�� �о����
		
		//��� ���
		System.out.println(">>>>>> ������ >>>>>>");
		System.out.println(name +"��");
		System.out.println(nai +"�� �׿�.");
		System.out.println(addr +"�� ��ô±���.");
		System.out.println(tel +"�� ��ȭ�帮�ڽ��ϴ�.");
	}

}
