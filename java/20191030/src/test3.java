
public class test3 {

	public static void main(String[] args) {
		int[] a = {52,42,12,62,50};

		int i,j, temp;
		System.out.print("Source Data : ");
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();

		//Bubble Sort
		for(i=0;i<a.length-1;i++) {
			for(j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) { //오름차순 정렬
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
				}
			}
		}

		System.out.print("Source Data : ");
		for(int n:a) {
			System.out.print(n+" ");
		} 

	}

}
