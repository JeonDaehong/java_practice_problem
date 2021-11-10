package re_solve_the_problem;

import java.util.Arrays;

// 풀이시간 : 2021-11-10 20:10 ~ 20:12

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 4의 배수만큼 temp 배열을 생성한뒤에 
 *   arr배열의 4의 배수들을  temp로 옮겨닮아보시오.
 * 
 */

public class ArrayEx13_문제 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int cnt = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 4 == 0) cnt++;
		}
		
		temp = new int[cnt];
		
		int j = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		System.out.println("[정답 확인] : " + Arrays.toString(temp));
		
	}
	
}
