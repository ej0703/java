package ex;
//wait(), notify() Ȱ�� : �̹� ���� ���� �Ծ������?

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
						this.wait(); //���ﶧ���� ���
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					this.notify(); //���� ������ ����
				}
			}
		}
	};//run()

	public void withDraw(long howMuch) {
		if(getDepositeMoney()>0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.printf("�ܾ� : %d�� \n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.printf("�ܾ��� �����մϴ�.");
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
