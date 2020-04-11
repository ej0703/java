package test;

import java.io.*;

public class test15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		int sum, answer1; //문제의 답과 사용자의 답 비교 위한 변수
		char answer2; //프로그램을 계속하거나 끝내기 위한 대답
		int grade=0; // 점수
		boolean run=true; //F 입력시 프로그램 종료 위한 변수
		
		while(run) {
			for(int i=1;i<=5;i++) {//다섯문제
				System.out.print("["+i+"]");
				n1 = (int) (Math.random()*90+10);//문제를 내기 위한 랜덤 변수 두개
				n2 = (int) (Math.random()*90+10);
				sum = n1 + n2; //문제에 대한 답
				System.out.printf(" %d + %d = ", n1, n2);
				answer1 = Integer.parseInt(br.readLine()); //사용자가 입력한 답 int로 받기

				if(sum == answer1) { //정답
					System.out.println("참 잘했어요");
					grade += 20; //정답 시 점수 20점 up
				} else { //오답
					System.out.println("띨띨아 ... 정답 : "+sum); //오답 시 본 문제 정답 출력
				}
			}
			
			System.out.printf("당신의 점수는 %d점 입니다\n", grade); //다섯 문제 제출 후 점수 출력
			
			do { //또 할지 먼저 물어본 후 답을 입력 받기 때문에 do-while문
			System.out.print("또 할래(Y/N) : ");
			answer2 = br.readLine().charAt(0);

			//Y,N 비교할 시 toUpperCase(), toLowerCase()사용하여 조건문 가능 -> 이 경우 answer2는 String
			//if(answer2.toUpperCase().equals("N") { ~
			//if(answer2.toLowerCase().equals("n") { ~
			if((answer2 == 'N')||(answer2 == 'n')) { //게임을 그만하는 경우
				run=false;
				break;
			} else if((answer2 == 'Y')||(answer2 == 'y')) { //게임을 계속하는 경우
				break;
			} else { //잘못입력할 경우 do-while문 탈출 못하고 다시 질문
				System.out.println("잘못 입력하였습니다. 다시 입력하세요");
			}
			} while(true);
			
			grade=0; //새로운 게임을 위해 점수 초기화
		}
		System.out.println("프로그램을 종료합니다");
	}
}



