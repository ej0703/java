package ex;

import java.util.Random;
import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int MAX = 100, MIN = 0, in =0;
		Random ran = new Random();
		int count=1;
		
		System.out.println("UP & DOWN ���� ... ����:0");
		ran.setSeed(System.currentTimeMillis()); //����ð��� �и������� ������ ��ȯ -> ���ýð�
		in = ran.nextInt(100)+1; //����ð��� Ȱ���Ͽ� ���� ��(1~100�� �ϳ�)�� ����
		while(true) {
			if(MIN==MAX) { //������ ������ ������ ���
				System.out.println("������ "+in+"�Դϴ�.");
				break;
			}
			System.out.print(MIN+"~ "+MAX+"���� �Է� : "); //���� ������ ���� �ȿ� �ִ� ���
			
			int i=scan.nextInt();
			if(i==0) { //���ѷ��� Ż������
				break;
			} else if(i==in) { //������ ���� ���
				System.out.println(count+"������ ���߼̽��ϴ�.");
				break;
			} else if(i<in) { //���亸�� �Է��� ���� ���� ���
				if(i>MAX) { //�ִ밪���� ū ���� �Է��� ��� �ٽ�
					System.out.println("�ٽ� �Է����ּ���.");
					continue;
				}
				MIN = i+1;
				System.out.println("UP~~");
			} else if(i>in) { //���亸�� �Է��� ���� ū ���
				if(i<MIN) { //�ּҰ����� ���� ���� �Է��� ��� �ٽ�
					System.out.println("�ٽ� �Է����ּ���.");
					continue;
				}
				MAX = i-1;
				System.out.println("DOWN~~");
			} else { //�߸��� ���� �Է��� ��� �ٽ�
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
			count++; //������� ������� �˷��ֱ� ���� count ����
		}
		System.out.println("��");
		scan.close();
	}

}
