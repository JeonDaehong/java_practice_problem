package re_solve_the_problem;

import java.util.Scanner;

//2021-09-29 19:05 ~ 19:10

/*
 * 
 *  # 삼각형 출력하기 (for문)
 * 
 *         1
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7
 *  8 8 8 8 8 8 8 8
 * 9 9 9 9 9 9 9 9 9 
 * 
*/

public class LoopEx28_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 숫자로 탑을 만들자!");
		int num = scan.nextInt();

		for(int i=1; i<=num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
