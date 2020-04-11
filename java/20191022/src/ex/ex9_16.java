package ex;

public class ex9_16 {
//static : Ŭ���� �������, Ŭ���� ����
//non=static : �ν��Ͻ� �������

	public static void main(String[] args) {
		int a,b, su1=20,su2=10;
		
		ex9_16 ex = new ex9_16(); //��ü, �ν��Ͻ�����		
		ex.func1();	//static �����Ƿ� ��ü �ʿ�	
		
		//�⺻�� ����(�����޹�� : call by value)
		a= func2();
		System.out.printf("int�� �޼ҵ忡�� ������ �� ==> %d\n",a);
		
		System.out.println();
		
		//sum() ȣ���ؼ� ���� ������ �� main���� ���
		b=sum1(su1,su2);
		System.out.printf("int�� ) %d + %d = %d\n",su1,su2,b);
		//sum() ȣ���ؼ� ���� ���� �� sum���� ����ϰ� �������� ���ƿ�����.
		sum2(su1,su2);
		
		System.out.println();
		
		//�迭 �޼��� ����(�ּ����޹�� : call by address)
		int[] arr;
		array1(new int[] {1,2,3});
		System.out.println();
		arr = array2(new int[] {1,2,3});
		for(int i=0;i<arr.length;i++) {
			System.out.printf("int�� ) is[%d] = %2d   ",i, arr[i]);
		}
		
		System.out.println();
		
		//��ü ����(�ּ����޹�� : call by address)
		//��ü ����(������ ȣ��, ������ Ȯ��, ��ü�� �ʱ�ȭ)
		//->func1�� static �����ϸ鼭 ��ü ������ �ʿ��ϱ� ������ �� ������ ��ü ����
		object(ex);
	}

	private static void object(ex9_16 ex) {
		ex.func1(); //func1�� static�� ������ ���� ��ü�� ������ �ʿ����
	}

	private static void array1(int[] is) {
		for(int i=0;i<is.length;i++) {
			System.out.printf("void��) is[%d] = %2d   ",i, is[i]);
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
		System.out.printf("void��) %d + %d = %d\n",i,j,i+j);
	}

	private void func1() {
		System.out.printf("void�� �޼ҵ�� �����ٰ� ����\n");
	}

	private static int func2() {
		return 100;		
	}

}
