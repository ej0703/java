
public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for(int i=0;i<oldIntArray.length;i++) { //3,2,1,0,0,
			newIntArray[oldIntArray.length-1-i]=oldIntArray[i];
		}
//		for(int i=0;i<oldIntArray.length;i++) { //0,0,1,2,3,
//			newIntArray[oldIntArray.length-1+i]=oldIntArray[i];
//		}
		
		for(int i=0;i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+",");
		}

	}

}
