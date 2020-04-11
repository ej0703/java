package test;

public class test1 {

	public static void main(String[] args) {
		int[] month = {2,5,5,1,3,6,1,4,0,2,5,0}; //달력 시작 날짜 위한 공백
		int[] end = {31,28,31,30,31,30,31,31,30,31,30,31}; //날짜수

		for(int i=0;i<month.length;i++) {
			System.out.printf(" <    2019년 %2d월     >\n",i+1);
			System.out.println(" 일  월  화  수  목  금  토");
			
			for(int k=0;k<month[i];k++) { //공백 출력
				System.out.printf("   ");
			}
			for(int j=1;j<=end[i];j++) { //날짜 출력
				System.out.printf("%3d",j);
				
				if((month[i]+j)%7==0) {
					System.out.println();
				}
			}
			System.out.print("\n\n");
		}
	}
}