package re_solve_the_problem;

import java.util.Arrays;

// 2021-12-07 19:34 ~ 19:37

/*
 * # 석차 출력
 * 
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_문제 {
	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};
		
		for (int i=0; i<scores.length; i++) {
			int max = 0;
			int maxIdx = -1;
			for (int j=i; j<scores.length; j++) {
				if (scores[j] > max) {
					max = scores[j];
					maxIdx = j;
				}
			}
			String temp = names[i];
			names[i] = names[maxIdx];
			names[maxIdx] = temp;
			int temp2 = scores[i];
			scores[i] = scores[maxIdx];
			scores[maxIdx] = temp2;
		}
		
		System.out.println("성적 순서 : " + Arrays.toString(names));
	}
}
