package re_solve_the_problem;

import java.util.Scanner;

// 2021-12-06 18:47 ~ 19:13

/*
 * # ATM[4단계] : 전체 기능구현
 * 
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */


public class ArrayEx30_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int usrCnt = 0;
		int identifier = -1;
		int switchCnt = 0;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료\n";
		
		while(true) {
			for (int i=0; i<usrCnt; i++) {
				System.out.print(arId[i] + " ");
			}
			System.out.println("\n" + menu);
			
			int sel = scan.nextInt();
			
			if	   (sel == 1) {
				if (usrCnt == 5) {
					System.out.println("더 이상 생성 불가능");
				} else {
					System.out.print("ID : ");
					int myId = scan.nextInt();
					System.out.print("PW : ");
					int myPw = scan.nextInt();
					
					for (int i=0; i<usrCnt; i++) {
						if (myId == arId[i]) {
							System.out.println("중복 ID 발견 !");
							switchCnt = 1;
							break;
						}
					}
					
					if (switchCnt == 1) {
						switchCnt = 0;
						continue;
					} else {
						arId[usrCnt] = myId;
						arPw[usrCnt] = myPw;
						arMoney[usrCnt] = 0;
						usrCnt ++;
						System.out.println("회원가입 완료 ! ");
					}
					
				}
			}
			else if(sel == 2) {
				if (usrCnt == 0) {
					System.out.println("삭제할 ID가 없음.");
				} else if (usrCnt == 1) {
					arId[0] = 0;
					arPw[0] = 0;
					arMoney[0] = 0;
					usrCnt --;
				} else {
					System.out.print("탈퇴할 ID : ");
					int myId = scan.nextInt();
					for (int i=0; i<usrCnt; i++) {
						if (arId[i] == myId) {
							identifier = i;
							break;
						}
					}
					
					if (identifier == -1) {
						System.out.println("해당 ID가 없습니다.");
						continue;
					} else {
						for (int i=identifier; i<usrCnt-1; i++) {
							arId[i] = arId[i+1];
							arPw[i] = arPw[i+1];
							arMoney[i] = arMoney[i+1];
						}
						arId[usrCnt-1] = 0;
						arPw[usrCnt-1] = 0;
						arMoney[usrCnt-1] = 0;
						usrCnt--;
						identifier = -1;
						System.out.println("회원 탈퇴 완료 !");
					}
					
				}
			}
			else if(sel == 3) {
				if (identifier == -1) {
					System.out.print("ID 입력 : ");
					int myId = scan.nextInt();
					System.out.print("PW 입력 : ");
					int myPw = scan.nextInt();
					
					for (int i=0; i<usrCnt; i++) {
						if (myId == arId[i] && myPw == arPw[i]) {
							identifier = i;
							break;
						}
					}
					
					if (identifier == -1) {
						System.out.println("ID혹은 PW가 틀렸습니다.");
					} else {
						System.out.println("로그인 완료. " + arId[identifier] + " 님");
					}
				} else {
					System.out.println("로그아웃부터 해주세요.");
					System.out.println("현재 사용자 : " + arId[identifier] + " 님");
				}
			}
			else if(sel == 4) {
				if (identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
				} else {
					identifier = -1;
					System.out.println("로그아웃 되었습니다.");
				}
			}
			else if(sel == 5) {
				if (identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
				} else {
					System.out.print("입금 금액 : ");
					int myMoney = scan.nextInt();
					arMoney[identifier] += myMoney;
					System.out.println("입금 완료");
				}
			}
			else if(sel == 6) {
				if (identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
				} else {
					int uIdx = -1;
					System.out.print("이제할 곳 ID : ");
					int yourId = scan.nextInt();
					
					for (int i=0; i<usrCnt; i++) {
						if (yourId == arId[i]) {
							uIdx = i;
							break;
						}
					}
					
					if (uIdx == -1) {
						System.out.println("해당 계좌는 없는 계좌입니다.");
					} else {
						System.out.print("이체 금액 : ");
						int myMoney = scan.nextInt();
						if (myMoney > arMoney[identifier]) {
							System.out.println("잔액이 부족합니다.");
						} else {
							arMoney[uIdx] += myMoney;
							arMoney[identifier] -= myMoney;
							System.out.println("이체 완료");
						}
					}
				}
			}
			else if(sel == 7) {
				if (identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
				} else {
					System.out.println("잔액 : " + arMoney[identifier] + " 원");
				}
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			} else {
				continue;
			}
		}
	}
}
