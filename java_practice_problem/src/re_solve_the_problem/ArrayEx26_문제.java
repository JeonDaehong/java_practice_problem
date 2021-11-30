package re_solve_the_problem;

import java.util.Scanner;

// 2021-11-30 18:50 ~ 18:59


/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


public class ArrayEx26_문제 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		int cnt = 0;
		
		for (int i=0; i<SIZE; i++) {
			front[i] = i+1;
			back[i] = (i+9);
		}
		
		while (true) {
			
			// 프론트
			for (int i=0; i<front.length; i++) {
				if (front[i] == 0) {
					System.out.print("   ");
				} else {
					System.out.print(front[i] + "  ");
					
				}
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			
			System.out.println("숫자 입력 : ");
			int num = sc.nextInt();
			
			for (int i=0; i<SIZE; i++) {
				if (num == front[i]) {
					if (cnt < SIZE) {
						front[i] = back[cnt];
						cnt++;
					} else {
						front[i] = 0;
						cnt++;
					}
				}
			}
			
			if (cnt == 18) {
				System.out.println("승리 !");
				break;
			}
			
		}
		
	}
	
}
