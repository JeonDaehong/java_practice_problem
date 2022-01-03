package re_solve_the_problem;

import java.util.ArrayList;

// 2022-01-03 20:19 ~ 20:24

/*
 *	# 2차원배열 기본문제[1단계]
*/

public class ArrayEx37_문제 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		int add = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				add += arr[i][j];
			}
		}
		System.out.println("정답 1) " + add + "\n");
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					numList.add(arr[i][j]);
				}
			}
		}
		System.out.println("정답 2) " + numList + "\n");
		
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		add = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					add += arr[i][j];
				}
			}
		}
		System.out.println("정답 3) " + add + "\n");
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		int num = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					num++;
				}
			}
		}
		System.out.println("정답 4) " + num + "\n");


	}

}
