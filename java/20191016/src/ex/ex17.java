package ex;

import java.util.Random;
import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int MAX = 100, MIN = 0, in =0;
		Random ran = new Random();
		int count=1;
		
		System.out.println("UP & DOWN 게임 ... 종료:0");
		ran.setSeed(System.currentTimeMillis()); //현재시각을 밀리세컨드 단위로 반환 -> 셋팅시간
		in = ran.nextInt(100)+1; //현재시각을 활용하여 랜덤 값(1~100중 하나)를 생성
		while(true) {
			if(MIN==MAX) { //정답을 맞추지 못했을 경우
				System.out.println("정답은 "+in+"입니다.");
				break;
			}
			System.out.print(MIN+"~ "+MAX+"숫자 입력 : "); //아직 정답이 범위 안에 있는 경우
			
			int i=scan.nextInt();
			if(i==0) { //무한루프 탈출조건
				break;
			} else if(i==in) { //정답을 맞춘 경우
				System.out.println(count+"번만에 맞추셨습니다.");
				break;
			} else if(i<in) { //정답보다 입력한 값이 작은 경우
				if(i>MAX) { //최대값보다 큰 값을 입력한 경우 다시
					System.out.println("다시 입력해주세요.");
					continue;
				}
				MIN = i+1;
				System.out.println("UP~~");
			} else if(i>in) { //정답보다 입력한 값이 큰 경우
				if(i<MIN) { //최소값보다 작은 값을 입력한 경우 다시
					System.out.println("다시 입력해주세요.");
					continue;
				}
				MAX = i-1;
				System.out.println("DOWN~~");
			} else { //잘못된 값을 입력한 경우 다시
				System.out.println("다시 입력해주세요.");
				continue;
			}
			count++; //몇번만에 맞췄는지 알려주기 위한 count 변수
		}
		System.out.println("끝");
		scan.close();
	}

}
