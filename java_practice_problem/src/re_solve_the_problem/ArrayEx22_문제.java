package re_solve_the_problem;

import java.util.Scanner;

// 풀이시간 : 2021-11-25 19:42 ~ 19:53

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  20번 21번 22번의 문제를 한 코드로 병합하여 보자.
 * 
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 * 
 *  정답 없음
 */


public class ArrayEx22_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
			System.out.print("arr : ");
			for (int i=0; i<elementCnt; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.println();
			
			System.out.println("\n1추가");
			System.out.println("2삭제");
			System.out.println("3삽입");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu < 1 || selectMenu > 4) {
				continue;
				
			} else if (selectMenu == 1) {
				if (elementCnt == 5) {
					System.out.println("더이상 추가 x");
				} else {
					System.out.println("추가할 숫자 : ");
					int add = scan.nextInt();
					arr[elementCnt] = add;
					elementCnt++;
				}
				
			} else if (selectMenu == 2) {
				if (elementCnt == 0) {
					System.out.println("더이상 삭제 x");
				} else if (elementCnt == 1) {
					arr[0] = 0;
					elementCnt --;
				} else {
					System.out.println("삭제할 인덱스 : ");
					int idx = scan.nextInt();
					arr[idx] = 0;
					for (int i=idx; i<elementCnt-1; i++) {
						arr[i] = arr[i+1];
					}
					arr[elementCnt-1] = 0;
					elementCnt--;
				}
				
			} else if (selectMenu == 3) {
				if (elementCnt == 5) {
					System.out.println("더이상 추가 x");
				} else {
					System.out.println("추가할 숫자 : ");
					int add = scan.nextInt();
					System.out.println("추가할 인덱스 : ");
					int idx = scan.nextInt();
					
					for (int i=elementCnt-1; i>=idx; i--) {
						arr[i+1] = arr[i];
					}
					arr[idx] = add;
					elementCnt++;
				}
				
			} else if (selectMenu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}
	
}
