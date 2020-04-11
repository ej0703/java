package ppt;

public class BinarySerachEx {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		int low =0;
		int high =arr.length-1;
		int mid;
		int index=-1; //못 찾았을 때
		int sd = 70;//찾는 값
		System.out.println("arr.length의 값 : "+arr.length);
		System.out.println("high의 값 : "+high);
		System.out.println("(low+high)/2=mid의 값 : "+(low+high)/2);

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
			System.out.println("찾기 실패했습니다.");
		} else {
			System.out.println("검색한 70의 index = "+index);
		}
	}

}
