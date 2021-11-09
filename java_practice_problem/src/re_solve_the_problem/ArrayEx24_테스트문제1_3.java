package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

//2021-10-05 09:35 ~ 10:19

public class ArrayEx24_테스트문제1_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 	
		// 예) n = {74,82,0,0,0}
		int cnt = 0;
		int[] l = { 10, 20, 30, 40, 50 };
		int[] m = { 13, 54, 17, 42, 1 };
		int[] n = { 0,0,0,0,0};
		for (int i=0; i<l.length; i++) {
			if ((l[i] + m[i]) % 2 == 0) {
				n[cnt] = l[i] + m[i];
				cnt++;
			}
		}
		System.out.println(" n : " + Arrays.toString(n));
		System.out.println();
				
				
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)
		cnt = 0;
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = { 0,0,0 };
		// 예) win[3]= {1002, 1003, 0};
		for (int i=0; i<num.length; i++) {
			if (score[i] >= 60) {
				win[cnt] = num[i];
				cnt++;
			}
		}
		System.out.println(" win : " + Arrays.toString(win));
		System.out.println();
		
		
		// 문제 15) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)
		cnt = 0;
		int[] data = { 1001, 80 , 1002, 23, 1003 , 78 };
		int[] win2 = { 0,0,0 };
		// 예) win2[3] = {1001, 1003, 0};
		for (int i=1; i<data.length; i+=2) {
			if (data[i] >= 60) {
				win2[cnt] = data[i-1];
				cnt++;
			}
		}
		System.out.println(" win2 : " + Arrays.toString(win2));
		System.out.println();
		
	
		// 문제 16) 아래 배열 o 에서 내가 입력한 값만 빼고p 에 저장 
		int num2 = 0;
		int numCnt = -1;
		int[] o = { 10,20,30,40,50 };
		int[] p = { 0,0,0,0,0 };
		// 예) 30 ==> p = {10,20,40,50,0};
		
		System.out.println("입력하시오");
		num2 = scan.nextInt();
		
		for (int i=0; i<o.length; i++) {
			if (o[i] == num2) {
				numCnt = i;
			}
		}
		
		if (numCnt == -1) {
			System.out.println("올바른 값을 입력하시오");
		} else if (numCnt == 0) {
			for (int i=0; i<o.length-1; i++) {
				p[i] = o[i+1];
			}
		} else {
			for (int i=0; i<numCnt; i++) {
				p[i] = o[i];
			}
			for (int i=numCnt; i<o.length-1; i++) {
				p[i] = o[i+1];
			}
		}
		System.out.println(" p : " + Arrays.toString(p));
		System.out.println();
		
		
		
		
		// 문제 17) 아래 배열 q에서 내가 입력한 번호만 빼고 다른 번호와 값을 r 에 저장 
		numCnt = -1;
		cnt = 0;
		int[] q = { 1001, 40, 1002, 65, 1003,  70 };
		int[] r = { 0,0,0,0,0,0 };
		// 예) 1002 ==> r = {1001, 40, 1003, 70 , 0, 0};
		System.out.println("입력하시오");
		num2 = scan.nextInt();
		
		for (int i=0; i<q.length; i++) {
			if (q[i] == num2 && num2 > 1000) {
				numCnt = i;
			}
		}
		
		if (numCnt == -1) {
			System.out.println("올바른 값을 입력하시오");
		} else if (numCnt == 0) {
			for (int i=0; i<q.length-2; i++) {
				r[i] = q[i+2];
			}
		} else {
			for (int i=0; i<numCnt; i++) {
				r[i] = q[i];
			}
			for (int i=numCnt; i<q.length-2; i++) {
				r[i] = q[numCnt+2];
				numCnt++;
			}
		}
		System.out.println(" r : " + Arrays.toString(r));
		System.out.println();
		
		
		// 문제 18)
		num2 = 0;
		cnt = 0;
		int[] arr = {10,20,30,40,50};
		int[] s = new int[5];
		
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 
		
		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
		
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
		
		for (int i=0; i<s.length; i++) {
			System.out.println("입력하시오");
			num2 = scan.nextInt();
			for (int j=0; j<arr.length; j++) {
				if (num2 == arr[j]) {
					s[i] = j;
					cnt = 1;
				}
			}
			if (cnt == 0) {
				s[i] = -1;
			}
			cnt = 0;
		}
		
		System.out.println(" s : " + Arrays.toString(s));
				
		
	}

}
