package re_solve_the_problem;
/*
 * # 사다리 게임
 * 
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

import java.util.Scanner;

public class ArrayEx41_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 사다리 백엔드
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}
				};
		
		int x = 0; int y = 0;
		
		// ladder[][] 속 0은 "│"으로 출력
		for (int i=0; i<ladder.length; i++) {
			for (int j=0; j<ladder[i].length; j++) {		// 특수문자 : ㅂ + 한자
				if (ladder[i][j] == 0) {
					System.out.print(" │ ");
				}
				// ladder[][] 속 1은 "│"으로 출력
				else if (ladder[i][j] == 1) {
					// 본인이 좌측 맨 끝에 있지 않으면서, 본인 왼쪽에 1이 있는 경우 "─┤"를 출력해서 이어준다.
					if (j != 0 && ladder[i][j-1] == 1) {
						System.out.print("─┤ ");
					}
					// 본인이 우측 맨 끝에 있지 않으면서, 본인 오른쪽에 1이 있는 경우 "├─"를 출력해서 이어준다.
					else if (j != ladder[i].length - 1 && ladder[i][j+1] == 1){
						System.out.print(" ├─");
					}
				}
			}
			System.out.println();
		}

		// 사다리 이동
		// 어디서 시작할지, 시작 지점 입력 기본은 ladder[0][x]임.
		System.out.print("0~4 입력 : ");
		x = scan.nextInt();
		y = 0;
		
		for (int i=0; i<ladder.length; i++) {
			// 0임
			// y++을 해서 한 칸 아래로 내려주고
			if (ladder[y][x] == 0) {
				y++;
			}
			// 1임
			else if (ladder[y][x] == 1) {
				// 1인데, 본인이 좌측 맨 끝이 아니고, 왼쪽에 1이 또 있으면 x--;로 한 칸 왼쪽으로 이동
				if (x != 0 && ladder[y][x-1] == 1) {
					x--;
				}
				// 1인데, 본인이 우측 맨 끝이 아니고, 오른쪽에 1이 또 있으면 x++;로 한 칸 왼쪽으로 이동
				else if(x != 4 && ladder[y][x+1] == 1) {
					x++;
				}
				// 1이어도 왼쪽도, 오른쪽도 1이 없으면, 그냥 아래로 한 칸 내려주기
				y++;
			}
		}
		
		// 결과 값 출력
		System.out.println("x = " + x);
		//System.out.println("y = " + y);

		scan.close();

	}

}
