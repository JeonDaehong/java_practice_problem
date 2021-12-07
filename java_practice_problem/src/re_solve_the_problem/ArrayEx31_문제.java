package re_solve_the_problem;

import java.util.Arrays;

// 2021-12-07 19:27 ~ 19:32

/*
 * # 정렬하기
 * 
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */


public class ArrayEx31_문제 {

	public static void main(String[] args) {
		
		int[] scores = {10, 50, 30, 40, 80, 7};
		
		System.out.println("최초 : " + Arrays.toString(scores));
		
		for (int i=0; i<scores.length; i++) {
			int max = 0;
			int maxIdx = -1;
			for (int j=i; j<scores.length; j++) {
				if (scores[j] > max) {
					max = scores[j];
					maxIdx = j;
				}
			}
			int temp = scores[i];
			scores[i] = scores[maxIdx];
			scores[maxIdx] = temp;
			System.out.println("결과 : " + Arrays.toString(scores));
		}

	}

}
