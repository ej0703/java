import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu, stu=0;
		int[] scores = {};
		int max=0, sum=0;
		boolean run=true;

		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("---------------------------------------");
			System.out.print("          선택 >> ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("        학생수 >> ");
				stu = scan.nextInt();
				scores = new int [stu];
				break;
			case 2:
				for(int i=0;i<scores.length;i++) {
					System.out.printf("  scores[%d] >> ",i);	
					scores[i] = scan.nextInt();
					sum += scores[i];
					if(scores[i]>max) {
						max = scores[i];
					}
				}
				break;
			case 3:
				for(int i=0;i<scores.length;i++) {
					System.out.printf("  scores[%d] >> %d\n",i,scores[i]);	
				}
				break;
			case 4:
				System.out.println("     최고 점수 >> "+max);
				System.out.printf("     평균 점수 >> %.1f\n",(sum/(double)stu));
				break;
			case 5:
				run = false;
			}
		}
		System.out.println("      프로그램 종료");
		scan.close();
	}

}
