package ppt;

public class MethodSample {
	//필드 정의
	String name;
	int age;
	MethodSample method;
	//생성자 오버로딩
	public MethodSample() {

	}
	public MethodSample(String name) {
		this(); //디폴트생성자 호출, 생성자 호출하기 때문에 생성자 내에서만 사용, 맨첫줄에 사용
		//필드 초기화
		this.name = name;
	}
	public MethodSample(String name, int age, MethodSample method) {
		this("껌팔이"); //생성자 호출
		
		//필드 초기화
		this.name = name;
		this.age = age;
		this.method = method;
	}

	//메소드 오버로딩
	//메소드 오버로딩(메소드명 반드시 일치, 매개변수의 타입, 객수, 순서가 모두 달라야 한다.)
	//여러 목적으로 사용하기 위함이고, 코드를 간결하기 위함.
	public int getSum(int i, int j) {
		return i+j;
	}
	public int getSum(int i, int j, int k) {
		return i+j+k;
	}
	public double getSum(double i, double j) {
		return i+j;
	}

	public static void main(String[] args) {
		MethodSample meth = new MethodSample();
		MethodSample meth2 = new MethodSample("홍길동");
		MethodSample meth3 = new MethodSample("홍길순",20,meth);

		int a = meth.getSum(1, 2);
		int b = meth.getSum(1, 2,3);
		double c = meth.getSum(1.1, 2.2);

		System.out.printf("a = %d\nb = %d\nc = %.1f\n",a,b,c);
		
		System.out.println(meth2.name+" "+meth3.name+" "+meth3.age);
	}

}
