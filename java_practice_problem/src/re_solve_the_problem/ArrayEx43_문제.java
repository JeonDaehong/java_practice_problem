package re_solve_the_problem;

/*
 * # 달팽이
 * 
 * 1	2	3	4	5	
 * 16	17	18	19	6	
 * 15	24	25	20	7	
 * 14	23	22	21	8	
 * 13	12	11	10	9
 * 
 * 
 * 1) 오른쪽 방향으로 순서대로 숫자저장
 * 2) 아래쪽 방향으로 순서대로 숫자저장
 * 3) 왼쪽 방향으로 순서대로 숫자저장
 * 4) 윗쪽 방향으로 순서대로 숫자저장
 * 
 * 1)2)3)4) 반복
 */


public class ArrayEx43_문제 {

	public static void main(String[] args) {
		
		int size = 5; // 5x5 사이즈임. 벗어나면 안됨.
		int[][] map = new int[5][5]; // 5x5 사이즈
		boolean[][] check = new boolean[5][5]; // true, false 체크박스
		
		int x = 0;          // 처음엔 x = 0;
		int y = 0;          // 처음엔 y도 = 0;
		int num = 1;        // (x, y) = 0;을 기본으로 넣어줌
		int dir = 1;		// 1(오른쪽) 2(하) 3(왼쪽) 4(상) // 일단 처음에는 오른쪽으로 갈거임.
		
		map[y][x] = num;    // (x, y)의 값
		check[y][x] = true; // (x, y)에 숫자가 완성되어 있는지? / 일단 처음 (0, 0)을 1넣고, true로 만들어준것임.
		
		// 본격적으로 시작 (0,0은 이미 정해져있기때문에 i=1 <25로 해도됨.
		for(int i=0; i<24; i++) {
			
			int yy = y; // 처음엔 yy = 0;
			int xx = x; // 처음엔 xx = 0;
			
			if      (dir == 1)  xx = xx + 1; // 우 1 (x+1)
			else if (dir == 2)  yy = yy + 1; // 하 1 (y+1)
			else if (dir == 3) 	xx = xx - 1; // 좌 1 (x-1)
			else if (dir == 4) 	yy = yy - 1; // 상 1 (y-1)
			
			// xx가 5보다 크거나 같거나 || xx가 0보다 작거나 || yy가 5보다 크거나 같거나, || yy가 0보다 작거나
			// 해당 자리가 ture가 되면
			if (size <= xx || xx < 0 || size <= yy || yy < 0 || check[yy][xx] == true) {
				
				dir = dir + 1; // 방향을 달팽이 방향으로 꺾어줌
				yy = y;        // yy에는 y값을 넣고 (왜넣지?)
				xx = x;        // xx에는 x값을 넣어줌 (왜넣을까?)
				
				if (dir == 5) 		dir = 1; // dir가 5가되면 다시 1로 복귀
				
				if 		(dir == 1) 	xx = xx + 1; // 우 1 (x+1)
				else if (dir == 2) 	yy = yy + 1; // 하 1 (y+1)
				else if (dir == 3) 	xx = xx - 1; // 좌 1 (x-1)
				else if (dir == 4) 	yy = yy - 1; // 상 1 (y-1)
				
			}
			
			num++; // 1 다음엔 2를 넣어야되고, 2 다음엔 3을 넣어야됨.
			
			y = yy;
			x = xx;
			
			map[y][x] = num; // 그 반영된 값을 넣고
			check[y][x] = true; // true로 바꿔줌,
			
			System.out.println("y =  " + y + ", x = " + x);
			
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(check[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}

}
