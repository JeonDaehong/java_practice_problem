package re_solve_the_problem;

import java.util.Arrays;
import java.util.Random;

//2021-11-30 19:48 ~ 19:51

/*
 * # 중복숫자 금지[2단계]
 * 
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */


public class ArrayEx28_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
			for (int j=0; j<i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
