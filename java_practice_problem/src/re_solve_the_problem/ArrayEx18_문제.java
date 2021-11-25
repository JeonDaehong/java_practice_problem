package re_solve_the_problem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//풀이시간 : 2021-11-25 19:03 ~ 19:20

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int win1 = 0;	int win2 = 0;				
		
		// 게임 시작
		while (true) {
			
			// 프론트
			System.out.println("Game : " + Arrays.toString(game));
			System.out.println("p1   : " + Arrays.toString(p1));
			System.out.println("p2   : " + Arrays.toString(p2));
			
			if (turn % 2 == 0) {
				System.out.println("이동(1~3) : ");
				int me = sc.nextInt();
				p1[idx1] = 0;
				idx1 += me;
				if (idx1 > 7) {
					idx1 -= 8;
					win1++;
				}
				p1[idx1] = 1;
				
				if (idx1 == idx2) {
					p2[idx2] = 0;
					idx2 = 0;
					p2[idx2] = 2;
					System.out.println("컴퓨터를 잡았습니다.\n");
				}
				
				turn++;
				
			} else {
				System.out.println("컴퓨터의 차례입니다.\n");
				int com = ran.nextInt(3)+1;
				p2[idx2] = 0;
				idx2 += com;
				if (idx2 > 7) {
					idx2 -= 8;
					win2++;
				}
				p2[idx2] = 2;
				System.out.println("컴퓨터는 " + com + "칸 움직였습니다.\n");
				
				if (idx1 == idx2) {
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = 1;
					System.out.println("컴퓨터에게 잡혔습니다.\n");
				}
				
				turn++;
			}
			
			if (win1 == 3) {
				System.out.println("플레이어가 승리하였습니다.");
				break;
			} else if (win2 == 3) {
				System.out.println("컴퓨터가 승리하였습니다.");
				break;
			}
		}
	}
}
