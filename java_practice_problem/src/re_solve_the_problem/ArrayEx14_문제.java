package re_solve_the_problem;

import java.util.Scanner;

// 풀이시간 : 2021-11-10 20:13 ~ 20:19

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 2;
		
		while (true) {
			for (int i=0; i<game.length; i++) {
				if 		(game[i] == 0) System.out.print("___");
				else if (game[i] == 2) System.out.print("옷");
			}
			System.out.print("\n좌:1 / 우:2 / 종료:그 외 숫자");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				if (game[0] == 2) {
					System.out.println("더 이상 왼쪽으로 못갑니다.\n");
				} else {
					game[player-1] = 2;
					game[player] = 0;
					player --;
				}
			} else if (sel == 2) {
				if (game[6] == 2) {
					System.out.println("더 이상 오른쪽으로 못갑니다.\n");
				} else {
					game[player+1] = 2;
					game[player] = 0;
					player ++;
				}
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
				
	}
	
}
