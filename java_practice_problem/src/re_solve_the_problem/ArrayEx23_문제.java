package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

//풀이시간 : 2021-11-27 10:35 ~ 10:51

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("accs : " + Arrays.toString(accs));
			System.out.println("pws  : " + Arrays.toString(pws));
			
			System.out.println("\n1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if		(selectMenu < 1 || selectMenu > 3) {
				continue;
			}
			else if	(selectMenu == 1) {
				if (accsCnt == 5) {
					System.out.println("더 이상 추가할 수 없습니다.");
				} else {
					System.out.println("ID를 입력하세요");
					int myId = scan.nextInt();
					
					int cnt = 0;
					for (int i=0; i<accsCnt; i++) {
						if (myId == accs[i]) {
							cnt = 1;
							break;
						}
					}
					if (cnt == 0) {
						
						accs[accsCnt] = myId;
						
						System.out.println("PW를 입력하세요");
						pws[accsCnt] = scan.nextInt();
						
						accsCnt++;
					} else {
						System.out.println("ID가 중복됩니다.");
					}
				}
			}
			else if (selectMenu == 2) {
				if (accsCnt == 0) {
					System.out.println("삭제할 계정이 없습니다.");
				} else if (accsCnt == 1) {
					accs[0] = 0;
					pws[0] = 0;
					accsCnt --;
				} else {
					System.out.println("삭제할 아이디 입력");
					int myId = scan.nextInt();
					
					int idx = -1;
					for (int i=0; i<accsCnt; i++) {
						if (myId == accs[i]) {
							idx = i;
							break;
						}
					}
					
					if (idx == -1) {
						System.out.println("중복되는 ID가 없습니다.");
					} else if (idx == accsCnt-1){
						accs[idx] = 0;
						pws[idx] = 0;
						accsCnt--;
					} else {
						
						for (int i=idx; i<accsCnt-1; i++) {
							accs[i] = accs[i+1];
							pws[i] = pws[i+1];
							accs[i+1] = 0; 
							pws[i+1] = 0; 
						}
						accsCnt --;
						System.out.println("삭제 완료.");
					}
					
				}
			}
			else if (selectMenu == 3) {
				break;
			}
			
		}
		
		System.out.println("\n프로그램을 종료합니다.");

	}
}
