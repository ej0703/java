package ppt;
/* - System, Class, Runtime
 *  ǥ�� ������� ����, �ý��� ���ݿ� ��ġ ��� �Ѵ�.
 * - �ֿ�޼���
 *  System.in.read()
 *  System.out.print()
 *  System.currentTimeMillis() //����ð�
 *  System.exit(int status) //�ý��� ����
 *  System.gc() //������ �÷��� ȣ��
 * - ���� �ý����� ȯ��Ӽ�
 *  System.getProperty(String key);
 *  key : "os.name", "java.version"....
 */
public class SystemEx {

	public static void main(String[] args) {
		long startLoopTime = System.currentTimeMillis();
		for(int i=0;i<100_000_000;i++) {
			for(int j=0;j<100_000;j++) {
				int k = i+j;
			}
		} //for end
		long ttime=System.currentTimeMillis()-startLoopTime;
		
		System.out.println("�ҿ�ð� = "+ttime);
		
		byte[] buffer = new byte[255];
		System.out.print("\n Type a line of test : ");
		try {
			System.in.read(buffer,0,255);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(new String(buffer));
	}

}
