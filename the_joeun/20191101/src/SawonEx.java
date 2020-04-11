
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class SawonEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String fileNameOutput;
		String[] str = null;
		int total=0;
		double avg=0;
		
		try {
			System.out.print("파일명을 입력하세요 >>");
			String fileNameOut=s.next();
			FileWriter fw = new FileWriter("src/"+fileNameOut);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("     2019년 신입사원 평가 점수         ");
			pw.println("-----------------------------");
			
			Date date = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일");
			pw.println("평가일 : "+sd.format(date));
			pw.println("이름 java jquery html5 css3 total avg");
			
			while(true) {
				//s=new Scanner(System.in);
						
				System.out.print("성명(종료 0) : ");
				str[0] = s.next();
				if(str[0].equals("0")) break;
				System.out.print("java : ");
				str[1] = s.next();
				System.out.print("jquery : ");
				str[2] = s.next();
				System.out.print("html5 ");
				str[3] = s.next();
				System.out.print("css3 : ");
				str[4] = s.next();
				
				
				for(int i=1 ;i<str.length-1;i++) {
					total +=Integer.parseInt(str[i]);
				}
				avg = total/4;
				
				for(int i=0;i<str.length;i++) {
				pw.print(str[i]);	
				}
				
				pw.print(total);
				pw.println(avg);						
			}
			s.close();
			pw.flush();
			fw.close();
			pw.close();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
}
