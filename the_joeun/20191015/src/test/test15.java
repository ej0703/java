package test;

import java.io.*;

public class test15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		int sum, answer1; //������ ��� ������� �� �� ���� ����
		char answer2; //���α׷��� ����ϰų� ������ ���� ���
		int grade=0; // ����
		boolean run=true; //F �Է½� ���α׷� ���� ���� ����
		
		while(run) {
			for(int i=1;i<=5;i++) {//�ټ�����
				System.out.print("["+i+"]");
				n1 = (int) (Math.random()*90+10);//������ ���� ���� ���� ���� �ΰ�
				n2 = (int) (Math.random()*90+10);
				sum = n1 + n2; //������ ���� ��
				System.out.printf(" %d + %d = ", n1, n2);
				answer1 = Integer.parseInt(br.readLine()); //����ڰ� �Է��� �� int�� �ޱ�

				if(sum == answer1) { //����
					System.out.println("�� ���߾��");
					grade += 20; //���� �� ���� 20�� up
				} else { //����
					System.out.println("���� ... ���� : "+sum); //���� �� �� ���� ���� ���
				}
			}
			
			System.out.printf("����� ������ %d�� �Դϴ�\n", grade); //�ټ� ���� ���� �� ���� ���
			
			do { //�� ���� ���� ��� �� ���� �Է� �ޱ� ������ do-while��
			System.out.print("�� �ҷ�(Y/N) : ");
			answer2 = br.readLine().charAt(0);

			//Y,N ���� �� toUpperCase(), toLowerCase()����Ͽ� ���ǹ� ���� -> �� ��� answer2�� String
			//if(answer2.toUpperCase().equals("N") { ~
			//if(answer2.toLowerCase().equals("n") { ~
			if((answer2 == 'N')||(answer2 == 'n')) { //������ �׸��ϴ� ���
				run=false;
				break;
			} else if((answer2 == 'Y')||(answer2 == 'y')) { //������ ����ϴ� ���
				break;
			} else { //�߸��Է��� ��� do-while�� Ż�� ���ϰ� �ٽ� ����
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
			}
			} while(true);
			
			grade=0; //���ο� ������ ���� ���� �ʱ�ȭ
		}
		System.out.println("���α׷��� �����մϴ�");
	}
}



