package test;

public class test16 {

	public static void main(String[] args) {
		
		for(int i=2;i<9;i+=3) { //곱셈의 왼쪽 숫자를 조정, k값을 변하게 함
			for(int j=1;j<=9;j++) { //곱셈의 오른쪽 숫자
				for(int k=i;k<=i+2;k++) { //3개씩 출력 위해 i~i+2까지
					System.out.printf("%d*%d=%2d ", k, j, k*j);
				}
				System.out.print("\n"); //3개 출력 후 줄 바꿈
			}
		}

	}

}
