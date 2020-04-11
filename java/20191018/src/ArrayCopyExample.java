
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		//원본, 원본위치, 사본, 사본위치, 카피되는 배열 요소의 수
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i]+", ");
		}
	}

}
