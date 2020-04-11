package ex;

public class ex9_16 {
//static : 클래스 멤버변수, 클래스 변수
//non=static : 인스턴스 멤버변수

	public static void main(String[] args) {
		int a,b, su1=20,su2=10;
		
		ex9_16 ex = new ex9_16(); //객체, 인스턴스변수		
		ex.func1();	//static 뺏으므로 객체 필요	
		
		//기본형 전달(값전달방식 : call by value)
		a= func2();
		System.out.printf("int형 메소드에서 돌려준 값 ==> %d\n",a);
		
		System.out.println();
		
		//sum() 호출해서 합을 가져온 후 main에서 출력
		b=sum1(su1,su2);
		System.out.printf("int형 ) %d + %d = %d\n",su1,su2,b);
		//sum() 호출해서 합을 구한 후 sum에서 출력하고 메인으로 돌아오세요.
		sum2(su1,su2);
		
		System.out.println();
		
		//배열 메세지 전달(주소전달방식 : call by address)
		int[] arr;
		array1(new int[] {1,2,3});
		System.out.println();
		arr = array2(new int[] {1,2,3});
		for(int i=0;i<arr.length;i++) {
			System.out.printf("int형 ) is[%d] = %2d   ",i, arr[i]);
		}
		
		System.out.println();
		
		//객체 전달(주소전달방식 : call by address)
		//객체 생성(생성자 호출, 힙영역 확보, 객체를 초기화)
		//->func1에 static 제거하면서 객체 생성이 필요하기 때문에 맨 위에서 객체 생성
		object(ex);
	}

	private static void object(ex9_16 ex) {
		ex.func1(); //func1에 static이 있으면 굳이 객체로 접근할 필요없음
	}

	private static void array1(int[] is) {
		for(int i=0;i<is.length;i++) {
			System.out.printf("void형) is[%d] = %2d   ",i, is[i]);
		}		
	}

	private static int[] array2(int[] is) {
		for(int i=0;i<is.length;i++) {
			is[i] = 10*(is[i]);
		}
		return is;
	}

	private static int sum1(int i, int j) {
		return i+j;
	}
	
	private static void sum2(int i, int j) {
		System.out.printf("void형) %d + %d = %d\n",i,j,i+j);
	}

	private void func1() {
		System.out.printf("void형 메소드는 돌려줄게 없음\n");
	}

	private static int func2() {
		return 100;		
	}

}
