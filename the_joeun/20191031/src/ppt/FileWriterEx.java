package ppt;

import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("src/ppt/test.txt"); 
			while ((c = in.read()) != -1) {
				fout.write(c);
			}
           in.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력  오류");
		}
		
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/ppt/test.txt");
			in = new InputStreamReader(fin, "MS949");

			while((c = in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch (IOException e) {
			System.out.println("입출력  오류");
		}

	}

}
