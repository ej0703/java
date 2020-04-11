
import java.io.*;

public class test2 {

	public static void main(String[] args) {
		FileReader in = null;
		FileWriter fw = null;
		int c;
		try {
			in = new FileReader("src\\test1.java"); 
			fw = new FileWriter("src/eunji.txt");

			int i=1;
			System.out.print(i++ +":");
			while ((c = in.read()) != -1) { 
				System.out.print((char)c);
				fw.write(c);
				if(c=='\n') {	
					System.out.print(i++ +":");
				}
			}
			in.close();    
			fw.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}		
	}
}