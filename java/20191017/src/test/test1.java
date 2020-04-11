package test;

public class test1 {

	public static void main(String[] args) {
		String[] name;
		name = new String[] {"김지상", "노희선","박용구","박주희","박준범","박한결","백우준","변명섭","이은지","이창윤","임규혁","제갈한범","허상훈","정중호","최다솔","유경호"};
		int count=1;
		
		System.out.println(" 파이썬&R기반 빅데이터 플랫폼 개발자 과정 연락망");
		System.out.println("========================================");
		for(int i=0;i<name.length;i++) { //기본형 for문
			System.out.printf("   %2d.   %s\n",i+1,name[i]);
		}
		System.out.println("========================================");
		for(String s : name) { //향상된 for문
			System.out.printf("   %2d.   %s\n",count,s);
			count++;
		}
	}

}
