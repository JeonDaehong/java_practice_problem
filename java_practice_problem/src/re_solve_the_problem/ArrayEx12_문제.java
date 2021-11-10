package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

//풀이시간 : 2021-11-10 19:48 ~ 19:58

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_문제 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int getIndex1 , getIndex2;
		int getValue1 , getValue2;
		int temp = 0;
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		
		System.out.println("최초 배열 : " + Arrays.toString(arr) + "\n");
		
		System.out.print("인덱스 1 : ");
		getIndex1 = sc.nextInt();
		System.out.print("인덱스 2 : ");
		getIndex2 = sc.nextInt();
		
		// 문제풀이니, 예외문은 배제하였음.
		temp = arr[getIndex1];
		arr[getIndex1] = arr[getIndex2];
		arr[getIndex2] = temp;
		temp = 0;
		
		System.out.println("문제1) [정답 확인] : " + Arrays.toString(arr) + "\n");
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		System.out.print("값 1 : ");
		getValue1 = sc.nextInt();
		System.out.print("값 2 : ");
		getValue2 = sc.nextInt();
		
		// 문제풀이니, 예외문은 배제하였음.
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == getValue1) getIndex1 = i;
			if (arr[i] == getValue2) getIndex2 = i;
		}
		
		temp = arr[getIndex1];
		arr[getIndex1] = arr[getIndex2];
		arr[getIndex2] = temp;
		temp = 0;
		
		System.out.println("문제2) [정답 확인] : " + Arrays.toString(arr) + "\n");
		
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.println("최초 학번 & 점수");
		System.out.println("학번 : " + Arrays.toString(hakbuns));
		System.out.println("점수 : " + Arrays.toString(scores) + "\n");
		
		System.out.print("학번 1 : ");
		int num1 = sc.nextInt();
		System.out.print("학번 2 : ");
		int num2 = sc.nextInt();
		
		// 문제풀이니, 예외문은 배제하였음.
		for (int i=0; i<hakbuns.length; i++) {
			if (hakbuns[i] == num1) getIndex1 = i;
			if (hakbuns[i] == num2) getIndex2 = i;
		}
		
		temp = scores[getIndex1];
		scores[getIndex1] = scores[getIndex2];
		scores[getIndex2] = temp;
		temp = 0;
		
		temp = hakbuns[getIndex1];
		hakbuns[getIndex1] = hakbuns[getIndex2];
		hakbuns[getIndex2] = temp;
		temp = 0;
		
		System.out.println("문제3) [정답 확인] 학번 : " + Arrays.toString(hakbuns));
		System.out.println("문제3) [정답 확인] 점수 : " + Arrays.toString(scores));
		
	}
	
}
