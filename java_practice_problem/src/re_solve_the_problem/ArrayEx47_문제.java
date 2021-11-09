package re_solve_the_problem;

import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx47_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 상수 설정
		final int SIZE = 7;		// Map 크기는 7x7
		final int PLAYER = 2;	// 플레이어는 백엔드에서 '2'로 표현
		final int BALL = 3;		// 공은 백엔드에서 '3'으로 표현
		final int GOAL = 7;		// 골 지점은 백엔드에서 '7'로 표현
		final int WALL = 9;		// 벽은 백엔드에서 '9'로 표현
		
		// 맵 크기는 7x7
		int[][] map = new int[SIZE][SIZE];
		
		// 변수
		int wallCount = 0;		// 벽 갯수 선정
		int pY = 0;				// 플레이어 위치 (Y 좌표) 선정
		int pX = 0;				// 플레이어 위치 (X 좌표) 선정
		int ballY = 0;			// 공 위치 (Y 좌표) 선정
		int ballX = 0;			// 공 위치 (X 좌표) 선정
		int goalY = 0;			// 골 지점 (Y 좌표) 선정
		int goalX = 0;			// 골 지점 (X 좌표) 선정
		
		// 벽 설치
		System.out.print(">>>설치할 벽의 개수를 입력하세요 : ");
		wallCount = scan.nextInt();
		
		// 원하는 갯수만큼 설치
		// (벽의 갯수를 0 미만으로 하거나 최대갯수도 못넘기게 설정 해줄 것)
		int temp = wallCount;			// 일단 임시로 temp에 넘겨주고
		while (temp != 0) {				// 반복문 시작
			int rY = ran.nextInt(SIZE); // 벽의 Y값과
			int rX = ran.nextInt(SIZE); // 벽의 X값을 랜덤으로 선정한다.
			
			if (map[rY][rX] == 0) {		// 백엔드상 x,y 좌표에 벽이 없으면 (0)
				map[rY][rX] = WALL;		// 거기에 벽을 설치하고 (WALL == 9)
				temp = temp - 1;		// 앞으로 설치해야되는 벽의 갯수를 줄여줌.
			}							// 이렇게 temp(설치해야되는 벽의 갯수)가 0이되면, 반복문 종료
		}
		
		// 공 설치
		while (true) {
			// x,y좌표 랜덤으로 입력 : 대신 벽으로 가면 못 미니까 1~5까지만
			int rY = ran.nextInt(SIZE - 2) + 1;
			int rX = ran.nextInt(SIZE - 2) + 1;
			
			// 그 위치에 볼 생성 (대신 백엔드 숫자가 0이어야 함)
			if(map[rY][rX] == 0) {
				map[rY][rX] = BALL;
				ballY = rY;
				ballX = rX;
				break;
			}
		}
		
		// 골대 설치
		while (true) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			
			//(대신 백엔드 숫자가 0이어야 함)
			if (map[rY][rX] == 0) {
				map[rY][rX] = GOAL;
				goalY = rY;
				goalX = rX;
				break;
			}
		}
		
		// 화면 출력 (미리 한 번 출력 해줌 : 편의상)
		for (int i=0; i<SIZE; i++) {
			for (int j=0; j<SIZE; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		// 플레이어 배치
		while (true) {
			System.out.println(">>>플레이어의 위치를 선택하세요.");
			System.out.print("y좌표 입력 : ");
			pY = scan.nextInt();
			
			System.out.print("x좌표 입력 : ");
			pX = scan.nextInt();
			
			//(대신 백엔드 숫자가 0이어야 함)
			if (map[pY][pX] == 0) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		
		// 게임 시작
		while (true) {
			// 화면 출력
			System.out.println("---------------");
			for (int i=0; i<SIZE; i++) {
				for (int j=0; j<SIZE; j++) {
					if (map[i][j] == PLAYER) 	System.out.print("옷 ");
					else if(map[i][j] == WALL) 	System.out.print("! ");
					else if(map[i][j] == GOAL) 	System.out.print("G ");
					else if(map[i][j] == BALL) 	System.out.print("* ");
					else 						System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("---------------");
			
			// 골대에 공을 넣으면 게임 종료
			if (ballY == goalY && ballX == goalX) {
				System.out.println("게임종료");
				break;
			}
			
			System.out.print("상(1)하(2)좌(3)우(4) 입력 : ");
			int move = scan.nextInt();
		
			// 현재위치 임시로 저장하기
			int yy = pY;
			int xx = pX;
			
			if		(move == 1) yy--;
			else if (move == 2) yy++;
			else if (move == 3) xx--;
			else if (move == 4) xx++;
			
			// 예외처리
			if (SIZE <= xx || xx < 0) 					 	continue; // 바깥 못나감
			if (SIZE <= yy || yy < 0) 					 	continue; // 바깥 못나감
			if (map[yy][xx] == WALL || map[yy][xx] == GOAL) continue; // 벽, 골대 통과 x
			
			// 공을 만나면
			if (map[yy][xx] == BALL) {
				// 공 위치 임시로 저장하기
				int yyy = ballY;
				int xxx = ballX;
				if		(move == 1) yyy--;
				else if (move == 2) yyy++;
				else if (move == 3) xxx--;
				else if (move == 4) xxx++;

				// 예외처리
				if (SIZE <= xxx || xxx < 0) continue;
				if (SIZE <= yyy || yyy < 0) continue;
				if (map[yyy][xxx] == WALL)  continue;
				
				// 공 이동시키기
				map[ballY][ballX] = 0;
				ballY = yyy;
				ballX = xxx;
				map[ballY][ballX] = BALL;
			}
			
			// 캐릭터 이동시키기
			map[pY][pX] = 0;
			pY = yy;
			pX = xx;
			map[pY][pX] = PLAYER;
			
		}

		scan.close();
		
	}

}
