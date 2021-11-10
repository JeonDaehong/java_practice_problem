package re_solve_the_problem;

import java.util.Arrays;

// 풀이시간 : 2021-11-10 18:08 ~ 18:11

/*
 * # 배열 기본문제
 */

public class ArrayEx03_문제 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		for (int i=0; i<arr.length; i++) {
			arr[i] = 10*(i+1);
		}
		System.out.println("문제1) 정답확인 : " + Arrays.toString(arr) + "\n");
		
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40
		System.out.print("문제2) 정답확인 : ");
		for (int i : arr) {
			if (i % 4 == 0) System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60
		int add = 0;
		for (int i : arr) {
			if (i % 4 == 0) add += i;
		}
		System.out.println("문제3) 정답확인 : " + add + "\n");
		
		
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2
		int cnt = 0;
		for (int i : arr) {
			if (i % 4 == 0) cnt++;
		}
		System.out.println("문제4) 정답확인 : " + cnt + "\n");
		
		
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5
		cnt = 0;
		for (int i : arr) {
			if (i % 2 == 0) cnt++;
		}
		System.out.println("문제5) 정답확인 : " + cnt + "\n");
		
	}
	
}
