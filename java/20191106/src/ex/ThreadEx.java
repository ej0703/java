package ex;

class ThreadSub extends Thread {
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
public class ThreadEx {

	public static void main(String[] args) {
		ThreadSub ts = new ThreadSub();
		ts.start();
	//main�� ���� ���� ts�� ���� �غ��ϴ� ���� main ����
		for(int i=0;i<60;i++) {
			System.out.println(i);
			try {
				Thread.sleep(150);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

} //main
