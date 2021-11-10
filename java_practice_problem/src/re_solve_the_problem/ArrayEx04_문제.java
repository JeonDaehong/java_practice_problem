package re_solve_the_problem;

import java.util.Arrays;
import java.util.Random;

//풀이시간 : 2021-11-10 18:13 ~ 18:16

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */


public class ArrayEx04_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;
		}
		System.out.println("문제1) 정답확인 : " + Arrays.toString(arr) + "\n");
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int addScore = 0;
		int avrScore = 0;
		for (int i : arr) {
			addScore += i;
		}
		avrScore = addScore/arr.length;
		System.out.println("문제2) 정답확인 (총점) : " + addScore);
		System.out.println("문제2) 정답확인 (평균) : " + avrScore + "\n");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int goodStu = 0;
		for (int i : arr) {
			if (i >= 60) goodStu++;
		}
		System.out.println("문제3) 정답확인 : " + goodStu);

	}
	
}
