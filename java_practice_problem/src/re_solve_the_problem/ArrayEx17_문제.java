package re_solve_the_problem;

import java.util.Scanner;

//풀이시간 : 2021-11-22 22:23 ~ 22:41

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = new int[9];
		
		int turn = 1;
		int p1Win = 0;
		int p2Win = 0;
		
		// 게임
		while (true) {
			
			// 프론트
			System.out.println("= 틱택토 =");
			for (int i=0; i<game.length; i++) {
				if 		(game[i] == 0) System.out.print("[ ]");
				else if (game[i] == 1) System.out.print("[O]");
				else if (game[i] == 2) System.out.print("[X]");
				
				if (i%3 == 2) System.out.println();
				
			}
			
			// 턴
			if (turn % 2 == 1) {		
				System.out.println("\n[시스템] Player1 차례입니다.");
				System.out.print("[시스템] 인덱스를 입력하세요.");			
			} else {
				System.out.println("\n[시스템] Player2 차례입니다.");
				System.out.print("[시스템] 인덱스를 입력하세요.");
			}
			
			int idx = sc.nextInt();
			if (idx < 0 || idx > 8) {
				System.out.println("0~8까지의 숫자만 입력이 가능합니다.\n");
				continue;
			} else {
				if (game[idx] == 0 && turn % 2 == 1) {
					game[idx] = 1;
					turn++;
				} else if (game[idx] == 0 && turn % 2 == 0) {
					game[idx] = 2;
					turn++;
				} else {
					System.out.println("이미 선택 된 자리입니다.\n");
				}
			}
			
			// 승패계산
			// 가로
			if (game[0] == 1 && game[1] == 1 && game[2] == 1 || game[3] == 1 && game[4] == 1 && game[5] == 1 || game[6] == 1 && game[7] == 1 && game[8] == 1) {
				p1Win = 1;
			} else if (game[0] == 2 && game[1] == 2 && game[2] == 2 || game[3] == 2 && game[4] == 2 && game[5] == 2 || game[6] == 2 && game[7] == 2 && game[8] == 2) {
				p2Win = 1;
			}
			
			// 세로
			if (game[0] == 1 && game[3] == 1 && game[6] == 1 || game[1] == 1 && game[4] == 1 && game[7] == 1 || game[2] == 1 && game[5] == 1 && game[8] == 1) {
				p1Win = 1;
			} else if (game[0] == 2 && game[3] == 2 && game[6] == 2 || game[1] == 2 && game[4] == 2 && game[7] == 2 || game[2] == 2 && game[5] == 2 && game[8] == 2) {
				p2Win = 1;
			}
			
			// 대각
			if (game[0] == 1 && game[4] == 1 && game[8] == 1 || game[2] == 1 && game[4] == 1 && game[6] == 1) {
				p1Win = 1;
			} else if (game[0] == 2 && game[4] == 2 && game[8] == 2 || game[2] == 2 && game[4] == 2 && game[6] == 2) {
				p2Win = 1;
			}
			
			// 승패처리
			if (p1Win == 1) {
				System.out.println("플레이어1의 승리");
				break;
			} else if (p2Win == 1) {
				System.out.println("플레이어2의 승리");
				break;
			}
			
		}
		
	}
		
}
