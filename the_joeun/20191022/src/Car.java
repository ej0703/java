
public class Car {
	//�ʵ�
	int gas;

	//������

	//�޼ҵ�
	void setGas(int g) {
		this.gas = g;
	}

	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}

	void run() {
		while(true) {
			if(gas>0) {
				System.out.printf("�޸��ϴ�.(gas�ܷ�:%d)\n",gas);
				gas--;
			} else {
				System.out.printf("����ϴ�.(gas�ܷ�:%d)\n",gas);
				return;
			}
		}
	}
}
