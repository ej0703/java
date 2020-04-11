
public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83,90,87};

		int sum =pr(scores);

		/*int sum=0;		
		for(int i : scores) {
			sum+=i;
		}*/
		System.out.println("총합 = "+sum);
		double avg = (double)sum /3;
		System.out.println("평균 = "+avg);		
	}
	
	public static int pr(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++) {
			System.out.printf("scores[%d] = %d\n", i, a[i]);
			s+=a[i];
		}
		return s;
	}
	//메소드 정의 == 메소드 원형 == prototype == 출생신고
	/*접근지정자 지정자 반환형 메소드명(매개변수타입 변수명) {
	 * 	처리할 내용
	 * 	반환형이 void면 return값 없음
	 * 	return 대신 하는게 }
	 * 	반환형이 int면 return 정수값 ===> 정수변수=메소드명(매개변수값)
	 * 	반환형이 int[] return 배열명 ==> int[] 변수명=메소드명(매개변수값)
	 * }
	 */
}
