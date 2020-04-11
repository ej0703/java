package ppt4;

interface MobilePhone {
	public boolean sendCall();
	public boolean receiveCall();
	public boolean sendSMS();
	public boolean receiveSMS();
};
interface MP3 {
	public void play();
	public void stop();
};
class PDA {
	public int calculator(int x, int y) {
		return x+y;
	}
};

public class SmartPhone extends PDA
implements MobilePhone, MP3{

	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculator(30, 50));
		p.schedular();
	}

	private void schedular() {
		System.out.println("일정관리하기...");
	}

	@Override
	public void play() {
		System.out.println("음악 재생하기...");
	}
	@Override
	public void stop() {
		System.out.println("음악 재생 정지...");
	}

	@Override
	public boolean sendCall() {
		System.out.println("전화하기...");
		return true;
	}
	@Override
	public boolean receiveCall() {
		System.out.println("전화받기...");
		return true;
	}
	@Override
	public boolean sendSMS() {
		System.out.println("문자하기...");
		return true;
	}
	@Override
	public boolean receiveSMS() {
		System.out.println("문자받기...");
		return true;
	}
}
