package ex;
//������ Ȱ�� : join()�� ȣ���� �����尡 ������ ������ ���� �����带 ��ٸ��� �ȴ�.

class MyRunnable2 implements Runnable {
	public void run() {
		System.out.println("run...");
		first();
	}

	private void first() {
		System.out.println("first...");
		second();
	}

	private void second() {
		System.out.println("second...");
	}
};//class end

public class JoinEx {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
		Runnable r = new MyRunnable2();
		Thread th = new Thread(r);
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end");
	}

}; //main class
