package re_solve_the_problem;

import java.util.Scanner;

//풀이시간 : 2021-11-10 18:18 ~ 18:23

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

public class ArrayEx05_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		while (true) {
			System.out.print("Index : ");
			int idx = sc.nextInt();
			if (idx < 0 || idx > 4) continue;
			else {
				System.out.println("문제1) 정답확인 : " + arr[idx] + "\n");
				break;
			}
		}
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		int j = 0;
		while (true) {
			System.out.print("성적 : ");
			int grade = sc.nextInt();
			j = 0;
			for (int i : arr) {
				if (i == grade) break;
				j++;
			}
			if (j == 5) continue;
			else {
				System.out.println("문제2) 정답확인 : 인덱스 " + j + "\n");
				break;
			}
		}
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		while (true) {
			System.out.print("학번 : ");
			int hakbun = sc.nextInt();
			j = 0;
			for (int i : hakbuns) {
				if (hakbun == i) break;
				j++;
			}
			if (j == 5) continue;
			else {
				System.out.println("문제3) 정답확인 : " + scores[j]);
				break;
			}
		}
	}
}
