package re_solve_the_problem;

//풀이시간 : 2021-11-10 18:37 ~ 18:39

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_문제 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		int max = 0;
		int idx = -1;
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		for (int i=0; i<scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				idx = i;
			}
		}
		
		System.out.println("[정답 확인] 1등 학생 : " + hakbuns[idx] + "번 / 점수 : " + scores[idx] + "점");
		
	}
	
}
