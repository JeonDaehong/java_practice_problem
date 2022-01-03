package re_solve_the_problem;

import java.util.ArrayList;

// 2022-01-03 20:10 ~ 20:16

/*

	# 중복 안된 숫자 제거
	
	int[] test1 = {1,2,3,2,1};		
	int[] test2 = {1,3,4,4,2};
	int[] test3 = {1,1,1,2,1};
	
	// 위 배열에서 중복안된숫자를 제거하시오. 
	  
	// 1) test1시험 result 확인 1 2 1 2
	// 2) test2시험 result 확인 4 4
	// 3) test3시험 result 확인 1 1 1 1
 
*/

public class ArrayEx33_문제 {

	public static void main(String[] args) {
		
		ArrayList<Integer> test1List = new ArrayList<>();
		ArrayList<Integer> test2List = new ArrayList<>();
		ArrayList<Integer> test3List = new ArrayList<>();
		
		int[] test1  = {1,2,3,2,1};
		int[] test2  = {1,3,4,4,2};
		int[] test3  = {1,1,1,2,1};
		
		int cnt;
		
		// test1
		for (int i=0; i<5; i++) {
			cnt = 0;
			for (int j=0; j<5; j++) {
				if (test1[i]==test1[j]) {
					cnt ++;
				}
			}
			if (cnt > 1) {
				test1List.add(test1[i]);
			}
		}
		
		// test2
		for (int i=0; i<5; i++) {
			cnt = 0;
			for (int j=0; j<5; j++) {
				if (test2[i]==test2[j]) {
					cnt ++;
				}
			}
			if (cnt > 1) {
				test2List.add(test2[i]);
			}
		}
		
		// test3
		for (int i=0; i<5; i++) {
			cnt = 0;
			for (int j=0; j<5; j++) {
				if (test3[i]==test3[j]) {
					cnt ++;
				}
			}
			if (cnt > 1) {
				test3List.add(test3[i]);
			}
		}
 
		// print
		System.out.println(test1List);
		System.out.println(test2List);
		System.out.println(test3List);
		
	}

}
