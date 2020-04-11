package ppt;

public class RunntimeEx {

	public static void main(String[] args) {
		//�������� ������
		//�ڹٿ��� �⺻������ ��������. java.lang.Runtime
		//����ð��� ����ȯ�濡 ���� ������ �����ų� ����� ����
		Runtime rt = Runtime.getRuntime();
		//���� �ڹٰ���ӽ�(JVM)���� ��밡���� �޸𸮴� byte ����
		long fr = rt.freeMemory();		
		System.out.println("freeMemory = "+fr/1024 +"KB");
		
		long fr2= rt.freeMemory();//��ü�޸𸮷��� byte ����
		System.out.println("totalMemory = "+fr2/1024 +"KB");
		
		try {
			rt.exec("C:\\Windows\\System32\\calc.exe");
			rt.exec("C:\\Windows\\System32\\notepad.exe");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
