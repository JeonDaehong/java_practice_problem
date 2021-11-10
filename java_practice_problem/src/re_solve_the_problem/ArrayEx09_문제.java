package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

// 풀이시간 : 2021-11-10 19:01 ~ 19:06

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char seat[] = {'X','X','X','X','X','X','X'};
		
		int money = 0;
		
		while (true) {
			System.out.println("1번 : 좌석예매 / 2번 : 종료");
			int sel = sc.nextInt();
			if (sel < 1 || sel > 2) continue;
			if (sel == 1) {
				while (true) {
					System.out.println("좌석을 선택하시오 (1~7) / 뒤로가기 (0)");
					System.out.println(Arrays.toString(seat));
					int idx = sc.nextInt();
					
					if 		(idx < 0 || idx > 7) continue;
					else if (idx == 0) break;
					else if (seat[idx-1] == 'X') {
						seat[idx-1] = 'O';
						money += 12000;
						System.out.println("좌석이 예매 되었습니다.\n");
					}
					else {
						System.out.println("이미 예약 된 좌석입니다.\n");
					}
				}
			} else if (sel == 2) {
				break;
			}
		}
		
		System.out.println("총 지불해야하는 금액 : " + money + "원");
		
	}
}
