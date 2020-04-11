package ex;
/* - �������� ���� �ֱ�
 * ������� Thread ��ü�� �����Ǹ� �����ֱ⸦ ���� �Ǵµ� ũ�� 5������ ������.
 * 1. new - �����尡 ������� ����
 * 2. Runnable - ����� ��ü�� ������ �Ŀ� start() �޼ҵ带 ȣ���ϸ� Runnable���·� �̵��ϰ� �ȴ�.
 * 3. Running -  Runnable ���¿��� ������ �����ٷ��� ���� Running���·� �̵�.
 * 4. Blocked - �����尡 �ٸ� Ư���� ������ Running���¿��� Blocked���·� �̵�.
 * 5. Dead -  �����尡 ����Ǹ� �� ������� �ٽ� ������ �� ���� �ȴ�. 
 */

public class StringThreadEx extends Thread {
	public int[] temp;
	public StringThreadEx(String threadname) {
		super(threadname);
		temp = new int[10];
		for(int start=0;start<temp.length;start++) {
			temp[start] += start;
		}
	}
	
	public void run() {
		for(int start : temp) {
			try {
				sleep(1000);
			}catch (Exception e) {
				e.getStackTrace();
			}
			System.out.printf("������ �̸� : %s", currentThread().getName());
			System.out.printf("temp value : %d\n", start);
		}
	}
	
	public static void main(String[] args) {
		StringThreadEx st = new StringThreadEx("ù��°");
		st.start();
	}

}
