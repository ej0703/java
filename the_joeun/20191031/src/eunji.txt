import java.io.File;

public class test1 {

	public static void main(String[] args) {
		File f = new File("src\\ByteCopy.java");
		
		System.out.print("ByteCopy.java 파일의 길이 = "+f.length());
	}

}
