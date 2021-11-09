package re_solve_the_problem;

import java.util.Iterator;

//2021-09-28 13:13 ~ 13:31

/*
 
 	(for문)
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx25_테스트문제 {

	public static void main(String[] args) {
		
		// 문제 1
		System.out.println("문제 1)");
		for (int i = 1; i <9; i++) {
			if (9*i >= 60 && 9*i < 70) {
			System.out.println("정답 : " + 9*i);
			}
		}

		
		System.out.println();
		
		// 문제 2
		System.out.println("문제 2)");
		int max = 0; // 150보다 작은 최댓값을 저장하기 위한 변수
		for (int i = 1; i <= 150; i++) {
			if (i % 8 == 5) {
				if (max < i) {
					max = i;
				}
			}
		}
		System.out.println("정답 : " + max);

		System.out.println();
		
		// 문제 3
		System.out.println("문제 3)");
		int add = 0;
		for (int i=1; i<100; i++) {
			if (9*i >= 50 && 9*i <= 100) {
				add++;
			}
		}
		System.out.println("정답 : " + add + "개");
		
		System.out.println();
		
		// 문제 4
		System.out.println("문제 4)");
		max = 0;
		for (int i=0; i<=100; i++) {
			if (28*i < 1000 && max < 28*i) {
				max = 28*i;
			}
		}
		System.out.println("정답 : " + max);
		
		System.out.println();
		
		//문제 5
		System.out.println("문제 5)");
		System.out.print("정답 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print(8*i + ", ");
		}
	}

}
