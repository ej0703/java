package ex;
/* 스레드 활용 : main부터 실행되고 sub 실행
 * * Thread의 종류
 *   - User Thread : main의 종료와 상관없이 thread가 계속 실행됨 [setDemon(false)]와 같다.
 *   - Daemon Thread : main의 종료 시 thread 종료 [setDemon(true)]와 같다.
 * * Thread.activeConut(); //현재 실행중인 thread의 개수
 * * 스레드의 스케줄 방식
 *   - 선점형 스레드 스케줄링 방식 : 스레드의 우선권을 가지고 우선순위가 높은 스레드를 먼저 수행시키는 방식.
 *   - 비선점형 스레드 스케줄링 방식 : 실행중인 스레드가 CPU 사용권을 다른 스레드에게 넘길 때까지 기다리는 방식.
 * * JVM은 우선순위에 따른 선점형 스레드 스케줄링방식을 사용한다.
 * * 우선순위가 빠르다고 해서 먼저 수행되지 않는다.
 * * 작업량에 따라 결정됨. 우선순위는 참고일뿐
 * * 멀티 스레드가 수행될 때 어떤 스레드가 먼저 수행될지는 스레드 스케줄러가 결정하게 된다.
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
	//main이 먼저 수행 ts는 수행 준비하는 동안 main 실행
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
