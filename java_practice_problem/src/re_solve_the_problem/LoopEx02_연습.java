package re_solve_the_problem;

public class LoopEx02_연습 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 10) {
			
			if (i>= 5 && i <9) {
				System.out.println(i);
			}
			
			i++;
			
		}
		
		System.out.println();
		
		i = 10;
		
		while (i >= 1) {
			
			if (i >= 3 && i <= 6) {
				System.out.println(i);
			}
			
			i--;
		}
		
		System.out.println();
		
		i = 1;
		int cnt = 0; // cnt는 count의 약어
		
		while (i <= 10000) {
		
			if(i % 2 == 1) {
			System.out.println(i);
			cnt++; // 홀수의 갯수를 카운트 하는 함수로 사용
			}
			
			i++;
			
		}
		
		System.out.println("홀수의 갯수 : " + cnt + "개");

	}

}
