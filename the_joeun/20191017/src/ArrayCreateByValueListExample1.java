
public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83,90,87};

		int sum =pr(scores);

		/*int sum=0;		
		for(int i : scores) {
			sum+=i;
		}*/
		System.out.println("���� = "+sum);
		double avg = (double)sum /3;
		System.out.println("��� = "+avg);		
	}
	
	public static int pr(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++) {
			System.out.printf("scores[%d] = %d\n", i, a[i]);
			s+=a[i];
		}
		return s;
	}
	//�޼ҵ� ���� == �޼ҵ� ���� == prototype == ����Ű�
	/*���������� ������ ��ȯ�� �޼ҵ��(�Ű�����Ÿ�� ������) {
	 * 	ó���� ����
	 * 	��ȯ���� void�� return�� ����
	 * 	return ��� �ϴ°� }
	 * 	��ȯ���� int�� return ������ ===> ��������=�޼ҵ��(�Ű�������)
	 * 	��ȯ���� int[] return �迭�� ==> int[] ������=�޼ҵ��(�Ű�������)
	 * }
	 */
}
