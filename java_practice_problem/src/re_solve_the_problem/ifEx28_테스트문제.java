package re_solve_the_problem;

//2021-09-16 11:00 ~ 11:55

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class ifEx28_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		// 가위바위보 하나 빼기 반복문
		int i = 1;
		
		while (i < 2) {
			
			int yesNo = 0;
			int meFinal = 0;
			int comFinal = 0;
			
			// 보기 쉽게 문자 입력을 위한 밑 작업
			String comLeftString = "";
			String comRightString = "";
			String comFinalString = "";
			String meLeftString = "";
			String meRightString = "";
			String meFinalString = "";
		
			// 컴퓨터의 가위바위보 랜덤 선택
			int comLeft = ran.nextInt(3) + 1;
			int comRight = ran.nextInt(3) + 1;
		
			// 나의 가위바위보 선택
			System.out.println("가위바위보 하나빼기 게임입니다.");
			System.out.println("1 = 가위, 2 = 바위, 3= 보자기 입니다.");
			System.out.println("왼손으로 무엇을 내시겠습니까?");
			int meLeft = scan.nextInt();
		
			System.out.println(); // 한 줄 띄우기
		
			System.out.println("오른손으로 무엇을 내시겠습니까?");
			int meRight = scan.nextInt();
		
			System.out.println();
			
			// 하나 빼기를 위한 밑 작업
			meFinal = meLeft + meRight;
			comFinal = comLeft + comRight;
			
			// 문자열 입력
			if (comLeft == 1) {
				comLeftString = "가위";
			} else if (comLeft == 2) {
				comLeftString = "바위";
			} else {
				comLeftString = "보자기";
			}
			
			if (comRight == 1) {
				comRightString = "가위";
			} else if (comRight == 2) {
				comRightString = "바위";
			} else {
				comRightString = "보자기";
			}
			
			if (meLeft == 1) {
				meLeftString = "가위";
			} else if (meLeft == 2) {
				meLeftString = "바위";
			} else {
				meLeftString = "보자기";
			}
			
			if (meRight == 1) {
				meRightString = "가위";
			} else if (meRight == 2) {
				meRightString = "바위";
			} else {
				meRightString = "보자기";
			}
			
			// 컴퓨터 랜덤으로 하나 빼기
			if ((comLeft == 1 && comRight == 2) || (comRight == 1 && comLeft == 2)) {
				int ran1 = ran.nextInt(2) + 1;
				comFinal = comFinal - ran1;
			} else if ((comLeft == 1 && comRight == 3) || (comRight == 1 && comLeft == 3)) {
				int j = 0;
				while (j < 1) {
				int ran2 = ran.nextInt(3) + 1; // ran2가 1또는 3이 나와야 하기에, 2가 나오면 다시 뽑게끔 반복함수 추가.
					if (ran2 == 2) {
						j = 0;
					} else {
						j++;
						comFinal = comFinal - ran2;
					}
				}	
			} else if ((comLeft == 2 && comRight == 3) || (comRight == 2 && comLeft == 3)) {
				int ran3 = ran.nextInt(2) + 2;
				comFinal = comFinal - ran3;
			} else if (comLeft == 1 && comRight == 1) {
				comFinal -= 1;
			} else if (comLeft == 2 && comRight == 2) {
				comFinal -= 2;
			} else {
				comFinal -= 3;
			}
			
			// 컴퓨터의 최종 결과에 따른 문자열 입력
			if (comFinal == 1) {
				comFinalString = "가위";
			} else if (comFinal == 2) {
				comFinalString = "바위";
			} else {
				comFinalString = "보자기";
			}
			
			// 가위바위보 ~ 하나빼기 작업
			if (meLeft >= 1 && meLeft <= 3 && meRight >= 1 && meRight <= 3) {
				System.out.println("컴퓨터는 " + comLeftString + " 와(과) " + comRightString + " 을 내었습니다." );
				System.out.println("당신은 " + meLeftString + " 와(과) " + meRightString + " 을 내었습니다." );
				System.out.println("하나 빼기를 할 차례입니다. 무엇을 빼시겠습니까.");
				System.out.println(meLeftString + " (는)은 1을, " + meRightString + " (는)은 1외 다른 숫자를 입력하십시오.");
					int choose = scan.nextInt(); // 무엇을 뺄 것인가
				
				// 내가 무엇을 빼느냐에 따른 결과값
				if (choose == 1) {
					meFinal = meRight;
				} else {
					meFinal = meLeft;
				}
				
				// 내 결과값에 따른 문자열 입력
				if (meFinal == 1) {
					meFinalString = "가위";
				} else if (meFinal == 2) {
					meFinalString = "바위";
				} else {
					meFinalString = "보자기";
				}
				
				// 가위바위보 하나 빼기 승부의 결과
				System.out.println("컴퓨터는 최종적으로 " + comFinalString + " 을 내었습니다.");
				System.out.println("당신은 최종적으로 " + meFinalString + " 을 내었습니다.");
				
				if ((comFinal == 1 && meFinal == 1) || (comFinal == 2 && meFinal == 2) || (comFinal == 3 && meFinal == 3)) {
					System.out.println("비겼습니다.");
				} else if ((comFinal == 1 && meFinal == 3) || (comFinal == 2 && meFinal == 1) || (comFinal == 3 && meFinal == 2)) {
					System.out.println("패배하셨습니다.");
				} else {
					System.out.println("승리하셨습니다.");
				}
				
				
			} else {
				System.out.println("올바른 가위바위보(숫자)를 선택하여 주십시오."); // 1~3 외 다른 숫자를 선택했을 경우
			}
			
			// 게임을 다시 할 것인가? 여기까지만 할 것인가? 선택
			System.out.println("다시 하시겠습니까?");
			System.out.println("Yes : 1,  No : 1 외에 아무숫자");
			yesNo = scan.nextInt();
				if (yesNo == 1) {
					System.out.println();
				} else {
					i++;
				}
	
		}
		
		System.out.println("수고하셨습니다.^^");
		
		scan.close();
		
	}

}
