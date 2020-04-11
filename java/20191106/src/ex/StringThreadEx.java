package ex;
/* - 스레드의 생명 주기
 * 스레드는 Thread 객체가 생성되면 생명주기를 갖게 되는데 크게 5가지로 나눈다.
 * 1. new - 스레드가 만들어진 상태
 * 2. Runnable - 스페드 객체가 생성된 후에 start() 메소드를 호출하면 Runnable상태로 이동하게 된다.
 * 3. Running -  Runnable 상태에서 스레드 스케줄러에 의해 Running상태로 이동.
 * 4. Blocked - 스레드가 다른 특정한 이유로 Running상태에서 Blocked상태로 이동.
 * 5. Dead -  스레드가 종료되면 그 스레드는 다시 시작할 수 없게 된다. 
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
			System.out.printf("스레드 이름 : %s", currentThread().getName());
			System.out.printf("temp value : %d\n", start);
		}
	}
	
	public static void main(String[] args) {
		StringThreadEx st = new StringThreadEx("첫번째");
		st.start();
	}

}
