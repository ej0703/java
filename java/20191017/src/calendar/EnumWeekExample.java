package calendar;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		//��ü ������
		//�߻�Ŭ�����̱� ����(��ü�� �ڽ��ܴ̿� ���� �� ����)
		//��ӹ��� Ŭ�������� �߻�޼ҵ带 ������ �ϸ� ��ӹ��� Ŭ�������� ��ü�� ������ �� �ִ�.
		//But, Calendar�� �̷� ����� ��ü�� ����.
		//==>�̱��� ����(���丮 ����)
		//class abstract Calendar{
		//Calendar cal;
		//static Calendar getInstance() {
		//  if (cal == null) {
		//		cal = new Calendar();
		//	}
		//	return cal;
		//} //�޼���
		//} //Ŭ����
		Calendar cal=Calendar.getInstance();
//		System.out.println(cal);
		int week= cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
		case 1:
			today=Week.SUNDAY; break;
		case 2:
			today=Week.MONDAY; break;
		case 3:
			today=Week.TUESDAY; break;
		case 4:
			today=Week.WEDNSDAY; break;
		case 5:
			today=Week.THURSDAY; break;
		case 6:
			today=Week.FRIDAY; break;
		case 7:
			today=Week.SATURDAY; break;
		}

		System.out.println("���� ���� : "+today);
		if(today==Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");	
		} else {
			System.out.println("������ �ڹٰ��θ� �մϴ�.");	
		}

	}

}
