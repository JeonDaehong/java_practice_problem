package re_solve_the_problem;

import java.util.Scanner;

//2021-11-30 19:13 ~ 19:35

/*
 * # 숫자이동[2단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

public class ArrayEx27_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = {0,0,1,0,2,0,0,1,0};
		int idx = 4;
		
		while (true) {
			
			// 프론트
			for (int i=0; i<game.length; i++) {
				if (game[i] == 0) {
					System.out.print("ㅡㅡㅡ");
				} else if (game[i] == 1) {
					System.out.print("ㅡㅣㅡ");
				} else {
					System.out.print("옷");
				}
			}
			
			System.out.println("입력 : ");
			int sel = sc.nextInt();
			
			if (sel < 0 || sel > 3) {
				continue;
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			} else if (sel == 1) {
				if (game[0] == 2) {
					System.out.println("더 이상 왼쪽으로 못갑니다.");
				} else if (game[idx-1] == 1) {
					System.out.println("벽이 있습니다.");
				} else {
					game[idx] = 0;
					game[idx-1] = 2;
					idx--;
				}
			} else if (sel == 2) {
				if (game[8] == 2) {
					System.out.println("더 이상 오른쪽으로 못갑니다.");
				} else if (game[idx+1] == 1) {
					System.out.println("벽이 있습니다.");
				} else {
					game[idx] = 0;
					game[idx+1] = 2;
					idx++;
				}
			} else if (sel == 3) {
				if (game[idx-1] == 1) {
					System.out.println("벽을 파괴했습니다.");
					game[idx-1] = 0;
				} else if (game[idx+1] == 1) {
					System.out.println("벽을 파괴했습니다.");
					game[idx+1] = 0;
				} else {
					System.out.println("파괴할 벽이 없습니다.");
				}
			}
			
		}
		
	}
	
}
