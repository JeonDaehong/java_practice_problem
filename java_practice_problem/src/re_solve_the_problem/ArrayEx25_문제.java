package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

// 2021-11-30 18:43 ~ 18:47

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 * 
 */


public class ArrayEx25_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int cnt = 0;
		int max = 0;
		int idx = -1;
		while (cnt <= 4) {
			System.out.println(Arrays.toString(arr));
			idx = -1;
			max = 0;
			for (int i=0; i<arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
					idx = i;
				}
			}
			System.out.print("입력 : ");
			int myNum = sc.nextInt();
			if (myNum == max) {
				arr[idx] = 0;
				cnt++;
			}
		}
		System.out.println("Clear ~ 프로그램을 종료합니다!");
	}
}
