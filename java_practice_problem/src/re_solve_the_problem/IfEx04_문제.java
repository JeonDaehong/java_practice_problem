package re_solve_the_problem;

import java.util.Scanner;

//2021-11-30 20:58 ~ 20:59

/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 * 
 */


public class IfEx04_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID : ");
		int myId = sc.nextInt();
		System.out.print("PW : ");
		int myPw = sc.nextInt();
		
		if (myId == dbId && myPw == dbPw) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}


	}

}
