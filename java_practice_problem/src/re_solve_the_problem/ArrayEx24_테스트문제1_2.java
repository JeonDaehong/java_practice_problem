package re_solve_the_problem;

import java.util.Arrays;
import java.util.Scanner;

//2021-10-05 09:00 ~ 09:30

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int cnt = -1;
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		System.out.println("값입력");
		num = scan.nextInt();
		for (int i=0; i<d.length; i++) {
			if (num == d[i]) {
				cnt = i;
			}
		}
		if (cnt == -1) {
			System.out.println("올바른 값을 입력하시오");
		} else if (cnt == 0) {
			for (int i=1; i<d.length; i++) {
				e[i-1] = d[i];
			}
		} else {
			for (int i = 0; i<cnt; i++) {
				e[i] = d[i];
			}
			for (int i=cnt+1; i<d.length; i++) {
				e[i-1] = d[i];
			}
		}
		System.out.println(" e : " + Arrays.toString(e));
		System.out.println();
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 g에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		cnt = -1;
		System.out.println("입력하시오");
		num = scan.nextInt();
		
		for (int i=0; i<f.length; i++) {
			if (num == f[i] && num > 1000) {
				cnt = i;
			}
		}
		
		if (cnt == -1) {
			System.out.println("제대로 고르시오");
		} else if (cnt == 0) {
			for (int i=0; i<f.length-2; i++) {
				g[i] = f[cnt+2];
				cnt++;
			}
		} else {
			for (int i=0; i<cnt; i++) {
				g[i] = f[i];
			}
			for (int i=cnt; i<f.length-2; i++) {
				g[i] = f[cnt+2];
				cnt++;
			}
		}
		System.out.println(" g : " + Arrays.toString(g));
		System.out.println();
		
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		System.out.println("입력하시오");
		num = scan.nextInt();
		
		for (int i=0; i<h.length-1; i++) {
			h[i] = h[i+1];
		}
		h[h.length-1] = num;
		
		System.out.println(" h : " + Arrays.toString(h));
		System.out.println();
		
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		System.out.println("입력하시오");
		num = scan.nextInt();
		
		for (int n=h.length-1; n>1; n--) {
			i[n] = i[n-1];
		}
		i[0] = num;
		
		System.out.println(" i : " + Arrays.toString(i));
		System.out.println();
		
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		int n = 4;
		for (int l=0; l<j.length; l++) {
			k[n] = j[l];
			n--;
		}
		System.out.println(" k : " + Arrays.toString(k));
		
		
		scan.close();
		
	}

}
