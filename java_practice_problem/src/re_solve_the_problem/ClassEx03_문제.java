package re_solve_the_problem;

//풀이시간 : 2021-11-15 19:48 ~ 19:50

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_문제 {

	public static void main(String[] args) {
		
		Ex03 e = new Ex03();
		int add = 0;
		int num = 0;
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		for (int i : e.arr) {
			add += i;
		}
		System.out.println("정답 1) " + add);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		add = 0;
		for (int i : e.arr) {
			if (i % 4 == 0) {
				add += i;
			}
		}
		System.out.println("정답 2) " + add);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		for (int i : e.arr) {
			if (i % 4 == 0) {
				num++;
			}
		}
		System.out.println("정답 3) " + num);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		num = 0;
		for (int i : e.arr) {
			if (i % 2 == 0) {
				num++;
			}
		}
		System.out.println("정답 4) " + num);



	}

}
