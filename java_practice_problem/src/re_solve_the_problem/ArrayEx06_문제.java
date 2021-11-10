package re_solve_the_problem;

import java.util.Scanner;

//풀이시간 : 2021-11-10 18:30 ~ 18:31

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */



public class ArrayEx06_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		int j = 0;
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.print("학번 : ");
		int hakbun = sc.nextInt();
		for (int i : hakbuns) {
			if (hakbun == i) break;
			j++;
		}
		if (j > 4) System.out.println("해당학번은 존재하지 않습니다.");
		else	   System.out.println("점수 : " + scores[j]);
		
	}
	
}
