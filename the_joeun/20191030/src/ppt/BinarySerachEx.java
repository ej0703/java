package ppt;

public class BinarySerachEx {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		int low =0;
		int high =arr.length-1;
		int mid;
		int index=-1; //�� ã���� ��
		int sd = 70;//ã�� ��
		System.out.println("arr.length�� �� : "+arr.length);
		System.out.println("high�� �� : "+high);
		System.out.println("(low+high)/2=mid�� �� : "+(low+high)/2);

		while(low<=high) {
			mid = (low+high)/2;
			if(sd == arr[mid]) {
				index = mid;
				break;
			} else if(sd>arr[mid]) {
				low = mid +1;
			} else {
				high = mid-1;
			}
		}; //while
		if(index==-1) {
			System.out.println("ã�� �����߽��ϴ�.");
		} else {
			System.out.println("�˻��� 70�� index = "+index);
		}
	}

}
