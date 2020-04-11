package ex;

public class StringRunnableEx implements Runnable {
	private int temp[];
	//������
	public StringRunnableEx() {
		temp = new int[10];	
		for(int i=0;i<temp.length;i++) {
			temp[i] +=i;
		}
	}	
	public void run() {
		for(int i:temp) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.getStackTrace();
			}
			System.out.printf("������ �̸� : %s", Thread.currentThread());
			System.out.printf("temp value : %d \n", i);
		}
	};
	public static void main(String[] args) {
		StringRunnableEx srt = new StringRunnableEx();
		Thread t = new Thread(srt, "ù��°");
		t.start();
	}



}
