package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

//풀이시간 : 2021-11-27 11:43 ~ 11:48

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = { 10, 4, 5, 3, 1 };
		
		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력
		int add = 0;
		for (int i=0; i<a.length; i++) {
			add += a[i];
		}
		System.out.println("정답 1) " + add + "\n");
		
		
		// 문제 2) 값을 입력하면 인덱스 출력
		// 예) 5 ==> 2  ,  1 ==> 4
		System.out.print("값 입력 : ");
		int num = sc.nextInt();
		
		int idx = -1;
		for (int i=0; i<a.length; i++) {
			if (num == a[i]) {
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("올바른 값을 입력하시오\n");
		} else {
			System.out.println("정답 2) " + idx + "\n");
		}
		
		
		// 문제 3)  인덱스를 입력하면 값 출력
		// 예) 2 ==> 5  , 4 ==> 1
		System.out.print("인덱스 입력 : ");
		idx = sc.nextInt();
		System.out.println("정답 3) " + a[idx] + "\n");
		
		
		// 문제 4) 위 배열중 가장 큰 값 출력 
		// 예) 10
		int max = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("정답 4) " + max + "\n");
		

		
		// 문제 5) 위 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		num = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] % 2 == 1) {
				num++;
			}
		}
		System.out.println("정답 5) " + num + "\n");
		
		
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		int[] b = new int[5];
		for (int i=0; i<a.length; i++) {
			if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		System.out.println("정답 6) " + Arrays.toString(b)+ "\n");
		
		
		
		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터  저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}
		int[] c = new int[5];
		int cnt = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] % 2 == 1) {
				c[cnt] = a[i];
				cnt++;
			}
		}
		System.out.println("정답 6) " + Arrays.toString(c)+ "\n");
		
	}

}
