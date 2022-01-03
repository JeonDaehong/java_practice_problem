package re_solve_the_problem;

import java.util.Scanner;

// 2022-01-03 20:37 ~ 20:51

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		int idx1 = sc.nextInt();
		int idx2 = sc.nextInt();
		System.out.println("정답 1) " + arr[idx1][idx2] + "\n");
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		int num = sc.nextInt();
		idx1 = -1;
		idx2 = -1;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (num == arr[i][j]) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		if (idx1 == -1 || idx2 == -2) {
			System.out.println("정답 2) 없는 값입니다.");
		} else {
			System.out.println("정답 2) idx1 = " + idx1 + " / idx2 = " + idx2 + "\n");
		}
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0;
		idx1 = -1;
		idx2 = -1;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("정답 3) idx1 = " + idx1 + " / idx2 = " + idx2 + "\n");
		
		// 문제 4) 값 2개를 입력받아 값 교체
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		idx1 = -1;
		idx2 = -1;
		int idx3 = -1;
		int idx4 = -1;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] == number1) {
					idx1 = i;
					idx2 = j;
				}
				if (arr[i][j] == number2) {
					idx3 = i;
					idx4 = j;
				}
			}
		}
		if (idx1 == -1 || idx2 == -1 || idx3 == -1 || idx4 == -1) {
			System.out.println("정답 4) 없는 값입니다.");
		} else {
			arr[idx1][idx2] = number2;
			arr[idx3][idx4] = number1;			
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}


	}

}
