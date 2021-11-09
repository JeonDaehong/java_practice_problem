package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

//2021-09-29 18:42 ~ 18:55

/*
 * # 소수 찾기[3단계] (for문)
 * 
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 *    
 */


public class LoopEx26_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 변수를 만든다
		int num = 0;
		int min = 9999999;
		int decimal = 0;
		int cnt = 0;
		
		// 숫자 입력
		System.out.println("원하는 숫자를 입력하시오");
		num = scan.nextInt();
		
		// 입력받은 숫자보다 큰 첫 번째 소수를 출력
		// 반복문을 무한대로 설정하고, 큰 첫 번째 소수를 만나면 break;로 반복문 종료.
		for (int i=2; i>1; i++) {
			for (int j=1; j<=i; j++) {
				if (i%j == 0) {
					decimal ++;
				}
			}
			// decimal이 2이고, 현재값이 내가 입력한 수보다 크고, 현재값이 min보다 작을 경우
			// min에 현재값을 넣어주고, 카운트 변수를 1 늘려준다.
			if (decimal == 2 && i > num && min > i) {
				min = i;
				cnt++;
				break;
			}
			// 이번 i(현잿값)에 해당되는 소수가 없으면, 다시 decimal변수를 0으로 리셋
			decimal = 0;
			// 카운트 변수가 1올라가서 1이되면, 반복문을 종료한다.
			if (cnt == 1) {
				break;
			}
		}
		// 그러면 min에 내가 입력한 값보다 크면서 첫 번째 소수의 값이 저장되어 있다.
		System.out.println("답 : " + min);
		
		scan.close();
		
	}

}
