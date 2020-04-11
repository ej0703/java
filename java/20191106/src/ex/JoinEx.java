package ex;
//스레드 활용 : join()를 호출한 스레드가 종료할 때까지 현재 스레드를 기다리게 된다.

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
