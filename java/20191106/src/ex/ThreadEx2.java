package ex;
/* ������ Ȱ�� : main���� ����ǰ� sub ����
 * * Thread�� ����
 *   - User Thread : main�� ����� ������� thread�� ��� ����� [setDemon(false)]�� ����.
 *   - Daemon Thread : main�� ���� �� thread ���� [setDemon(true)]�� ����.
 * * Thread.activeConut(); //���� �������� thread�� ����
 * * �������� ������ ���
 *   - ������ ������ �����ٸ� ��� : �������� �켱���� ������ �켱������ ���� �����带 ���� �����Ű�� ���.
 *   - ������ ������ �����ٸ� ��� : �������� �����尡 CPU ������ �ٸ� �����忡�� �ѱ� ������ ��ٸ��� ���.
 * * JVM�� �켱������ ���� ������ ������ �����ٸ������ ����Ѵ�.
 * * �켱������ �����ٰ� �ؼ� ���� ������� �ʴ´�.
 * * �۾����� ���� ������. �켱������ �����ϻ�
 * * ��Ƽ �����尡 ����� �� � �����尡 ���� ��������� ������ �����ٷ��� �����ϰ� �ȴ�.
 */
class ThreadSub2 extends Thread {
	public void run() {
		for(char ch ='A';ch<='z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(150);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}; //class
public class ThreadEx2 {

	public static void main(String[] args) {
		ThreadSub2 ts = new ThreadSub2();
		System.out.println(Thread.currentThread().getName());
		
		ts.setDaemon(true);
		ts.start();
	//main�� ���� ���� ts�� ���� �غ��ϴ� ���� main ����
		for(int i=0;i<3;i++) {
			System.out.println(i);
			try {
				Thread.sleep(150);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

} //main
