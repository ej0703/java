
public class test2 {

	public static void main(String[] args) {
		int[] a = {52,42,12,62,50};

		int i,j, temp;
		System.out.print("Source Data : ");
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();

		//Section Sort
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) { //오름차순 정렬
//					a[i]=a[i]^a[j];
//					a[j]=a[j]^a[i];
//					a[i]=a[i]^a[j];
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print("Source Data : ");
		for(int n:a) {
			System.out.print(n+" ");
		}
	}

}
