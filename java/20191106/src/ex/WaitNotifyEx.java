package ex;
//wait(), notify() 활용 : 이번 돈은 누가 먹었을까요?

class ATMTwo implements Runnable {
	private long depositeMoney = 10000;
	public void run() {
		synchronized(this) {
			for(int i=0;i<10;i++) {
				if(getDepositeMoney()<=0) {
					break;
				}
				withDraw(1000);
				if((getDepositeMoney()==2000)||(getDepositeMoney()==6000)||(getDepositeMoney()==8000)) {
					try {
						this.wait(); //깨울때까지 대기
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					this.notify(); //현재 스레드 깨움
				}
			}
		}
	};//run()

	public void withDraw(long howMuch) {
		if(getDepositeMoney()>0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.printf("잔액 : %d원 \n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.printf("잔액이 부족합니다.");
		}
	};

	private long getDepositeMoney() {
		return depositeMoney;
	}
}; //class end

public class WaitNotifyEx {

	public static void main(String[] args) {
		ATMTwo atm = new ATMTwo();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();
	}
};//main end
