package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

class User2 {
	
	String id;
	int money;
	
}


public class ClassArrayEx05_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 최대 100개까지 회원가입 가능 + 주소변수 만들기
		final int MAX_NUM = 100;	
		User2[] user2 = new User2[MAX_NUM];	
		
		// 각 인덱스에 메서드, 주소 넣어주기
		for (int i = 0; i < MAX_NUM; i++) {
			user2[i] = new User2();
		}
		
		// 가입된 사람 수 (변수)
		int usrCnt = 0;
		
		// 반복문 시작
		while (true) {
			
			// 메뉴
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			int sel = scan.nextInt();
			
			// 메뉴에서 번호 선택 시
			if (sel == 1) {
				User2 temp = new User2();
				System.out.println("이름을 입력하세요 ");
				temp.id = scan.next();
				System.out.println("금액을입력하세요 ");
				temp.money = scan.nextInt();
				user2[usrCnt] = temp;
				usrCnt++;
			}
			else if (sel == 2) {
				System.out.println("인덱스를 입력하세요 ");
				int index = scan.nextInt();
				for (int i = index; i < usrCnt - 1; i++) {
					user2[i] = user2[i + 1];
				}
				usrCnt--;
			}
			else if (sel == 3) {
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(user2[i].id + user2[i].money);
				}
			}
			else if (sel == 4) {
				break;
			}		
			
		}

		scan.close();
		
	}

}
