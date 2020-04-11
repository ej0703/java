package ex;

import java.awt.*;
import javax.swing.*;
/* 동기화 : 여러명이 접근하는 것을 방지하기 위한 방법
 * 	임계영역 : 멀티스레드에 의해 공유자원이 참조될 수 있는 코드의 범위를 말한다.
 * 	멀티 스레드 프로그램에서 임계영역을 처리하는 경우 심각한 문제가 발생할 수 있다.
 * 	이러한 상황을 해결할 수 있는 방법이 동기화를 이용하는 것이다.
 * 	동기화를 처리하기 위해 모든 객체 락(Lock)을 포함시킨다.
 * 	Lock : 공유 객체에 여러 스레드가 동시에 접근하지 못하도록 하기 위한 것으로 모든 객체가 힙 영역에 생성될 때 자동으로 만들어진다.
 * 		 * 잘못 동기화 시키면 DEAD LOCK에 걸림
 *  동기화 방법
 * //메소드기반 : 될 수 있으면 사용하지 마세요.속도 떨어짐
 *   - public synchronized void synchronizedEx() {
 *    		//임계영역 코딩
 *     }
 * 	
 * //동기화 기준을 다양화 할 수 있다.
 * 	 - public void nomalMethod() {
 * 		//this : 동기화의 대상을 알리는 용도로 사용
 * 		//메소드가 호풍된 인스턴스 자신의 열쇠(synchronized)를 대상으로 동기화를 진행하는 문장
 * 		synchronized(동기화할 객체, 클래스명) {
 * 			//임계영역 코딩
 * 		}
 * 	}
 *  * DEAD LOCK(교착 상태)
 *  * 두개이상의 스레드가 만족하지 못하는 상태로 계속 기다릴때 발생한다. 
 */
class FlickeringLabel extends JLabel implements Runnable {
	public FlickeringLabel(String text) {
		super(text);
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		int n=0;
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n=1;
			else n=0;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("깜빡");
		
		JLabel label = new JLabel("안깜빡");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡");
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
