import java.io.*;

//���ڿ� (���ڸ��̻�) �Է¹ޱ�
/* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * String jumsu = br.readLine();
 * int kor = Integer.parseInt(jumsu); //��Ʈ���� ��ü�������� ��ȯ �� �ٽ� �⺻�� ������ ��ȯ
 */
public class InputEx4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat;
		double hap;
		
		System.out.print("���� = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� = ");
		mat = Integer.parseInt(br.readLine());
		
		hap = kor + eng + mat;
		
		System.out.printf("���� = %.1f", hap);
	}

}
