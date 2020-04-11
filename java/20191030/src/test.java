import java.util.Scanner;

class Record {
	String name;
	int sco;
}
class Grade {
	int n;
	Record[] rec;
	Scanner scan = new Scanner(System.in);
	void set() {
		do {
			System.out.print("인원 수 입력(1~100) : ");
			n=scan.nextInt();
		} while(n<1||n>100);
		
		rec = new Record[n];
	}
	void input() {
		for(int i=0;i<rec.length;i++) {
			rec[i] = new Record();
			System.out.printf("이름 점수 입력(%d) : ",i+1);
			rec[i].name = scan.next();
			rec[i].sco = scan.nextInt();
		}
		int pass = 0;
		Record temp = new Record();
		boolean flag;
		
		do {
			flag = false;
			pass++;
			for(int i=0;i<rec.length-pass;i++) {
				if(rec[i].sco<rec[i+1].sco) {
					temp= rec[i];
					rec[i] = rec [i+1];
					rec[i+1] =temp;
					flag = true;
				}
			}
		} while(flag);
	}
	void print() {
		System.out.println();
		System.out.println("-------------------");
		
		for(int i=0;i<rec.length;i++) {
			System.out.printf("%3d등 %5s %3d\n",i+1,rec[i].name, rec[i].sco);
		}
		System.out.println("-------------------");
	}
}

public class test {

	public static void main(String[] args) {
		Grade ob = new Grade();
		ob.set();
		ob.input();
		ob.print();
	}

}
