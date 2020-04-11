package ex;

public class returnArray {

	public static void main(String[] args) {
		int[] intArray;
		//메소드를 호출하고 메소드가 리턴한 배열의 주소값을 받음.
		intArray=makeArray();
		
//		int sum=0;
		for(int i=0;i<intArray.length;i++) {
			System.out.printf("intArray[%d] =%d\n",i,intArray[i]);
//			sum+=intArray[i];
		}
//		System.out.println("합계 : "+sum);
	}

	//메소드 호출
	//접근지정자 지정자 반환형 메소드명(){처리할 내용};//메소드 정의
	static int[] makeArray() {
		int[] temp = new int[4];
		int sum=0;
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
			sum+=temp[i];
		}
		System.out.println("합계 : "+sum);
		return temp;
	}

}
