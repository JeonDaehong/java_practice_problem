package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

// 2021-10-05 20:40 ~ 20:49

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int cnt = 0;
	
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		System.out.print("값 입력 : ");
		num = sc.nextInt();
		for (int i=0; i<d.length; i++) {
			if (d[i] != num) {
				e[cnt] = d[i];
				cnt++;
			}
		}
		System.out.println("정답8) : " + Arrays.toString(e));
		
		
		
		cnt = 0;
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 g에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		System.out.print("번호 입력 : ");
		num = sc.nextInt();
		System.out.print("값 입력 : ");
		int num2 = sc.nextInt();
		for (int i=0; i<f.length; i++) {
			if (f[i] != num && f[i] != num2) {
				g[cnt] = f[i];
				cnt++;
			}
		}
		System.out.println("정답9) : " + Arrays.toString(g));
		
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		System.out.print("번호 입력 : ");
		num = sc.nextInt();
		for (int i=1; i<h.length; i++) {
			h[i-1] = h[i];
		}
		h[h.length-1] = num;
		System.out.println("정답10) : " + Arrays.toString(h));
		
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		System.out.print("번호 입력 : ");
		num = sc.nextInt();
		for (int j=i.length-1; j>0; j--) {
			i[j] = i[j-1];
		}
		i[0] = num;
		System.out.println("정답11) : " + Arrays.toString(i));
		
		
		sc.close();
		
	}

}
