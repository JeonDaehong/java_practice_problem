package re_solve_the_problem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 풀이시간 : 2021-11-10 19:08 ~ 19:18
/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */


public class ArrayEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		
		final int LOTTO_SIZE = 7;
		
		while (true) {
					
			System.out.println("\n당신은 복권을 구매했습니다. 결과를 확인하세요.");
			System.out.println("'7'이 연속으로 3번 나와야 당첨입니다.");
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			
			int zeroOrOne = 0;
			int cnt 	  = 0;
			
			// 예외
			if (sel < 0 || sel > 3) continue;
			
			// 1번 복권
			else if 	 (sel == 1) {
				cnt = 0;
				for (int i=0; i<LOTTO_SIZE; i++) {
					zeroOrOne = ran.nextInt(2);				// 0 or 1 랜덤
					if 		(zeroOrOne == 0) lotto1[i] = 0;	// 0일 시, 0 추가
					else if (zeroOrOne == 1) lotto1[i] = 7; // 1일 시, 7 추가
				}
				for (int i : lotto1) {
					if 		(i == 0) cnt = 0;
					else if (i == 7) cnt++;
					
					if (cnt == 3) break;	// 7 연속 3개면 break;
					
				}
				System.out.println("[1]번 복권 결과 : " + Arrays.toString(lotto1));
				if (cnt == 3) System.out.println(" [당첨] 입니다.");
				else		  System.out.println(" [꽝] 입니다.");
			}
			
			// 2번 복권
			else if		 (sel == 2) {
				cnt = 0;
				for (int i=0; i<LOTTO_SIZE; i++) {
					zeroOrOne = ran.nextInt(2);
					if 		(zeroOrOne == 0) lotto2[i] = 0;
					else if (zeroOrOne == 1) lotto2[i] = 7;
				}
				for (int i : lotto2) {
					if 		(i == 0) cnt = 0;
					else if (i == 7) cnt++;
					
					if (cnt == 3) break;
					
				}
				System.out.println("[1]번 복권 결과 : " + Arrays.toString(lotto2));
				if (cnt == 3) System.out.println(" [당첨] 입니다.");
				else		  System.out.println(" [꽝] 입니다.");
			}
			
			// 3번 복권
			else if		 (sel == 3) {
				cnt = 0;
				for (int i=0; i<LOTTO_SIZE; i++) {
					zeroOrOne = ran.nextInt(2);
					if 		(zeroOrOne == 0) lotto3[i] = 0;
					else if (zeroOrOne == 1) lotto3[i] = 7;
				}
				for (int i : lotto3) {
					if 		(i == 0) cnt = 0;
					else if (i == 7) cnt++;
					
					if (cnt == 3) break;
					
				}
				System.out.println("[1]번 복권 결과 : " + Arrays.toString(lotto3));
				if (cnt == 3) System.out.println("[당첨] 입니다.");
				else		  System.out.println("[꽝] 입니다.");
			}
			
		}
		
	}
}
